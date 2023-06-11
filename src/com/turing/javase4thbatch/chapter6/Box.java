package com.turing.javase4thbatch.chapter6;

public class Box {
    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void volume() {
        System.out.println("Compute volume");
        System.out.println("Volume is "+(width * height * depth));
    }

    double v() {
        System.out.println("Compute volume");
        System.out.println("Volume is "+(width * height * depth));
        return width * height * depth;
    }

    void increase(int factor) {
        System.out.println("Factor "+ factor);
        this.width *= factor;
        this.height *= factor;
        this.depth *= factor;
    }

    public static void main(String[] args) {
        Box box = new Box(1, 3, 4);
        box.volume();
        double vv = box.v();

        System.out.println("Volume from main "+ vv);

        box.increase(2);
        vv = box.v();
        System.out.println("Increase volumen 2x: "+ vv);
    }
}
