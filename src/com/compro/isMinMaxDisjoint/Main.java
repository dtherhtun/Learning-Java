package com.compro.isMinMaxDisjoint;

public class Main {
    public static int isMinMaxDisjoint(int[ ] a){
        if (a.length < 3) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
            if ( a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        if ((minIndex + 1 == maxIndex) || (minIndex - 1 == maxIndex )) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((min == a[i]) || (max == a[i])){
                count++;
            }
        }
        return count == 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{5, 0, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2, 1}));
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2, 5}));
    }
}
