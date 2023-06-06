package com.turing.javase4thbatch.chapter5;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Enter element to find");
        int element = scan.nextInt();

        boolean found = false;
        int index = 0;

        while (!found && index < arr.length)
        {
            if (arr[index]==element)
            {
                found = true;
                System.out.println("Element found at index "+ index);
            }
            index++;
        }
    }
}
