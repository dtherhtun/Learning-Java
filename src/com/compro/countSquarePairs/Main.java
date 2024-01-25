package com.compro.countSquarePairs;

public class Main {
    public static int countSquarePairs(int[] arr){
        if (arr.length < 2) return 0;
        int squareCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j] && 1 == isPerfectSquare(arr[i]+arr[j])) {
                    squareCount++;
                }
            }
        }
        return squareCount;
    }

    public static int isPerfectSquare(int a) {
        int temp = (int)Math.floor(Math.sqrt(a));
        if (temp * temp != a) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{11, 5, 4, 20}));;
    }
}
