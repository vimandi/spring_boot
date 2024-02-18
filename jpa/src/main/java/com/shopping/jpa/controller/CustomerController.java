package com.shopping.jpa.controller;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.repository.CustomerRepository;
import com.shopping.jpa.repository.ProductRepository;
import com.shopping.jpa.service.CustomerService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> customers() {
        List<Customer> customerList = customerService.fetchAllCustomers();
        return customerList;
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> customer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/customer/{customerId}")
    public ResponseEntity<Customer> customer(@RequestBody Customer customer, @PathVariable Integer customerId) {
        customer.setId(customerId);
        Customer newCustomer =  customerService.saveCustomer(customer);
        if (newCustomer != null) {
           return new ResponseEntity<>(newCustomer, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{customerId}")
    public ResponseEntity<Void> customer(@PathVariable Integer customerId) {
        boolean deleted = customerService.deleteCustomer(customerId);
        if(deleted){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
