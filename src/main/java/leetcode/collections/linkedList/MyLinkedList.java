package leetcode.collections.linkedList;


public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    protected class Node {
        int value;
        Node next = null;
    }

    public int size() {
        return this.length;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
            tail.next = null;
        }
        length++;
    }

    public void delete(int value){
        Node previousNode = head;
        Node currentNode = head;
        Node nextNode = head.next;

        while (true){
            nextNode =  currentNode.next;
            if(currentNode.value == value){
                previousNode.next = nextNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void printAll() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
