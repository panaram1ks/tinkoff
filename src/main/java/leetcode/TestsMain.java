package leetcode;

import leetcode.collections.linkedList.MyLinkedList;

public class TestsMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(100);
        myLinkedList.add(200);
        myLinkedList.add(300);
        myLinkedList.add(400);
        myLinkedList.add(500);
        myLinkedList.printAll();
        System.out.println();

        myLinkedList.delete(300);
        myLinkedList.printAll();

    }
}
