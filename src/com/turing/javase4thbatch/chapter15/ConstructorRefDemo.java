package com.turing.javase4thbatch.chapter15;

@FunctionalInterface
interface ConstructorRef {
    Human func(String name);
}
class Human {
    String name;
    Human(String n) {
        this.name = n;
        System.out.println("Constructor executed");
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        ConstructorRef func = Human::new;
        Human h = func.func("DTH");
        System.out.println("H " + h.name);
    }
}
