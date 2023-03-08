package ch.hslu.sw02.ex04;

import java.util.Arrays;

public class Queue<Item> {
    private final int capacity;
    public int readPos  = -1;
    public int writePos = -1;
    private final Item[] elements;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = (Item[]) new Object[capacity];
    }

    public void enqueue(Item item) {
        incrementWritePos();
        elements[writePos] = item;
    }

    public Item dequeue() {
        incrementReadPos();
        Item element = elements[readPos];
        elements[readPos] = null;

        if (readPos == writePos) {
            readPos = -1;
            writePos = -1;
        }

        return element;
    }

    public void incrementWritePos() {
        writePos++;

        if (writePos == capacity) {
            writePos = 0;
            if (readPos == -1) {
                readPos = 0;
            }
            return;
        }

        if (writePos == readPos) {
            incrementReadPos();
        }
    }

    public void incrementReadPos() {
        readPos++;

        if (readPos == capacity) {
            readPos = 0;
        }
    }

    public String toString() {
        return Arrays.toString(elements);
    }
}
