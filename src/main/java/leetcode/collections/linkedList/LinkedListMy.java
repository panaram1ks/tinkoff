package leetcode.collections.linkedList;


public class LinkedListMy {

    private Node head;
    private Node tail;
    private int length;

    public LinkedListMy(int value) {
        Node head = new Node();
        head.value = value;
        head.next = null;
        this.head = head;
        tail = head;
        length = 1;
    }

    protected class Node {
        int value;
        Node next = null;
    }

    public int size() {
        return this.length;
    }

    public void append(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;

        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node();
        newNode.value = value;

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(int index, int value) {
        if (index <= 0) {
            this.prepend(value);
            return;
        } else if (index > length) {
            this.append(value);
            return;
        }
        Node insertNode = new Node();
        insertNode.value = value;
        insertNode.next = null;

        Node leader = traverseToIndex(index - 1);
        Node holdingPointer = leader.next;

        leader.next = insertNode;
        insertNode.next = holdingPointer;
        length++;
    }

    private Node traverseToIndex(int index) {
        int counter = 0;
        Node currentNode = this.head;
        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public void remove(int index) {
        Node leader = traverseToIndex(index - 1);
        Node unwantedNode = leader.next;
        leader.next = unwantedNode.next;
        length--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append("value=" + currentNode.value);
            sb.append(",");
            sb.append("\n");
            currentNode = currentNode.next;
        }
        sb.append("tail value=" + tail.value).append("\n");
        sb.append("length=" + length);
        return sb.toString();
    }

}
