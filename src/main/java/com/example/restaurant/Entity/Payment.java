package com.example.restaurant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tbl_payment")
public class Payment extends User{
    private int cardNumber;
    private String cardName;
    private String cardDate;

    public Payment(){

    }

    public Payment(int cardNumber, String cardName, String cardDate) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardDate = cardDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Payment payment = (Payment) o;
        return cardNumber == payment.cardNumber && Objects.equals(cardName, payment.cardName) && Objects.equals(cardDate, payment.cardDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardNumber, cardName, cardDate);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cardNumber=" + cardNumber +
                ", cardName='" + cardName + '\'' +
                ", cardDate='" + cardDate + '\'' +
                '}';
    }
}
