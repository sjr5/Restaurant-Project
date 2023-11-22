package com.example.restaurant.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;
import java.util.Objects;
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "tbl_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name ="userId")
    private int userId;
    @Column(name="fullName")
    private String fullName;
    @Column(name="contactNumber")
    private String contactNumber;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;

//   @OneToMany (mappedBy ="orderId")
//   private Order order;
    @OneToOne(mappedBy = "user")
     private Order order;


    public User(){

    }

    public User(int userId, String fullName, String contactNumber, String email, String password, String address) {
        this.userId = userId;
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(fullName, user.fullName) && Objects.equals(contactNumber, user.contactNumber) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(address, user.address) && Objects.equals(order, user.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, fullName, contactNumber, email, password, address, order);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
