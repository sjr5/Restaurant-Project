package com.example.restaurant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tbl_order_bill")
public class orderBill extends User{
    private  int customersId;
    private  int orderId;
    private String quantity;
    private int total;

    public orderBill() {

    }

    public orderBill( int customersId, int orderId, String quantity, int total) {
        this.customersId = customersId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.total = total;
    }

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        orderBill orderBill = (orderBill) o;
        return customersId == orderBill.customersId && orderId == orderBill.orderId && total == orderBill.total && Objects.equals(quantity, orderBill.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customersId, orderId, quantity, total);
    }

    @Override
    public String toString() {
        return "orderBill{" +
                "customersId=" + customersId +
                ", orderId=" + orderId +
                ", quantity='" + quantity + '\'' +
                ", total=" + total +
                '}';
    }
}
