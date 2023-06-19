package com.turing.javase4thbatch.chapter8;

abstract class MovingObject {
    abstract void moving();

    void vehicle(){
        System.out.println("vehicle");
    }
}

class Car extends MovingObject {
    void moving(){
        System.out.println("Moving with 4 wheel");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // MovingObject m = new MovingObject(); //'MovingObject' is abstract; cannot be instantiated
        Car toyota = new Car();
        toyota.moving();
        toyota.vehicle();
    }
}
