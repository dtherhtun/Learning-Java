package com.turing.javase4thbatch.chapter6;

public class Human {
    String name;
    int age;

    Human(String name, int age)
    {
        System.out.println("Human constructor");
        this.name = name;
        this.age = age;
    }

    public void work()
    {
        System.out.println("Name "+ this.name +" Age "+ this.age);
    }

    public int getAge(){ return this.age; }

    public static void main(String[] args) {
        Human obj1 = new Human("LuoSten", 20);
        Human obj2 = new Human("ae86", 21);
        obj1.work();
        obj2.work();

        int age = obj1.getAge();
        System.out.println("Age : "+age);
    }
}
