package com.turing.javase4thbatch.chapter8;

class Human{
    void work(){
        System.out.println("Human work");
    }
}

class Teacher extends Human {
    void work(){
        System.out.println("Teacher tech");
    }
}
class Doctor extends Human {
    void work(){
        System.out.println("Doctor treat patient");
    }
}
public class SubTypeDemo {
    public static void main(String[] args) {
        Human h = new Teacher();

        h.work();

        h = new Doctor();
        h.work();
    }
}
