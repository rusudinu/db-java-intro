package org.example.genericlist;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T> {
    List<T> list = new ArrayList<>();

    public void add(T element) {
        // TODO implement
    }

    public void print() {
        System.out.println(list);
    }

    public boolean lookup(T element) {
        // TODO implement
        return false;
    }

    public void remove(T element) {
        // TODO implement
    }
}
