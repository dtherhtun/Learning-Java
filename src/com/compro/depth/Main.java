package com.compro.depth;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static int depth(int n) {
        int count = 0;
        int inc = 1;
        HashMap<Integer, Boolean> counter = new HashMap<>();
        while (count != 10) {
            count = 0;
            if (n*inc >= 10 && n*inc < 100) {
                counter.put((n*inc)%10, true );
                counter.put((n*inc)/10, true );
            } else if (n*inc >= 100 && n*inc < 1000) {
                counter.put((((n*inc)%100)%10), true );
                counter.put((((n*inc)%100)/10), true );
                counter.put((n*inc)/100, true );
            } else {
                counter.put(n*inc, true);
            }
            for (int i = 0; i < 10; i++) {
                if (counter.containsKey(i)) {
                    count++;
                }
            }
            inc++;
        }
        return inc-1;
    }

    public static int depthGod(int n) {
        HashSet<Character> set = new HashSet<>();
        int deep = 1;
        while(set.size() != 10) {
            int val = n * deep;
            String k = String.valueOf(val);
            for(int i=0; i < k.length() ; i++) {
                set.add( k.charAt(i));
            }
            deep++;
        }
        return (deep -1);
    }
    public static void main(String[] args) {
        System.out.println(depth(8));
        System.out.println(depthGod(8));
    }
}
