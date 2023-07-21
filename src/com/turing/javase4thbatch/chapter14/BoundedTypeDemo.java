package com.turing.javase4thbatch.chapter14;

/*
 Problem
class Stats<T> {
    T[] num;

    Stats(T[] arr) {
        num = arr;
    }

    double average() {
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            // Operator '+' cannot be applied to 'double', 'T'
            // .doubleValue() can't also use this method
            // cause of T is not number type or double
            // result += num[i];
        }
        return result/num.length;
    }
}
*/

class Stats<T extends Number> {
    T[] num;

    Stats(T[] arr) {
        num = arr;
    }

    double average() {
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            // Operator '+' cannot be applied to 'double', 'T'
            result += num[i].doubleValue();
        }
        return result/num.length;
    }

    // wildcard argument
    boolean isSameAvg(Stats<?> another) {
        /*
        if (average() == another.average()) {
            return true;
        }
        return false;

         */
        return average() == another.average();
    }
}
public class BoundedTypeDemo {
    public static void main(String[] args) {
        Float[] fArr = {10f, 20f, 30f};
        Stats<Float> floatStats = new Stats<>(fArr);

        double result = floatStats.average();
        System.out.println("Result: " + result);

        // Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        // String[] sArr = {"Hello", "World"};
        // Stats<String> stringStats = new Stats<String>(sArr);

        Integer[] iArr = {10, 20, 30};
        Stats<Integer> integerStats = new Stats<>(iArr);

        System.out.println("Same Avg: " + floatStats.isSameAvg(integerStats));
    }
}
