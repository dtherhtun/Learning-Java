package com.turing.javase4thbatch.chapter14;

public class GenConstructorDemo {
    double value;
    <T extends Number> GenConstructorDemo(T value) {
        this.value = value.doubleValue();
    }

    void showValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenConstructorDemo genConstructorDemo = new GenConstructorDemo(4);
        genConstructorDemo.showValue();
    }
}
