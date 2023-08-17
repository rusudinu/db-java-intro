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
        account.deposit(amount);
    }

    @Override
    public void spend(double amount) {
        account.withdraw(amount);
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void feed(T animal) {
        spend(10);
        animal.setHungry(false);
    }
}
