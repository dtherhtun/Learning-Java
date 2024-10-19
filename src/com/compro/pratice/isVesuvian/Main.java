package com.compro.pratice.isVesuvian;

public class Main {
    public static int isVesuvian(int n) {

        int count = 0;

        for (int i = 1; i * i < n; i++) {
            int dff = n - (i * i);
            if (isSqrt(dff) && dff != i * i) {
                count++;
            }
        }

        return count >= 2 ? 1 : 0;
    }

    static boolean isSqrt(int n) {
        int temp = 0;
        while (temp * temp < n) {
            temp++;
        }

        return temp * temp == n;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }
}
