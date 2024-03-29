package com.udemy.section1.exercise1;

public class Product {
    private int id;
    private String name;
    private int price;
    private int weight;
    private String description;

    protected Product() {}
    public Product(int id, String name, int price, int weight, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.description = description;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
