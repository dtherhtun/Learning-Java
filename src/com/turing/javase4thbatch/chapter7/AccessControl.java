package com.turing.javase4thbatch.chapter7;

class Parent {
    private int privateData;
    protected int parentData;

    int data;
}
public class AccessControl extends Parent{
    public AccessControl() {
        parentData = 200;
    }
}
