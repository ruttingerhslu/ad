package ch.hslu.sw03.ex05;

public class Node<T> implements Comparable<T> {
    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node<T> node) {
        this.leftChild = node;
    }

    public void setRightChild(Node<T> node) {
        this.rightChild = node;
    }
}
