package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(0, 1);
        System.out.println(list);

        list.addAll(List.of(4, 5, 6));
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.contains(2));

        list.remove(0);
        System.out.println(list);

        list.remove(Integer.valueOf(2));
        System.out.println(list);

        list.addAll(List.of(2, 2, 2));
        System.out.println(list);
        System.out.println(new HashSet<>(list));
    }
}
