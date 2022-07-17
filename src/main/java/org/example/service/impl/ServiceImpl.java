package org.example.service.impl;

import org.example.mapper.Mapper;
import org.example.pojo.Customer;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    Mapper mapper;

    @Override
    public List<Customer> getAll() {
        return mapper.getAll();
    }

    @Override
    public Customer getById(Integer id) {
        return mapper.getById(id);
    }

    @Override
    public int insert(Customer customer) {
        return mapper.insert(customer);
    }
}
