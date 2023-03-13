package ch.hslu.sw03.ex05;

import java.util.Objects;

public class Node implements Comparable<Integer> {
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

    public Node search(int query) {
        int result = this.compareTo(query);
        if (result == 0) {
            return this;
        } else if(result < 0 && this.getLeftChild() != null) {
            return this.getLeftChild().search(query);
        } else if(this.getRightChild() != null) {
            return this.getRightChild().search(query);
        }
        return null;
    }

    public void insert(Node node) {
        int result = this.compareTo(node.getValue());
        if (result == 0) {
            this.setValue(node.getValue());
        } else if (result < 0) {
            if (this.getLeftChild() != null) {
                this.getLeftChild().insert(node);
            } else {
                this.setLeftChild(node);
            }
        } else if (this.getRightChild() != null) {
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
        return getValue() == node.getValue() && Objects.equals(getLeftChild(), node.getLeftChild()) && Objects.equals(getRightChild(), node.getRightChild());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getLeftChild(), getRightChild());
    }

    @Override
    public String toString() {
        return "Value set in node: " + this.getValue();
    }
}
