package com.udemy.section1.exercise1;

import java.time.LocalDate;

public class Order {
    private int id;
    private int customerId;
    private LocalDate OrderDate;
    private String shippingMethod;
    private String shippingNote;

    protected Order() {}
    public Order(int id, int customerId, LocalDate orderDate, String shippingMethod, String shippingNote) {
        this.id = id;
        this.customerId = customerId;
        OrderDate = orderDate;
        this.shippingMethod = shippingMethod;
        this.shippingNote = shippingNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingNote() {
        return shippingNote;
    }

    public void setShippingNote(String shippingNote) {
        this.shippingNote = shippingNote;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", OrderDate=" + OrderDate +
                ", shippingMethod='" + shippingMethod + '\'' +
                ", shippingNote='" + shippingNote + '\'' +
                '}';
    }
}
