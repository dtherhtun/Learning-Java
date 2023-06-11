package com.turing.javase4thbatch.chapter7;

/*
    ! = factorial
    4! = 4 * 3 * 2 * 1
    4! = 4 * 3!
    n! = n * (n-1)!
    fact n = n * fact(n-1)
*/
public class Factorial {
    static int fact(int num){ // must accept parameter.
        System.out.println("Fact "+ num);
        if (num == 0){ // Base case.
            return  1;
        } else {
            return num * fact(num-1); // must call itself with modified parameter.
        }
    }

    public static void main(String[] args) {
        int result = fact(4);
        System.out.println("Result "+ result);
    }
}
