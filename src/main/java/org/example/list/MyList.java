package org.example.list;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MyList {
    private Node head;

    @Data
    @AllArgsConstructor
    class Node {
        private int value;
        private Node next;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val, null);
    }

    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void addAtPosition(int val, int position) {
        Node current = head;
        int size = 0;
        if (position < 0) {
            return;
        }
        if (size() == 0) {
            current.value = val;
            current.next = null;
        } else if (position == 0)
        {
            head = new Node(val, head);
        }

        else if (position > size()) {
            add(val);
        } else {
            Node prelucrare = new Node(val, null);
            while (size < position) {
                size++;
                current = current.next;
            }
            prelucrare.next = current.next;
            current.next = prelucrare;
        }
    }

    public int get(int position) {
        Node current = head;
        int size = 0;
        while (size != position) {
            size++;
            current = current.next;
        }
        return current.value;
    }

    public void remove(int position) {
        Node current = head;
        int size = 0;
        if(position == 0)
        {
            head = head.next;
            return ;
        }
        while (size < position - 1 ) {
            size++;
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void setAtPosition(int val, int position) {
        Node current = head;
        int size = 0;
        while (size != position) {
            size++;
            current = current.next;
        }
        current.value = val;
    }
}
