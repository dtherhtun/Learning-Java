package com.turing.javase4thbatch.chapter15;

@FunctionalInterface
interface Operation {
    int op(int x, int y);
}
public class FunctionalInterfaceDemo {
    static int multiply(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        Operation operation = (int x, int y) -> x + y;
        System.out.println("Add " + operation.op(10, 2));

        // parameter name doesn't matter but type matter.
        operation = (int a, int b) -> a - b;
        System.out.println("Sub " + operation.op(10, 2));

        // method reference
        operation = FunctionalInterfaceDemo::multiply;
        System.out.println("Multiply " + operation.op(10, 2));

        // multi line needs {}
        operation = (int x, int y) -> {
            System.out.println("Dividing");
            return x / y;
        };
        System.out.println("Div " + operation.op(10, 2));
    }
}
