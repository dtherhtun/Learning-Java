package com.turing.javase4thbatch.chapter7;

public class InstanceOfDemo {
    public static void main(String[] args) {
        int []arr = {1, 2, 3};
        System.out.println("Arr length "+ arr.length);

        System.out.println("Array Instance of "+ (arr instanceof Object));
    }
}
