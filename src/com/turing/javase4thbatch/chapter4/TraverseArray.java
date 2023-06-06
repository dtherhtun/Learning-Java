package com.turing.javase4thbatch.chapter4;

public class TraverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 34, 78, 83};

        for (int j : arr) {
            System.out.println("Arr -> " + j);
        }

        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 14}
        };
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.println("Matrix ["+row+"] ["+col+"] = "+ matrix[row][col]);
            }
        }
    }
}

