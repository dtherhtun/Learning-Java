package com.compro.upcount;

// Define the n-up count of an array to be the number of times the partial sum
// goes from "less than or equal to n to greater than n" during the calculation of
// the sum of the elements of the array.
//
// For example, if n=5, the 5-up count of the array {2, 3, 1, -6, 8, -3, -1, 2} is 3.
public class Main {
    public static int upCount(int[] arr, int n) {
        int partialSum = 0;
        int previousPartialSum;
        int count = 0;

        for (int j : arr) {
            previousPartialSum = partialSum;
            partialSum = partialSum + j;
            if (previousPartialSum <= n && partialSum > n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, -6, 8, -3, -1, 2};
        int[] test2 = {2, 3, 1, 6, 8, 3, 1, 2};
        System.out.println(upCount(test1, 5));
        System.out.println(upCount(test2, 6));
    }
}
