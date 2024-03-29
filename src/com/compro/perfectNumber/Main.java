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

    public static int henryGod(int i, int j) {
        if(i < 0 || j <0) {
            return 0;
        }
        int counter = 1;
        int perfectSequence = 2;
        int perfectFirstValue = 0;
        int perfectSecondValue = 0;

        while(true) {
            //find the first perfect number
            int sum = 0;
            for(int k = 1 ; k < perfectSequence; k++) {
                if(perfectSequence % k == 0) {
                    sum = sum + k;
                }
            }
            if(sum == perfectSequence) {
                //yes, this is perfect number
                if(counter == i) {
                    perfectFirstValue = perfectSequence;
                }
                if (counter == j) {
                    perfectSecondValue = perfectSequence;
                }

                counter++;

            }

            if(perfectFirstValue != 0 && perfectSecondValue != 0) {
                return perfectFirstValue + perfectSecondValue;
            }
            perfectSequence++;
        }

    }

    public static void main(String[] args) {
        System.out.println(henry(1, 4));
        System.out.println(henryGod(1, 4));
    }
}
