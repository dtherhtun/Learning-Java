package com.turing.javase4thbatch.chapter5;

public class TraverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Arr "+ arr[i]);
            arr[i] *= 2;
        }
        for (final int element : arr)
        {
            System.out.println("Element "+ element);
        }
        System.out.println("Arr[0] "+ arr[0]);

        int[][] multi = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100}
        };

        for (int[] row: multi)
        {
            for(int j: row)
            {
                System.out.println("J : "+ j);
            }
        }
    }
}
