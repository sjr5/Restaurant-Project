package com.example.restaurant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tbl_admin")
public class Admin extends User {
    private String addNewRestaurant;

    public Admin(){

    }
    public Admin( String addNewRestaurant) {
        this.addNewRestaurant = addNewRestaurant;
    }
    public String getAddNewRestaurant() {
        return addNewRestaurant;
    }
    public void setAddNewRestaurant(String addNewRestaurant) {
        this.addNewRestaurant = addNewRestaurant;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(addNewRestaurant, admin.addNewRestaurant);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addNewRestaurant);
    }
    @Override
    public String toString() {
        return "Admin{" +
                "addNewRestaurant='" + addNewRestaurant + '\'' +
                "} " + super.toString();
    }
}
