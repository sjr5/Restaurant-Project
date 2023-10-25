package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderID;
    private int userID;
    private int price;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Menu> menu;

   public Order(){

   }

    public Order(int id, int orderID, int userID, int price) {
        this.id = id;
        this.orderID = orderID;
        this.userID = userID;
        this.price = price;
    }

//      @OneToOne
//   @JoinColumn(name="User")
//  private User user;

//    @OneToMany
//    @JoinColumn(name="Menu")
//    private List<Menu> menu;

}

