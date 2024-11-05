package com.example.crackerapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="contactus")
public class Contactus {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private  String email;
    private String phone_number;
    private String message;


}
