package com.turing.javase4thbatch.chapter14;

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

class FindMinMax<T extends Comparable<T>> implements MinMax<T> {

    T[] values;
    FindMinMax(T[] values) {
        this.values = values;
    }
    @Override
    public T min() {
        T min = this.values[0];
        for (int i = 0; i < this.values.length ; i++) {
            if (min.compareTo(this.values[i]) > 0) {
                min = this.values[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = this.values[0];
        for (int i = 0; i < this.values.length ; i++) {
            if (max.compareTo(this.values[i]) < 0) {
                max = this.values[i];
            }
        }
        return max;
    }
}
public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer[] arr = {7, 8, 9, 3, 2, 6, 4, -5};
        FindMinMax<Integer> findMinMax = new FindMinMax<>(arr);
        System.out.println("Min: " + findMinMax.min() + ", Max: " + findMinMax.max());
    }
}
