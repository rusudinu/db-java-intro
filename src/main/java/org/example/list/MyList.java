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
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public void add(int val) {
        Node node = new Node();
        node.setValue(val);
        node.setNext(null);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void addAtPosition(int val, int position) {
        if (position < 0 || position > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node node = new Node();
        node.setValue(val);
        node.setNext(null);

        if (position == 0) {
            node.setNext(head);
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    public int get(int position) {
        if (position < 0 || position >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void remove(int position) {
        if (position < 0 || position >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (position == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public void setAtPosition(int val, int position) {
        if (position < 0 || position >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        current.setValue(val);
    }
}
