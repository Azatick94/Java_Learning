package com.loan.service;

import com.loan.model.Loan;
import com.loan.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Override
    public Loan apply(Loan loan) {
        return loanRepository.save(loan);
    }

    /**
     * list all approved loans
     *
     * @return
     */
    public List<Loan> getAll() {
        return (List<Loan>) loanRepository.findAll();
    }

    /**
     * list all approved loans by user
     *
     * @param personId
     * @return
     */
    @Override
    public List<Loan> getByPerson(int personId) {
        return loanRepository.findByPersonId(personId);
    }
}
