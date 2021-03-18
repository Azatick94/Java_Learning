package com.loan.web;

import com.loan.model.Loan;
import com.loan.service.LoanServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
public class LoanController {

    private final LoanServiceImpl loanService;

    public LoanController(LoanServiceImpl loanService) {
        this.loanService = loanService;
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
    public List<Loan> getAllLoans() {
        log.info("Entering getAllLoans");
        return loanService.getAll();
    }

    @GetMapping("/loans/{personId}")
    public List<Loan> getLoanByUser(@PathVariable int personId) {
        log.info("Entering getLoanByUser");
        return loanService.getByPerson(personId);
    }

    @PostMapping("/submit_loan")
    public void postLoan() {
        log.info("Entering postLoan");
    }


}
