package com.compro.isIsolated;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;

public class Main {
    public static int isIsolated(long n) {
        Instant startTime = Instant.now();
        if (n > 2097152 || n < 1) return -1;
        long square = n * n;
        long cube = square * n;
        HashSet<Long> c = new HashSet<>();
        while (cube > 0) {
            long i = cube % 10;
            c.add(i);
            cube = cube / 10;
        }
        while (square > 0) {
            long i = square % 10;
            if (c.contains(i)) {
                return 0;
            }
            square = square / 10;
        }
        Instant stopTime = Instant.now();
        System.out.println(Duration.between(startTime, stopTime).toNanos());
        return 1;
    }
    public static int isIsolatedGod(long n) {
        Instant startTime = Instant.now();
        if (n < 1 || n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = n * n * n;
        String strSquare = String.valueOf(square);
        String strCube = String.valueOf(cube);
        for(int i=0 ; i< strSquare.length();i++) {
            for(int k=0; k < strCube.length();k++) {
                if(strSquare.charAt(i) == strCube.charAt(k)) {
                    return 0;
                }
            }
        }
        Instant stopTime = Instant.now();
        System.out.println(Duration.between(startTime, stopTime).toNanos());
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(163));
        System.out.println("-----------------");
        System.out.println(isIsolatedGod(163));
    }
}
