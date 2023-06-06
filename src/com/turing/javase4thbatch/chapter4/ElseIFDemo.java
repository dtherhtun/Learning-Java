package com.turing.javase4thbatch.chapter4;

import java.util.Scanner;

public class ElseIFDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter mark");
        int mark = scan.nextInt();

        if (mark >= 80)
        {
            System.out.println("Distinction");
        } else if (mark >= 40) {
            System.out.println("Pass");
        } else
        {
            System.out.println("Fail");
        }
    }
}
