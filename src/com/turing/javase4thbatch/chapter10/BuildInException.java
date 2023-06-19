package com.turing.javase4thbatch.chapter10;

public class BuildInException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Uppercase"+str.toLowerCase());
        } catch (NullPointerException ne) {
            System.out.println("Ne "+ ne.getMessage());
        }

        System.out.println("Another line");

        int[] arr = new int[]{1,2};
        try {
            arr[3] =  4;
            System.out.println("This line will not run if exception happen");
        }catch (NullPointerException ne) {
            System.out.println("AE "+ ne.getMessage());
        }catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("AE "+ ae.getMessage());
        }
    }
}
