package com.turing.javase4thbatch.chapter12;

enum Gender {
    MALE,
    FEMALE;
}
public class WhyEnum {
    public static void main(String[] args) {
        // final int MALE = 0;
        // final int FEMALE = 1;
        // int gender = MALE;

        // System.out.println("Gender "+ gender); // OUTPUT: Gender 0

        Gender gender = Gender.FEMALE;
        System.out.println("Gender "+ gender);

        if (gender == Gender.FEMALE) {
            System.out.println("It is female.");
        }

        for (Gender g : Gender.values()) {
            System.out.println("G "+g);
        }

        gender = Gender.valueOf("MALE"); // Case sensitive IllegalArgumentException
        System.out.println("Gender "+ gender);
    }
}
