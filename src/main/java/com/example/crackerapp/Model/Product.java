package com.example.crackerapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String crackers_name;
    private int actual_price;
    private String discount_price;
    private int quantity;
    private int total;
}
