package com.turing.javase4thbatch.chapter14;

public class WithGeneric<T> {
    private static final int SIZE = 10;
    private T[] data;
    int top = -1;

    WithGeneric() {
        this.data = (T[]) new Object[SIZE];
    }
    public void push(T element) {
        this.data[++top] = element;
    }

    public T pop() {
        return this.data[top--];
    }

    public static void main(String[] args) {
        WithGeneric<String> strStack = new WithGeneric<>();
        strStack.push("Hello");
        strStack.push("World");

        String strElement = strStack.pop();
        System.out.println("STR ELEMENT: " + strElement);

        WithGeneric<Integer> intStack = new WithGeneric<>();
        intStack.push(100);
        intStack.push(200);

        int intElement = intStack.pop();
        System.out.println("INT ELEMENT: " + intElement);
    }
}
