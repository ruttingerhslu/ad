package ch.hslu.sw03.ex05;

public class BinaryTree implements Tree{
    private static final int order = 2;
    private Node<Integer> root;
    private int weight;
    private int height;

    public BinaryTree() {
        Node<Integer> num1 = new Node<>(1);
        Node<Integer> num2 = new Node<>(2);
        Node<Integer> num3 = new Node<>(3);
        Node<Integer> num4 = new Node<>(4);
        Node<Integer> num5 = new Node<>(5);
        Node<Integer> num6 = new Node<>(6);
        Node<Integer> num7 = new Node<>(7);
        Node<Integer> num8 = new Node<>(8);
        Node<Integer> num9 = new Node<>(9);
        Node<Integer> num10 = new Node<>(10);
        Node<Integer> num11 = new Node<>(11);
        num2.setLeftChild(num1);
        num2.setRightChild(num3);
        num6.setLeftChild(num5);
        num4.setLeftChild(num2);
        num4.setRightChild(num6);
        num8.setRightChild(num9);
        num10.setLeftChild(num8);
        num10.setRightChild(num11);
        num7.setLeftChild(num4);
        num7.setRightChild(num10);
        this.setRoot(num7);
    }

    public static void main(String[] args) {

    }

    @Override
    public void insert(int node) {
    }

    @Override
    public void remove(int node) {

    }

    @Override
    public void search(int node) {

    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public Node<Integer> getRoot() {
        return root;
    }
}
