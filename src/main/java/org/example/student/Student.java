package org.example.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private double grade;

    public int getRoundedGrade() {
        return (int) Math.round(grade);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(grade, o.grade);
    }
}
