package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tbl_order")
public class Order extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int restaurantID;
    private int menuID;
    private String quality;

    public Order(){

    }

    public Order(int id, int restaurantID, int menuID, String quality) {
        this.id = id;
        this.restaurantID = restaurantID;
        this.menuID = menuID;
        this.quality = quality;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return id == order.id && restaurantID == order.restaurantID && menuID == order.menuID && Objects.equals(quality, order.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, restaurantID, menuID, quality);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", restaurantID=" + restaurantID +
                ", menuID=" + menuID +
                ", quality='" + quality + '\'' +
                '}';
    }
}
