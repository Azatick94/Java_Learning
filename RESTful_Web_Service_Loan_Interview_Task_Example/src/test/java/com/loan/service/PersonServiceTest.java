package com.loan.service;

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
class PersonServiceTest {

    @Autowired
    PersonService personService;

    @Test
    public void getAllTest() {
        List<Person> calculated = personService.getAll();

        List<Person> expected = new ArrayList<>();
        expected.add(new Person(1, "Azat", "Burkhanov"));
        expected.add(new Person(2, "Petr", "Petrov"));
        expected.add(new Person(3, "Sidr", "Sidrov"));

        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    public void getByIdTest() {
        Person calculated = personService.getById(1);
        Person expected = new Person(1, "Azat", "Burkhanov");

        assertThat(calculated).isEqualTo(expected);
    }


}