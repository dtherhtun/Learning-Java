package com.turing.javase4thbatch.chapter12;

public class WrapperDemo {
    public static void main(String[] args) {
        // Boxing example
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt); // new Integer(primitiveInt); // Boxing explicitly

        // Autoboxing example
        int primitiveInt2 = 42;
        Integer autoboxInt = primitiveInt2; // Autoboxing

        // Unboxing example
        Integer boxedInt2 = 42;
        int unboxingInt = boxedInt2.intValue(); // Unboxing explicitly

        // Auto-unboxing example
        Integer boxedInt3 = 42;
        int autoUnboxingInt = boxedInt3; // Auto-unboxing

        System.out.println(boxedInt +" "+ autoboxInt+" "+unboxingInt+" "+ autoUnboxingInt);

        Integer i = 13;
        int k = i;

        System.out.println("I "+i);
        System.out.println("K "+k);
        System.out.println("I instance of Object "+(i instanceof Object));

        i = new Integer(73);
        System.out.println("I value "+i.intValue());
        i = Integer.valueOf("1");
        System.out.println("I "+i);
    }
}
