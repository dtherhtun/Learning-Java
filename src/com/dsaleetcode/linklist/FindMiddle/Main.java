package com.dsaleetcode.linklist.FindMiddle;

public class Main {
    public static void main(String[] args) {
        FindMiddleLinkedList myLinkedList = new FindMiddleLinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.printList();

        System.out.println(myLinkedList.findMiddleNode().value);
    }
}
