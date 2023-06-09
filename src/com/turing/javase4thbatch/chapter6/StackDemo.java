package com.turing.javase4thbatch.chapter6;

public class StackDemo {
    int[] items = new int[10];
    int top = -1;

    public void push(int element)
    {
        items[++top] = element;
    }
    public int pop(){
        return items[top--];
    }

    public static void main(String[] args) {
        StackDemo st = new StackDemo();
        st.push(10);
        st.push(20);

        int element  = st.pop();
        System.out.println("Element "+element);

        element  = st.pop();
        System.out.println("Element "+element);
    }
}
