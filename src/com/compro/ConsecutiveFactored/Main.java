package com.compro.ConsecutiveFactored;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int isConsecutiveFactored(int n) {
        if (n % 2 != 0) return 0;

        List<Integer> factor = new ArrayList<Integer>();
        for (int i = 2; i <= n /2; i++) {
            if (n % i == 0) {
                factor.add(i);
            }
        }


        for (int i = 0; i < factor.size() - 1; i++) {
            if (factor.get(i)+ 1 == factor.get(i+1)) {
                return 1;
            }
        }
        return 0;
    }

    public static int isCF(int n) {
        if (n <= 1) {
            return 0; // Handle non-positive numbers
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i > 1 && i + 1 <= n / i && n % (i + 1) == 0) {
                    return 1; // Found consecutive factors
                }
            }
        }

        return 0; // No consecutive factors found
    }

    static int isConsecutiveFactoredGod(int number) {
        ArrayList al = new ArrayList();
        for (int i = 2; i <= number; i++) {
            int j = 0;
            int temp;
            temp = number % i;

            if (temp != 0) {
                continue;
            }

            else {

                al.add(i);
                number = number / i;
                j++;

            }
        }

        Object ia[] = al.toArray();
        System.out.println("Factors are: " + al);
        int LengthOfList = al.size();
        if (LengthOfList >= 2) {
            int a = ((Integer) ia[0]).intValue();
            int b = ((Integer) ia[1]).intValue();

            if ((a + 1) == b) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactoredGod(24));
    }
}
