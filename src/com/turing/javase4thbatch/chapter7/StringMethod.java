package com.turing.javase4thbatch.chapter7;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Length - " + str.length());
        System.out.println("string Replace - "+ str.replaceAll("Hello", "How are you?"));
        System.out.println("sub String - "+ str.substring(5));
        System.out.println("Concat - "+ str.concat(" Hi"));

        String[] arr = str.split(" ");
        for (String item : arr) {
            System.out.println("Item - "+ item);
        }
    }
}
