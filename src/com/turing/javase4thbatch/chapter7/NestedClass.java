package com.turing.javase4thbatch.chapter7;

/*
example of a static nested class
 */
class OuterClass {
    // Outer class members and methods

    public static class StaticNestedClass {
        // Static nested class members and methods
    }
}

public class NestedClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        // Use the static nested class object
    }
}

