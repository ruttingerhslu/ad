package ch.hslu.sw02.ex02;

public class LinkedList {
    Node head;
    private int size;

    LinkedList(Node head) {
        setHead(head);
    }

    public synchronized Node getHead() {
        return head;
    }

    public synchronized void setHead(Node node) {
        node.setNext(head);
        head = node;
        size++;
    }

    public synchronized Node removeHead() {
        Node node = head;
        if (node != null) {
            head = node.getNext();
            node.setNext(null);
        }
        return node;
    }

    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + "," + temp.getData();
            temp = temp.getNext();
        }
        return result + "]";
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clearList() {
        head = null;
        size = 0;
    }
}
