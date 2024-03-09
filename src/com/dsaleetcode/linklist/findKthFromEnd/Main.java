package com.dsaleetcode.linklist.findKthFromEnd;

public class Main {
    public static void main(String[] args) {
        LLFindKthFromEnd ll = new LLFindKthFromEnd(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

//        System.out.println(ll.findKthFromEnd(1));
//        System.out.println(ll.findKthFromEnd(2));
//        System.out.println(ll.findKthFromEnd(3));
//        System.out.println(ll.findKthFromEnd(4));
        System.out.println(ll.findKthFromEnd(5).value);
//        System.out.println(ll.findKthFromEnd(6));
        ll.printAll();
    }
}
