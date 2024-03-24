package com.compro.sumAllmultiples;

public class Main {
    public static int sumAllMultiple(int a, int b) {
        int resultA = 0;
        for (int i = a; i < 1000; i+=a) {
            resultA = resultA + i;
        }
        int resultB = 0;
        for (int i = b; i < 1000; i+=b) {
            if (i%a != 0) {
                resultB = resultB + i;
            }
        }
        return resultA+resultB;
    }

    public static void main(String[] args) {
        System.out.println(sumAllMultiple(3, 5));
        int number = 1000;
        int suma = 0;
        for (int i = 0; i < number; i++) {
            if(i%3==0 || i%5==0){
                suma = suma + i;
            }
        }
        System.out.println("the sum of all the multiples of 3 or 5 = "+suma);
    }
}
