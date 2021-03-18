package com.loan.repository;

import com.loan.model.Loan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Integer> {

    @Query("SELECT l FROM Loan l WHERE l.person.id = :#{#person_id}")
    List<Loan> findByPersonId(@Param("person_id") int personId);
}
