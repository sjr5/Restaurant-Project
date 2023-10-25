package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tbl_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String foodName;

    @ManyToOne
    @JoinColumn(name="Order")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "User")
    private User user;

    public Menu(){

    }

    public Menu(int id, String foodName) {
        this.id = id;
        this.foodName = foodName;
    }





}
