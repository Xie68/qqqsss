package org.example;

import org.example.pojo.Customer;

public class Test {
    @org.junit.Test
    public void testData(){
        System.out.println(new Customer().toString());
    }
}
