package com.example.restaurant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer extends User {

}
