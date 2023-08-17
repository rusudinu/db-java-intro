package org.example.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, TreeSet<Student>> studentMap = new HashMap<>();

        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 9.5));
        students.add(new Student("Mark", 9.4));
        students.add(new Student("Mary", 8.5));
        students.add(new Student("Better Mary", 8.8));
        students.add(new Student("Better Peter", 7.8));
        students.add(new Student("Peter", 7.5));

        for(Student student : students) {
            int studentKey = student.getRoundedGrade();

            if(!studentMap.containsKey(studentKey)) {
                studentMap.put(studentKey, new TreeSet<>());
            }

            studentMap.get(studentKey).add(student);

        }

        for (Map.Entry<Integer, TreeSet<Student>> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
