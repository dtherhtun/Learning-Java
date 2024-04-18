package com.compro.sample.smallestN;

public class Main {
    public static int smallest(int n) {
        if (n < 1) {
            return 0;
        }
        int i = 1;
        while (true) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (is2Contain(i * j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == n) {
                return i;
            }
            i++;
        }
    }

    public static boolean is2Contain(int n) {
        while (n != 0) {
            if (n % 10 == 2) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smallest(0));
        System.out.println(smallest(1));
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
}
