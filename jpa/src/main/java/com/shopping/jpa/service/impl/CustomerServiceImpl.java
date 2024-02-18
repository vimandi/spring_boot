package com.shopping.jpa.service.impl;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.repository.CustomerRepository;
import com.shopping.jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> fetchAllCustomers() {
        return customerRepository.findAll();
    }

    //    @Override
    public Customer saveCustomer(Customer customer) {

        if(customer.getId() == null || customer.getId()==0 ){
            return customerRepository.save(customer);
        }else{
            Optional<Customer> customerOptional = customerRepository.findById(customer.getId());
            if (customerOptional.isPresent()) {
                Customer customerEntity = customerOptional.get();
                customerEntity.setEmail(customer.getEmail());
                customerEntity.setAddress(customer.getAddress());
                customerEntity.setFirstName(customer.getFirstName());
                customerEntity.setLastName(customer.getLastName());
                return  customerRepository.save(customerEntity);
            } else {
                return null;
            }
        }
    }

    @Override
    public boolean deleteCustomer(Integer customerId) {
        if (customerRepository.existsById(customerId)) {
            customerRepository.deleteById(customerId);
            return true;
        } else {
            return false;
        }
    }
}
