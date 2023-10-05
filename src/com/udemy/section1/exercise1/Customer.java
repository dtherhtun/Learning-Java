package com.udemy.section1.exercise1;

import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private LocalDate dob;
    private String shippingAddress;
    private String billingAddress;
    private String email;
    private  String phone;

    protected Customer () {}

    public Customer(int id, String name, LocalDate dob, String shippingAddress, String billingAddress, String email, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
