package org.example.genericlist;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T> {
    List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void print() {
        System.out.println(list);
    }

    public boolean lookup(T element) {
        return list.contains(element);
    }

    public void remove(T element) {
        list.remove(element);
    }
}
