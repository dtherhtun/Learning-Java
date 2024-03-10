package com.dsaleetcode.linklist.partitionList;

public class Main {
    public static void main(String[] args) {
        LLPartitionList ll = new LLPartitionList(3);
        ll.append(8);
        ll.append(5);
        ll.append(10);
        ll.append(2);
        ll.append(1);

//        ll.printList();
        ll.partitionList(5);
//        System.out.println("----------------");
        ll.printList();
    }
}
