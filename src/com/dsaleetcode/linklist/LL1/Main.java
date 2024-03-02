package com.dsaleetcode.linklist.LL1;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(5);
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(6);
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.removeLast();
        myLinkedList.getTail();
        myLinkedList.prepend(3);
        myLinkedList.removeLast();
        myLinkedList.removeLast();
        myLinkedList.removeLast();
        myLinkedList.prepend(8);
        myLinkedList.prepend(9);
        System.out.println(myLinkedList.get(1).value);
        myLinkedList.setCool(1, 2);
        myLinkedList.setCool(0, 1);
        myLinkedList.append(3);
        System.out.println(myLinkedList.reomve(1));;


        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }
}
