package com.compro.sample.findSmallestBEQnumber;

public class Main {
    static int findSmallestBEQNumber() {
        int n = 101;
        int count;
        int k;
        while (true) {
            k = Cube(n);
            count = 0;
            while (k > 0) {
                if (k % 10 == 6) {
                    count++;
                }
                k /= 10;
            }
            if (count == 4) {
                break;
            }
            n++;
        }
        return n;
    }

    static int Cube(int n) {
        int result = 1;
        int power = 3;
        while (power > 0) {
            result *= n;
            power--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestBEQNumber());
    }
}
