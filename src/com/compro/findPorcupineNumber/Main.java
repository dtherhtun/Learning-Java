package com.compro.findPorcupineNumber;

public class Main {

    static  boolean isPrime(int num) {
        if(num<=1) return false;

        for(int i=2;i <= num/2;i++) {
            if (num % i == 0 ) {

                return false;
            }
        }
        return true;
    }

    public static int findPorcupineNumber(int n) {
        int num = n +1;
        while (true) {
            if (isPrime(num) && num % 10 == 9) {
                int nextNum = num + 1;
                while (!isPrime(nextNum)) {
                    nextNum +=1;
                }
                if (nextNum % 10 == 9) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(18));
    }
}
