package com.example.restaurant.Entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tbl_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;
    private String FoodName;
    private String FoodPrice;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;


    public Menu(){

    }

    public Menu(int menuId, String foodName, String foodPrice) {
        this.menuId = menuId;
        FoodName = foodName;
        FoodPrice = foodPrice;

    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        FoodPrice = foodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId == menu.menuId && Objects.equals(FoodName, menu.FoodName) && Objects.equals(FoodPrice, menu.FoodPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, FoodName, FoodPrice);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", FoodName='" + FoodName + '\'' +
                ", FoodPrice='" + FoodPrice + '\'' +
                '}';
    }

    public long getId() {
        return 0;
    }
}
