package ch.hslu.sw02.ex02;

public class LinkedList {
    private Node head;

    public void addHead(Node node) {
        node.next = this.head;
        this.head = node;
    }

    public void removeHead() {
        this.head = head.next;
    }

    public Node getHead() {
        return head;
    }
}
