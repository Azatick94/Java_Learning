package com.loan.repository;

import com.loan.model.BlackList;
import com.loan.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackListRepository extends CrudRepository<BlackList, Integer> {
    BlackList findByPerson(Person person);
}
