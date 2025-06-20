package com.pm.batchprocessingdemo.repository;

import com.pm.batchprocessingdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
