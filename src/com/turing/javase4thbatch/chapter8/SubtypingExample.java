package com.turing.javase4thbatch.chapter8;

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclass inheriting from Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Interface
interface Jumpable {
    void jump();
}

// Class implementing the Jumpable interface
class Kangaroo implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Kangaroo is jumping");
    }
}

public class SubtypingExample {
    public static void main(String[] args) {
        // Subtype relationship through inheritance
        Animal animal = new Cat(); // Cat is treated as an Animal
        animal.makeSound(); // Output: "Meow!"

        // Subtype relationship through interface implementation
        Jumpable jumpable = new Kangaroo(); // Kangaroo is treated as Jumpable
        jumpable.jump(); // Output: "Kangaroo is jumping"
    }
}

