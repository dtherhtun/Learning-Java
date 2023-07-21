package com.turing.javase4thbatch.chapter14;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericCastDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<?> wildcardBox = stringBox; // Wildcard type for generic casting

        // Access the item without knowing its exact type
        Object item = wildcardBox.getItem();
        System.out.println(item);
    }
}
