package com.dsaleetcode.linklist.hasLoop;

public class Main {
    public static void main(String[] args) {
        LLHasLoop ll = new LLHasLoop(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println(ll.HasLoop());
    }
}
