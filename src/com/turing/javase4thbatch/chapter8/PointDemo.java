package com.turing.javase4thbatch.chapter8;

class Point2D {
    protected int x;
    protected int y;

    public Point2D (int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Point2D constructor");
    }
    static {
        System.out.println("2D static");
    }
}

class Point3D extends Point2D{
    protected int z;
    static {
        System.out.println("3D static");
    }
    public Point3D( int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("Point3D constructor");
    }
}
public class PointDemo {
    public static void main(String[] args) {
        Point3D threeD = new Point3D(10, 20, 30);
    }
}
/*
 Result -
    2D static
    3D static
    Point2D constructor
    Point3D constructor
 */