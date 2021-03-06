package com.loan.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

/**
 * Loan Model to get info about loan, apply to loan etc.
 */
@Entity
@Table(name = "loans")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Integer id;

    @Column(name = "amount")
    private Double amount;

    //    Amount of months
    @Column(name = "term")
    private Integer term;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Loan(double amount, int term, Person person) {
        this();
        this.amount = amount;
        this.term = term;
        this.person = person;
    }
}
