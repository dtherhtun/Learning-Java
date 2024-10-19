package com.compro.sample.isVesuvian;

public class Main {
    static int isVesuvian(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            for (int j = 1; j * j < n; j++) {
                if ((i * i) + (j * j) == n) {
                    count++;
                    break;
                }
                if (count == 2) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }
}
