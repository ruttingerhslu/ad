package ch.hslu.sw03.ex05;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node node = new Node(2);

    void setChildren() {
        Node left = new Node(1);
        node.setLeftChild(left);

        Node right = new Node(3);
        node.setRightChild(right);
    }

    @Test
    void getValue() {
        assertEquals(2, node.getValue());
    }

    @Test
    void setValue() {
        node.setValue(4);

        assertEquals(4, node.getValue());
    }

    @Test
    void getLeftChild() {
        setChildren();

        assertEquals(1, node.getLeftChild().getValue());
    }

    @Test
    void getRightChild() {
        setChildren();

        assertEquals(3, node.getRightChild().getValue());
    }

    @Test
    void hasLeftChild() {
        setChildren();

        assertTrue(node.hasLeftChild());
    }

    @Test
    void hasRightChild() {
        setChildren();

        assertTrue(node.hasRightChild());
    }

    @Test
    void search() {
        setChildren();
        int query = 3;
        Node expected = new Node(query);

        Node actual = node.search(query);

        assertEquals(expected, actual);
    }

    @Test
    void insert() {
        Node inserted = new Node(4);

        node.insert(inserted);

        assertEquals(inserted, node.getRightChild());
    }

    @Test
    void compareTo() {
        Node lesser = new Node(1);

        assertTrue(node.compareTo(lesser.getValue()) < 0);
    }

    @Disabled
    public void equalsContract() {
        EqualsVerifier.forClass(Node.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }
}