package com.turing.javase4thbatch.chapter7;
/*
Static methods do not require an instance of the class to be called.
They can be accessed directly using the class name, which can be convenient
for utility methods, helper functions, or operations that don't depend on
instance-specific data. They also promote code re-usability and can improve
performance in certain scenarios.
 */
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10);
        System.out.println("Sum: " + sum);
    }
}