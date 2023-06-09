package com.turing.javase4thbatch.chapter6;

public class GCDemo {
    public static void main(String[] args) throws InterruptedException {
        printMemoryUsage();
        double[][] arr = new double[10][10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new double[100000];
        }
        printMemoryUsage();
        System.gc();

        Thread.sleep(10000);
        printMemoryUsage();
    }

    public static void printMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Memory Usage - Total: " + totalMemory + " bytes, Free: " + freeMemory + " bytes, Used: " + usedMemory + " bytes");
    }
}
