package com.turing.javase4thbatch.chapter15;

@FunctionalInterface
interface GenericFunction<T> {
    T apply(T value);
}

@FunctionalInterface
interface GFop<T> {
    T func(T value);
}
public class GenericFuncInterfaceDemo {

    // function as argument.
    static void doSomething(GFop<Integer> func) {
        System.out.println("Do Something " + func.func(20));
    }

    // function as return
    static GFop<Integer> getFunc(){
        return (x)->x+2;
    }
    public static void main(String[] args) {
        // Lambda expression using the generic functional interface
        GenericFunction<Integer> squareFunction = x -> x * x;

        // Applying the lambda expression to an Integer
        int result = squareFunction.apply(5);
        System.out.println("Square of 5 is: " + result);

        // Applying the lambda expression to a Double
        GenericFunction<Double> cubeFunction = x -> x * x * x;
        double cubeResult = cubeFunction.apply(2.5);
        System.out.println("Cube of 2.5 is: " + cubeResult);

        // can't use T type parameter in lambda expression.
        GFop<String> gfString = (str)-> str.toUpperCase();
        System.out.println("upper case: " + gfString.func("hello"));

        GFop<Integer> gfInteger = (x)-> x+1;
        System.out.println("gfInteger: " + gfInteger.func(3));

        // function as parameter;
        doSomething(gfInteger);

        // function as return;
        System.out.println("GetFunc "+ getFunc().func(200));
    }
}
