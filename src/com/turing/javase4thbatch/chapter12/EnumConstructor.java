package com.turing.javase4thbatch.chapter12;

enum Size {
    Small(1), Medium(2), Large(3);
    private final int value;

    Size(int i) {
        this.value = i;
    }

    int getValue(){
        return this.value;
    }
}
public class EnumConstructor {
    public static void main(String[] args) {
        for (Size size : Size.values()) {
            System.out.println("Size " + size + " value " + size.getValue() + " Ordinal " + size.ordinal());
        }

        Size s1 = Size.Medium;
        Size s2 = Size.Small;
        int result = s1.compareTo(s2);
        System.out.println("Result " + result);
    }
}
