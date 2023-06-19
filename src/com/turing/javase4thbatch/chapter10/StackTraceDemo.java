package com.turing.javase4thbatch.chapter10;

public class StackTraceDemo {
    static double div(double a , double b)
    {
        try
        {
            StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
            for(StackTraceElement tre : stackTraces)
            {

                System.out.println("FileName "+tre.getFileName()+" "+tre.getMethodName() + " line  no "+tre.getLineNumber());
            }
        }
        catch(Exception e)
        {
            // Swallow the exception without any specific handling
        }

        return a/b;
    }
    public static void main(String[] args) {
        double result = div (10,Double.NaN);
        System.out.println("Result "+result);
    }
}
