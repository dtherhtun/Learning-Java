package com.turing.javase4thbatch.chapter9;

// similar with abstract.
// use in different taxonomy
// interface support encapsulation
interface Flyable {
    void fly();
    default String getString() // default method [JDK- 8 and later]
    {
        internal();
        return "Flyable";
    }
    private void internal()
    {
        System.out.println("Internal");
    }
    static double min(double a, double b)
    {
        return Math.min(a, b);
    }
}
interface Walkable {
    void walk();
}

interface DuckLikeBehavior extends Flyable,Walkable {
    void swim();
}
class Aeroplane implements Flyable {
    @Override
    public void fly(){
        System.out.println("Aeroplane fly");
    }
}
class Bird implements Flyable {
    public void fly(){
        System.out.println("Bird fly");
    }
}

class Duck implements Flyable,Walkable {
    @Override
    public void fly(){
        System.out.println("Duck fly");
    }

    @Override
    public void walk(){
        System.out.println("Duck walk");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Aeroplane();
        flyable.fly();

        flyable = new Bird();  // accept subtyping.
        flyable.fly();

        Duck duck = new Duck();
        duck.fly();
        duck.walk();

        System.out.println(flyable.getString());
    }
}
