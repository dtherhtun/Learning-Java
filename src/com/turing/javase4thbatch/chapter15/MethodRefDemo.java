package com.turing.javase4thbatch.chapter15;

interface MethodRef {
    void Do();
    //void anotherMethod();
}
public class MethodRefDemo {
    void instanceMRef(){
        System.out.println("Instance method do something");
    }
    static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MethodRef methodRef = MethodRefDemo::hello;
        methodRef.Do();

        MethodRefDemo instance = new MethodRefDemo();
        methodRef = instance::instanceMRef;
        methodRef.Do();
    }
}
