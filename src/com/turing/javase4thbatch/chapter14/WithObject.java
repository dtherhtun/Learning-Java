package com.turing.javase4thbatch.chapter14;

public class WithObject {
    private static final int SIZE = 10;
    private Object[] data = new Object[SIZE];
    int top = -1;

    public void push(Object element) {
        this.data[++top] = element;
    }

    public  Object pop() {
        return this.data[top--];
    }

    public static void main(String[] args) {
        WithObject integerStack = new WithObject();
        integerStack.push(100);
        integerStack.push(200);

        System.out.println("integerStack.pop: "+ integerStack.pop());

        // can't return integer because of Object
        int element = (Integer) integerStack.pop();
        System.out.println("Element: "+ element);

        WithObject stringStack = new WithObject();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("stringStack.pop: "+ stringStack.pop());

        WithObject problemStack = new WithObject();
        problemStack.push(100);
        problemStack.push("Hello");

        System.out.println("problemStack.pop: "+ problemStack.pop());
        System.out.println("problemStack.pop: "+ problemStack.pop());
    }
}
