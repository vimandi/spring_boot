package com.shopping.jpa.service.impl;

import com.shopping.jpa.entity.Product;
import com.shopping.jpa.repository.ProductRepository;
import com.shopping.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
@Autowired
private ProductRepository productRepository;
    @Override
    public  List<Product> fetchAllProducts()
    {
//        return ProductRepository.findAll();
        return null;
    }

    }

