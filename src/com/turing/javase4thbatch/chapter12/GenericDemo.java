package com.turing.javase4thbatch.chapter12;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        /* no type safety
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(12);
        */
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("12");
        System.out.println("List "+list);
    }
}
