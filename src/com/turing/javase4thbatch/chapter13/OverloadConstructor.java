package com.turing.javase4thbatch.chapter13;


public class OverloadConstructor {
    String name;
    int age;

    OverloadConstructor(String name) {
        this(name, 0);
        System.out.println("One argument constructor");
    }
    OverloadConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two argument constructor");
    }

    public static void main(String[] args) {
        OverloadConstructor h = new OverloadConstructor("DTH");
    }
}
