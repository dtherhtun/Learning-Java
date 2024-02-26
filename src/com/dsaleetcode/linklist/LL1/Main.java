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
        myLinkedList.removeFirst();
        myLinkedList.removeFirst();
        System.out.println(myLinkedList.removeFirst());

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
