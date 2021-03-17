package com.loan.repository;

import com.loan.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Integer> {
//    Loan apply(Loan loan);
//
//    List<Loan> getAll();
//
//    List<Loan> getByPerson(int personId);
}
