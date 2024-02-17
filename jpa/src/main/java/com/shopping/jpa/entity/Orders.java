package com.shopping.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    private Integer id;

    @Column
    private Integer customerId;

    @Column
    private Integer product_id;

    @Column
    private Integer quantity;

    @Column
    private Double unitPrice;
}
