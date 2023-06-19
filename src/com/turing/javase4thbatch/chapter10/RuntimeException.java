package com.turing.javase4thbatch.chapter10;

public class RuntimeException {
    static double div(double a, double b){
        try{
            if(Double.isNaN(a) || Double.isNaN(b)){
                throw new java.lang.RuntimeException("One of the operand is NaN");
            }
        }catch (Exception e){
            // return 200;
            throw new java.lang.RuntimeException("Another exception");
        }finally {
            return 300;
        }
        // return a/b;
    }

    /*
    static double div(double a, double b){
        try{
            if(Double.isNaN(a) || Double.isNaN(b)){
                throw new java.lang.RuntimeException("One of the operand is NaN");
            }
        }catch (Exception e){
            return 200;

        }finally {
            // in this case, no return and error from finally executed.
            throw new java.lang.RuntimeException("Finally rethrow exception");
        }
        // return a/b;
    }
     */

    public static void main(String[] args) {

        double result = div(1, Double.NaN);
        System.out.println("Result "+ result);
    }
}
