package ch.hslu.sw03.ex05;

public class BinaryTree implements Tree{
    private Node root;

    public BinaryTree() {
        Node num1 = new Node(1);
        Node num2 = new Node(2);
        Node num3 = new Node(3);
        Node num4 = new Node(4);
        Node num5 = new Node(5);
        Node num6 = new Node(6);
        Node num7 = new Node(7);
        Node num8 = new Node(8);
        Node num9 = new Node(9);
        Node num10 = new Node(10);
        Node num11 = new Node(11);
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
        BinaryTree tree = new BinaryTree();
        tree.insert(13);
        System.out.println(tree.search(11).toString());
        tree.inorder(tree.getRoot());
        tree.preorder(tree.getRoot());
        tree.postorder(tree.getRoot());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public void insert(int value) {
        this.root.insert(new Node(value));
    }

    @Override
    public void remove(int node) {

    }

    @Override
    public Node search(int query) {
        return this.root.search(query);
    }

    public void inorder(Node node) {
        if (node.hasLeftChild()) {
            inorder(node.getLeftChild());
        }
        System.out.println(node.getValue());
        if (node.hasRightChild()) {
            inorder(node.getRightChild());
        }
    }

    public void preorder(Node node) {
        System.out.println(node.getValue());
        if (node.hasLeftChild()) {
            inorder(node.getLeftChild());
        }
        if (node.hasRightChild()) {
            inorder(node.getRightChild());
        }
    }

    public void postorder(Node node) {
        if (node.hasLeftChild()) {
            inorder(node.getLeftChild());
        }
        if (node.hasRightChild()) {
            inorder(node.getRightChild());
        }
        System.out.println(node.getValue());
    }
}
