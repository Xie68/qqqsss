package org.example.service;

import org.example.pojo.Customer;

import java.util.List;

public interface Service {
    List<Customer> getAll();
    Customer getById(Integer id);
    int insert(Customer customer);
}
