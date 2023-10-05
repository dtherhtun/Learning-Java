package com.udemy.section1.exercise1;

import java.util.Arrays;

public class Invoice {
    private int id;
    private int orderId;
    private String[] item;
    private int shippingCost;
    private int tax;
    private int totalPrice;

    protected Invoice() {}
    public Invoice(int id, int orderId, String[] item, int shippingCost, int tax, int totalPrice) {
        this.id = id;
        this.orderId = orderId;
        this.item = item;
        this.shippingCost = shippingCost;
        this.tax = tax;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", item=" + Arrays.toString(item) +
                ", shippingCost=" + shippingCost +
                ", tax=" + tax +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
