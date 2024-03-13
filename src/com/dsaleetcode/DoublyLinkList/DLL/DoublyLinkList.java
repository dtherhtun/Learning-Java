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
        if (head == null) {
            System.out.println("head is null");
        } else {
            System.out.println("head : "+ head.value);
        }

    }

    public void getTail() {
        if (tail == null) {
            System.out.println("tail is null");
        } else {
            System.out.println("tail : "+ tail.value);
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void length(){
        System.out.println("Length : "+ length);
    }

//    public Node removeLast() {
//        Node temp = tail;
//        if ( length == 0) {
//            return null;
//        } else {
//            tail = temp.prev;
//            temp.prev = null;
//            if (tail != null) {
//                tail.next = null;
//            }
//            length--;
//        }
//
//        if (length == 0) {
//            tail = null;
//            head = null;
//        }
//        return temp;
//    }
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else  {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length --;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0 ) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
