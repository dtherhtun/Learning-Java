package com.turing.javase4thbatch.chapter7;

class Outer {
    int outerX = 100;
    void outerMethod(){
        Inner inner = new Inner();
        inner.display();
        inner.printy();
    }
    class Inner{
        int y = 10;
        void display(){
            System.out.println("Inner display outer X "+ outerX);
        }

        void printy() {
            System.out.println("Y "+ y);
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
    }
}
