package com.compro.perfectNumber;

public class Main {

    public static int perfectNum(int p) {
        int count = 0;
        int pefNum = 0;
        int i=2;
        while (count != p) {
            pefNum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0) {
                    pefNum+=j;
                }
            }
            if (pefNum == i){
                count++;
            }
            i++;
        }
        return pefNum;
    }
    public static int henry(int i, int j) {
        return perfectNum(i)+perfectNum(j);
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }
}
