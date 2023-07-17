package com.turing.javase4thbatch.chapter14;

public class WithoutGeneric {
    private static final int SIZE = 10;
    private int[] data = new int[SIZE];
    int top = -1;

    public void push(int element) {
        this.data[++top] = element;
    }

    public  int pop() {
        return this.data[top--];
    }

    public static void main(String[] args) {
        WithoutGeneric stack = new WithoutGeneric();
        stack.push(100);
        stack.push(200);

        System.out.println("Stack.pop: "+ stack.pop());
    }
}
