package com.turing.javase4thbatch.chapter8;

class Parent {
    int a;
    void method1(){
        System.out.println("Method1");
    }
}

class Derived extends Parent {
    int b;
    void method2(){
        System.out.println("Method2");
    }
}
class Third extends Derived {
    int c;
    void method3(){
        System.out.println("Method3");
    }
}
public class BasedDerivedDemo {
    public static void main(String[] args) {
        Third d = new Third();
        d.a = 100;
        d.b = 200;
        d.c = 400;

        d.method1();
        d.method2();
        d.method3();
    }
}
