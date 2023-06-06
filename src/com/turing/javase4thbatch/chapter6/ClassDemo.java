package com.turing.javase4thbatch.chapter6;

// without Class (problem)
public class ClassDemo {
    static void work(String name, int age)
    {
        System.out.println("Name "+ name +" Age "+ age);
    }

    public static void main(String[] args) {
        String name1 = "DTH";
        int age1 = 38;

        String name2 = "LuoSten";
        int age2 = 37;

        work(name1,age1);
        work(name2,age2);
    }
}
