package com.turing.javase4thbatch.chapter7;
/*
    static method can't use instance method
    class exist -> doesn't mean object exist
    object exist -> mean class exist

    instance(){
        static + instance
    }
    static(){
        static data;
    }

    instance -> separate copy.
    static -> one copy cross every object.

    Why we need static method?
    Don't need static method in OOP but used in utility method.
    -----------------
    static method can not be overridden.
*/
public class StaticDemo {
    int count;
    static int shared;

    static {
        /*
            used for static member variables initialization.
         */
        System.out.println("Static block1 executed");
        shared = 1;
        // count - can't use here.
    }
    static {
        System.out.println("Static block2 executed");
        shared = 1;
    }

    StaticDemo(){
        System.out.println("Constructor executed");
        count++;
        shared++;
    }
    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        System.out.println("Obj1.count "+ obj1.count);
        System.out.println("Obj2.count "+ obj2.count);

        System.out.println("Obj1.shared "+ StaticDemo.shared);
        System.out.println("Obj2.shared "+ obj2.shared);
    }
}
