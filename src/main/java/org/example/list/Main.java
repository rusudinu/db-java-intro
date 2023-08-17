package org.example.list;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.printList();

        list.addAtPosition(4, 0);
        list.printList();

        System.out.println(list.get(3));

        list.remove(0);
        list.printList();

        list.setAtPosition(-1, 1);
        list.printList();
    }
}
