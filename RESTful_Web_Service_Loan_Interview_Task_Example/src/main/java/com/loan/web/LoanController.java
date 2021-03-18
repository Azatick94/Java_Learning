package com.loan.web;

import com.loan.model.Loan;
import com.loan.service.BlackListService;
import com.loan.service.LoanService;
import com.loan.web.forms.Error;
import com.loan.web.forms.Result;
import com.loan.web.forms.Success;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
public class LoanController {

    private final LoanService loanService;
    private final BlackListService blacklists;

    public LoanController(LoanService loanService, BlackListService blacklists) {
        this.loanService = loanService;
        this.blacklists = blacklists;
    }

    @GetMapping("/")
    public String startPage() {
        log.info("Entering startPage");
        return "List of REST commands:" +
                " [ /loans - get all loans ]" +
                " [ /loans_by_user - get loans by user ]" +
                " [ /submit_loan - submit new loan ]";
    }

    @GetMapping("/loans")
    public String getAllLoans() {
        log.info("Entering getAllLoans");
        return loanService.getAll().toString();
    }

    @GetMapping("/loans/{personId}")
    public List<Loan> getLoanByUser(@PathVariable int personId) {
        log.info("Entering getLoanByUser");
        return loanService.getByPerson(personId);
    }

    @PostMapping("/submit_loan")
    public Result postLoan(@RequestBody Loan loan) {
        log.info("Entering postLoan");

        final Result result;
        if (!this.blacklists.isBlackListPerson(loan.getPerson().getId())) {
            result = new Success<>(this.loanService.apply(loan));
        } else {
            result = new Error(String.format("User %s in blacklist", loan.getPerson().getId()));
        }
        return result;
    }
}
