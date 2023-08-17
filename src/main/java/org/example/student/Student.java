package org.example.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getRoundedGrade() {
        return (int)Math.round(this.grade);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGrade(), this.getGrade());
    }
}
