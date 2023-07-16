package com.turing.javase4thbatch.chapter13;

class A {

}
class B extends A {

}
class C extends B {

}
public class InstanceOfDemo {
    public static void main(String[] args) {
        String str = null;
        System.out.println("str instance of String "+(str instanceof String));
        System.out.println("str instance of Object "+(str instanceof Object));

        C c = new C();
        System.out.println("c instance of Object "+(c instanceof Object));
        System.out.println("c instance of A "+(c instanceof A));
        System.out.println("c instance of B "+(c instanceof B));
        System.out.println("c instance of C "+(c instanceof C));
        B b = new B();
        System.out.println("b instance of C "+(b instanceof C));
    }
}
