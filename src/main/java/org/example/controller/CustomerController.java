package org.example.controller;

import org.example.pojo.Customer;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    Service service;
    @RequestMapping("/getAll")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @RequestMapping("/getById")
    public Customer getById(Integer id){
        return service.getById(id);
    }
    @RequestMapping("/insert")
    public Integer insert(Customer customer){
        return service.insert(customer);
    }
}
