package com.pm.batchprocessingdemo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_INFO")
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "D0B")
    private String d0b;






}
