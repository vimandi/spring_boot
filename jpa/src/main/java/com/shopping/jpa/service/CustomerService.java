package com.shopping.jpa.service;

import com.shopping.jpa.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public List<Customer> fetchAllCustomers();

    public Customer saveCustomer(Customer customer);

    boolean deleteCustomer(Integer customerId);
}
