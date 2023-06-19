package com.turing.javase4thbatch.chapter9;

interface JobLevel {
    int ASSISTANT_MANAGER = 1;
    int MANAGER = 2;
}
public class InterfaceConstant {
    public static void main(String[] args) {
        int level = JobLevel.ASSISTANT_MANAGER;
        // JobLevel.ASSISTANT_MANAGER = 3; it is constant. (public, static , final)
    }
}
