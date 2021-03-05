package org.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.customerdemo.model.Customer;
import org.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getBy {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl findAll command");
        return customerRepository.findAll();
    }
}
