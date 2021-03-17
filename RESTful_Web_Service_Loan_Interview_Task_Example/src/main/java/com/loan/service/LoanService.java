package com.loan.service;

import com.loan.model.Loan;
import com.loan.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAll() {
        return (List<Loan>) loanRepository.findAll();
    }
}
