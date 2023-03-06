package ch.hslu.sw02.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    Node node = new Node(1);
    LinkedList list = new LinkedList(node);

    @Test
    void getHead() {
        assertEquals(node, list.getHead());
    }

    @Test
    void setHead() {
        list.setHead(node);
        assertEquals(node, list.getHead());
    }

    @Test
    void removeHead() {
        list.removeHead();
        assertNull(list.getHead());
    }

    @Test
    void size() {
        assertEquals(1, list.size());
    }

    @Test
    void isEmpty() {
        assertFalse(list.isEmpty());
    }

    @Test
    void clearList() {
        list.clearList();
        assertTrue(list.isEmpty());
    }
}