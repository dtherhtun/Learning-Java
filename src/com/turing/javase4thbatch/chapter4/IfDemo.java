package com.turing.javase4thbatch.chapter4;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter myanmar mark");
        int myan = scanner.nextInt();

        System.out.println("Enter english");
        int eng = scanner.nextInt();

        System.out.println("Enter math");
        int math = scanner.nextInt();

        if (myan >= 40)
        {
            if(eng >= 40){
                if (math >= 40) {
                    System.out.println("Pass");
                }
            }
        } else {
            System.out.println("Fail");
        }
    }
}
