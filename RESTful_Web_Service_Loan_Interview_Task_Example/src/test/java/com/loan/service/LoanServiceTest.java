package com.loan.service;

import com.loan.model.Loan;
import com.loan.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Sql(scripts = "classpath:db_sql/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
class LoanServiceTest {

    @Autowired
    LoanService loanService;

    @Autowired
    PersonService personService;

    @Test
    public void applyLoanTest() {

        Loan newLoan = new Loan();
        newLoan.setAmount(100d);
        newLoan.setTerm(12);
        newLoan.setPerson(personService.getById(1));

        Loan calculatedLoan = loanService.apply(newLoan);
        Loan expectedLoan = new Loan(4, 100d, 12, new Person(1, "Azat", "Burkhanov"));

        assertThat(calculatedLoan).isEqualTo(expectedLoan);
    }

    @Test
    public void showAllLoanTest() {
        List<Loan> calculated = loanService.getAll();

        List<Loan> expected = new ArrayList<>();
        expected.add(new Loan(1, 1000000d, 12, new Person(1, "Azat", "Burkhanov")));
        expected.add(new Loan(2, 2000000d, 24, new Person(2, "Petr", "Petrov")));
        expected.add(new Loan(3, 3000000d, 36, new Person(3, "Sidr", "Sidrov")));

        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    public void showLoanByPersonId() {
        List<Loan> personCalculated = loanService.getByPerson(3);

        List<Loan> personExpected = new ArrayList<>();
        personExpected.add(new Loan(3, 3000000d, 36, new Person(3, "Sidr", "Sidrov")));

        assertThat(personCalculated).isEqualTo(personExpected);
    }
}