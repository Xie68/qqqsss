package org.example.mapper;

import org.example.pojo.Customer;

import java.util.List;

public interface Mapper {
    List<Customer> getAll();
    Customer getById(Integer id);
    int insert(Customer customer);
}
