package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "tbl_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "menu")
    private Menu menu;
    @OneToOne
    @JoinColumn(name="order")
    private Order order;

    public User(){

    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


}
