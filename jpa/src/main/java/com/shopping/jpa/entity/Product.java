package com.shopping.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
