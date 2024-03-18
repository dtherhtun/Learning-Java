package com.compro.property124;

public class Main {
    public static int smallest(int n) {

        int small = 124;
        while (true) {
            int i = 1;
            for (int j = 1; j <= n; j++) {
                int temp = small * j;
                boolean containsTwo = false;
                while (temp != 0) {
                    if (temp % 10 == 2) {
                        containsTwo = true;
                        break;
                    }
                    temp = temp / 10;
                }
                if (containsTwo){
                    i++;
                }
            }
            if (i > n) {
                return small;
            }
            small++;
        }
    }

    public static int smallestGod(int n) {
        int i = 124;
        while (true) {
            int k = 1;
            for (int j = 1; j <= n; j++) {
                if (!containsTwo(i * j)) {
                    break;
                }
                k++;
            }
            if (k > n) {
                return i;
            }
            i++;
        }
    }

    private static boolean containsTwo(int num) {
        while (num > 0) {
            if (num % 10 == 2) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smallest(11));
//        System.out.println(smallest(2));
//        System.out.println(smallestGod(7));
    }
}
