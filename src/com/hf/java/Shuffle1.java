package com.hf.java;

public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x -1;
            System.out.print("-");

            if ( x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x = x + 1;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

class Exercise1c {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}