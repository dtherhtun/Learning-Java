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

    // override here
    T get() {
        System.out.println("get override ");
        return obj;
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
        Child<String> data = new Child<>("Hello"); // diamond inference
        System.out.println("Data: " + data.get());

        ChildTwo<String,Integer> data2 = new ChildTwo<>("World", 100);
        System.out.println("Str: " + data2.get() + ", Int: " + data2.getValue());

        var child2 = new ChildTwo<Integer, String>(200, "Hello"); // type inference
        System.out.println(child2.get());
    }
}
