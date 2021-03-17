package com.loan.service;

import com.loan.model.Loan;
import com.loan.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LoanServiceTest {

    @Autowired
    LoanService loanService;

    @Test
    public void showAllLoanTest() {
        List<Loan> calculated = loanService.getAll();

        List<Loan> expected = new ArrayList<>();
        expected.add(new Loan(1, 1000000d, 12, new Person(1, "Azat", "Burkhanov")));
        expected.add(new Loan(2, 2000000d, 24, new Person(2, "Petr", "Petrov")));
        expected.add(new Loan(3, 3000000d, 36, new Person(3, "Sidr", "Sidrov")));

        assertThat(calculated).isEqualTo(expected);
    }
}