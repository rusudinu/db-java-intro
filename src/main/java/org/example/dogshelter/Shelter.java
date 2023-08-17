package org.example.dogshelter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shelter<T extends Dog> implements IShelter {
    private String name;
    @Builder.Default
    private Account account = new Account();
    @Builder.Default
    private List<Animal> animals = new ArrayList<>();

    @Override
    public void receiveDonation(double amount) {
        // TODO implement
    }

    @Override
    public void spend(double amount) {
        // TODO implement
    }

    public void addAnimal(T animal) {
        // TODO implement
    }

    public void feed(T animal) {
        // TODO implement
    }
}
