package com.loan.service;

import com.loan.model.Person;
import com.loan.repository.BlackListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlackListServiceImpl implements BlackListService {
    private final BlackListRepository repository;

    @Autowired
    public BlackListServiceImpl(final BlackListRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isBlackListPerson(int personId) {
        Person person = new Person();
        person.setId(personId);
        return this.repository.findByPerson(person) != null;
    }
}
