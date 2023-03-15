package ch.hslu.sw04.ex01;

public class HashTable {
    private final DataItem[] hashArray;
    private static final int SIZE = 10;

    public HashTable() {
        this.hashArray = new DataItem[SIZE];
    }

    public HashTable(DataItem[] hashes) {
        this.hashArray = hashes;
    }

    public void insert(int data, int key) {
        DataItem item = new DataItem(data, key);
        int index = hashCode(key);
        while (this.hashArray[index] != null) {
            index++;
            index %= SIZE;
        }
        hashArray[index] = item;
    }

    public int hashCode(int key) {
        return key % SIZE;
    }
}
