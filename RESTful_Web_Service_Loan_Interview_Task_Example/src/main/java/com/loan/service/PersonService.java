package com.loan.service;

import com.loan.model.Person;
import com.loan.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getById(int id) {
        return personRepository.getPeopleById(id);
    }

}
