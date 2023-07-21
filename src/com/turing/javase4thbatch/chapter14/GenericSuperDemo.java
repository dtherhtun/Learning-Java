package com.turing.javase4thbatch.chapter14;

class Parent<T> {
    T obj;
    Parent(T obj) {
        this.obj = obj;
    }
    T get() {
        return this.obj;
    }
}

class Child<T> extends Parent<T> {
    Child(T obj) {
        super(obj);
    }
}

class ChildTwo<T, V> extends Parent<T> {
    V value;
    ChildTwo(T obj, V value) {
        super(obj);
        this.value = value;
    }

    V getValue() {
        return this.value;
    }
}
public class GenericSuperDemo {
    public static void main(String[] args) {
        Child<String> data = new Child<>("Hello");
        System.out.println("Data: " + data.get());

        ChildTwo<String,Integer> data2 = new ChildTwo<>("World", 100);
        System.out.println("Str: " + data2.get() + ", Int: " + data2.getValue());
    }
}
