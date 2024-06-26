package com.compro.sample.isContinuousFactored;

public class Main {
    static int isContinuousFactored(int n) {
        int i = 2;
        int prev = 0;
        while (i <= n) {
            if (n % i == 0) {
                if (prev == i - 1) {
                    return 1;
                }
                prev = i;
            }
            i++;
        }
        return 0;
    }

    static int isContinuousFactoredNext(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactoredNext(99));
        System.out.println(isContinuousFactoredNext(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));

    }
}
