package com.dsaleetcode.DoublyLinkList.DLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkList DLL = new DoublyLinkList(1);

        DLL.append(2);
        DLL.append(3);
        DLL.append(4);
        DLL.removeLast();

        DLL.prepend(0);

        DLL.getHead();
        DLL.getTail();
        DLL.printList();
        DLL.length();
        System.out.println("Remove First "+ DLL.removeFirst().value);
        DLL.length();
    }
}
