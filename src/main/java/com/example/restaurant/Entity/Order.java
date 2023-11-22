package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tbl_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String quantity;


//    @ManyToOne
//    @JoinColumn(name = "orderId")
//    private User user;
   // @OneToMany(mappedBy = "menuId")
   // private Set<Menu> mnenuId;
@OneToOne
@JoinColumn(name = "user_id")
private User user;

    public Order(){

    }

    public Order(int orderId, String quantity) {
        this.orderId = orderId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(quantity, order.quantity) && Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, quantity, user);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", quantity='" + quantity + '\'' +
                ", user=" + user +
                '}';
    }
}

