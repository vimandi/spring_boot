package com.shopping.jpa.controller;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.entity.Product;
import com.shopping.jpa.repository.CustomerRepository;
import com.shopping.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/getAllProducts")
    public List<Product> getProducts() {
        System.out.println(productRepository.findAll());
        return productRepository.findAll();
    }

}
