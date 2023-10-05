package com.udemy.section1.exercise2;

import java.util.Arrays;

public class DayOfWeek {

    public static void exercise5(String... i) {
        for (String j : i) {
            System.out.println(j);
        }
    }
    // exercise 6
    public static void instanceMethod() {
        System.out.println("Hello from instance Method");
    }
    public static void main(String[] args) {
        String[] dayOfWeek = new String[7];
        dayOfWeek[0] = "Sunday";
        dayOfWeek[1] = "Monday";
        dayOfWeek[2] = "Tuesday";
        dayOfWeek[3] = "Wednesday";
        dayOfWeek[4] = "Thursday";
        dayOfWeek[5] = "Friday";
        dayOfWeek[6] = "Saturday";

        for (String day : dayOfWeek) {
            System.out.println(day);
        }

        System.out.println("he 4th day in the array -> "+ dayOfWeek[3]);

        // exercise 3
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[][] TicTacToe = new String[3][3];
        TicTacToe[0][0] = "O";
        TicTacToe[0][1] = "X";
        TicTacToe[0][2] = "X";
        TicTacToe[1][0] = "X";
        TicTacToe[1][1] = "O";
        TicTacToe[1][2] = "O";
        TicTacToe[2][0] = "X";
        TicTacToe[2][1] = "O";
        TicTacToe[2][2] = "O";
        System.out.println(TicTacToe[2][2]);

        exercise5("Hello", "Java");

        instanceMethod();
    }
}
