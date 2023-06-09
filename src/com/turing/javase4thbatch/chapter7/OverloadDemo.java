package com.turing.javase4thbatch.chapter7;
/*
 Do not overuse
 Do not abuse
*/
public class OverloadDemo {
    public OverloadDemo() {
        System.out.println("No Argument constructor");
    }
    public OverloadDemo(int a) {
        System.out.println("One Argument constructor");
    }

    public static void print() {
        System.out.println("Print with no parameter");
    }
    public static void print(String str) {
        System.out.println("Print with string parameter "+ str);
    }
    public static void print(int num) {
        System.out.println("Print with int parameter "+ num);
    }
    public static void print(long l) {
        System.out.println("Print with long parameter "+ l);
    }

    public static void main(String[] args) {
        print();
        print("Hello");
        print(123);
        print(123L);

        byte b = 127;
        print(b);

        new OverloadDemo();
        new OverloadDemo(2);
    }
}
