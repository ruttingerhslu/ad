package ch.hslu.sw03.ex05;

import java.util.Objects;

public final class Node implements Comparable<Integer> {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node node) {
        this.leftChild = node;
    }

    public void setRightChild(Node node) {
        this.rightChild = node;
    }

    public boolean hasLeftChild() {
        return this.leftChild != null;
    }

    public boolean hasRightChild() {
        return this.rightChild != null;
    }

    public Node search(int query) {
        int result = this.compareTo(query);
        if (result == 0 && this.hashCode() == Objects.hash(query)) {
            return this;
        } else if(result < 0 && this.hasLeftChild()) {
            return this.getLeftChild().search(query);
        } else if(this.hasRightChild()) {
            return this.getRightChild().search(query);
        }
        return null;
    }

    public void insert(Node node) {
        int result = this.compareTo(node.getValue());
        if (result == 0) {
            this.setValue(node.getValue());
        } else if (result < 0) {
            if (this.hasLeftChild()) {
                this.getLeftChild().insert(node);
            } else {
                this.setLeftChild(node);
            }
        } else if (this.hasRightChild()) {
            this.getRightChild().insert(node);
        } else {
            this.setRightChild(node);
        }
    }

    @Override
    public int compareTo(Integer o) {
        return o.compareTo(this.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return getValue() == node.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "Value set in node: " + this.getValue();
    }
}
