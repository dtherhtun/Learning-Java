package com.turing.javase4thbatch.chapter6;

public class RefDemo {
    public static void main(String[] args) {
        Human obj1 = new Human("DTH", 28);
        Human obj2 = obj1;

        obj1.name = "Change";

        System.out.println("Obj1 name "+ obj1.name);
        System.out.println("Obj2 name "+ obj2.name);

        System.out.println("Obj1 == Obj2 "+ (obj1 == obj2));

        int a = 10;
        int b = a;

        a++;
        System.out.println("A "+a);
        System.out.println("B "+b);
    }
}
