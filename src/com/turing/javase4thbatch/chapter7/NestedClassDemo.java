package com.turing.javase4thbatch.chapter7;

class Outer {
    int outerX = 100;
    private static int staticData = 10;
    private int instanceData = 20;
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

    public class InnerClass {
        public void innerMethod() {
            System.out.println("Accessing staticData from InnerClass: " + staticData);
            System.out.println("Accessing instanceData from InnerClass: " + instanceData);
        }
    }

    public static class StaticNestedClass {
        public void staticMethod() {
            System.out.println("Accessing staticData from StaticNestedClass: " + staticData);
            // Cannot access instanceData here, as it is an instance member
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
        Outer.StaticNestedClass staticNested = new Outer.StaticNestedClass();
        staticNested.staticMethod();

        Outer.InnerClass inner = out.new InnerClass();
        inner.innerMethod();
    }
}
