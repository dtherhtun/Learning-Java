package com.turing.javase4thbatch.chapter5;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(10)+1;

        boolean correct = false;
        int attempt = 1;
        do {
            System.out.printf("Attempt - %s - Enter your guess :%n", attempt);
            int guess = scan.nextInt();

            if (guess == number)
            {
                System.out.println("Correct at "+ attempt);
                correct = true;
            } else if (guess>number) {
                System.out.println("Too large");
            }else {
                System.out.println("Too small");
            }
            attempt++;
        }while (!correct);
    }
}
