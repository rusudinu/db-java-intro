package org.example.list;

import lombok.Data;

public class MyList {
    private Node head;

    @Data
    class Node {
        private int value;
        private Node next;
    }

    public void printList() {
        // TODO implement
    }

    public void add(int val) {
        // TODO implement
    }

    public int size() {
        // TODO implement
        return -1;
    }

    public void addAtPosition(int val, int position) {
        // TODO implement
    }

    public int get(int position) {
        // TODO implement
        return -1;
    }

    public void remove(int position) {
        // TODO implement
    }

    public void setAtPosition(int val, int position) {
        // TODO implement
    }
}
