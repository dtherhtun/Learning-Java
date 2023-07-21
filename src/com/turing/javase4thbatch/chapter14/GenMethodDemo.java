package com.turing.javase4thbatch.chapter14;

public class GenMethodDemo {
    static<T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V v : y) {
            // equals here cause of Comparable.
            if (x.equals(v)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 8};
        System.out.println("5 in numbers: " + GenMethodDemo.isIn(5, nums));
    }
}
