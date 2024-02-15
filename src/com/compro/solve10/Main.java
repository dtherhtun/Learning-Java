package com.compro.solve10;

public class Main {
    public static int factor(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factor(n -1);
        }
    }

    public static int[] solve10() {
        int[] result = new int[2];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (factor(i) + factor(j) == factor(10)){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = solve10();
        for (int n: a) {
            System.out.println(n);
        }
    }
}
