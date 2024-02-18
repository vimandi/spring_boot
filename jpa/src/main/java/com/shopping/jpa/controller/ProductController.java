package com.shopping.jpa.controller;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.entity.Product;
import com.shopping.jpa.repository.CustomerRepository;
import com.shopping.jpa.repository.ProductRepository;
import com.shopping.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;



//    @GetMapping("/getAllProducts")
//    public List<Product> getProducts() {
//        return productRepository.findAll();
//    }
    @GetMapping("/getAllProducts")
    public List<Product> product()
    {

        List<Product>  productList = productService.fetchAllProducts();

        return productList;
    }



}
