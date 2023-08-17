package org.example.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, TreeSet<Student>> studentMap = new HashMap<>();

        List<Student> students = new ArrayList<>();
        // TODO add a few students


        // TODO create the studentMap


        for (Map.Entry<Integer, TreeSet<Student>> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
