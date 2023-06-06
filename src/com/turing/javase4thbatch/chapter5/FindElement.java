package com.turing.javase4thbatch.chapter5;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100}
        };

        System.out.println("Enter element to find");
        int element = scan.nextInt();

        boolean found = false;
        int index = 0;

        abc: for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (element == arr[i][j])
                {
                    found = true;
                    index = i;
                    break abc;
                }
                System.out.println("Column "+j);
            }
            System.out.println("Row "+i);
        }
        if(found)
        {
            System.out.println("Found element at index "+ index);
        }
    }
}
