package ch.hslu.sw02.ex02;

public class Node {
    public Node next;
    public int data;

    public Node() {
        next = null;
        data = Integer.MIN_VALUE;
    }

    public Node(int data) {
        next = null;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int value) {
        data = value;
    }

    public String toString() {
        return Integer.toString(data);
    }
}