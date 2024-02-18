package com.shopping.jpa.service;

import com.shopping.jpa.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService
{
    public List<Product> fetchAllProducts();


}

