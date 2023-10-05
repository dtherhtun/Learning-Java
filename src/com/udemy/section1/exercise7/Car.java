package com.udemy.section1.exercise7;

import java.util.Arrays;

public class Car {
    private String type;
    private String color;
    private String[] Energy;
    private boolean isAutoGear;

    protected Car() {}
    public Car(String type, String color, String[] energy, boolean isAutoGear) {
        this.type = type;
        this.color = color;
        Energy = energy;
        this.isAutoGear = isAutoGear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", Energy=" + Arrays.toString(Energy) +
                ", isAutoGear=" + isAutoGear +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ford", "black", new String[]{"oil", "electric"}, true);

        System.out.println(myCar);
    }
}
