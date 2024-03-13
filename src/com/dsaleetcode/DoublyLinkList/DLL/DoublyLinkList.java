package com.dsaleetcode.DoublyLinkList.DLL;

public class DoublyLinkList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("head : "+ head.value);
    }

    public void getTail() {
        System.out.println("tail : "+ tail.value);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
