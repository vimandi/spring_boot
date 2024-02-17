package com.shopping.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity
@ToString
public class Product {

    @Id
    private Integer id;

    @Column
    private String name;
    @Column
    private String description;

    @Column
    private Double price;

    @Column
    private Integer availableQuantity;


}
