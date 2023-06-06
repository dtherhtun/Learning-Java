package com.turing.javase4thbatch.chapter4;

public class arrayDemo {
    public static void main(String[] args) {
        int[] ages = {23,34,20,30,40};
        System.out.println("Ages[0] -> "+ages[0]);
        System.out.println("Ages[4] -> "+ages[4]);
        String[] mothsName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int month = 8;
        System.out.println("Month name ->   "+ mothsName[month-1]);
    }
}
