package com.pm.batchprocessingdemo.config;

import com.pm.batchprocessingdemo.model.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {


    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
