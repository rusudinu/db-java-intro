package org.example.dogshelter;

import lombok.Data;

import java.util.List;

@Data
public class Animal {
    private String name;
    private double age;
    private List<Double> foodHistory;
    private boolean isHungry;
    private boolean isThirsty;
}
