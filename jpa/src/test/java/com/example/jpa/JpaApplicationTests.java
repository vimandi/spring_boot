package com.example.jpa;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	void contextLoads() {
System.out.println("*********************************************");
	}

	@Test
	public void testCustomer(){
		List<Customer> customerList = customerRepository.findAll();
		System.out.println(customerList);

	}
}
