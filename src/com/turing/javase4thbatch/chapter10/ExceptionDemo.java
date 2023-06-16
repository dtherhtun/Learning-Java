package com.turing.javase4thbatch.chapter10;

public class ExceptionDemo {
    static double div(double a, double b) {
        try {
            if (Double.isNaN(a) || Double.isNaN(b)){
                throw new RuntimeException("Error1");
            }
            return a/b;
        } catch (Exception e) {

            System.out.println("catch");
            return 200;
        } finally {
            System.out.println("Finally");

        }
    }

    public static void main(String[] args) {
        double result = div(10, Double.NaN);
        System.out.println("result = " + result);
    }
}
