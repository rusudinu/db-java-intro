package org.example.dogshelter;

public class Main {
    public static void main(String[] args) {
        Shelter<Dog> dogShelter = Shelter.builder().name("Test shelter").build();
        dogShelter.receiveDonation(100);
        dogShelter.receiveDonation(200);
        dogShelter.spend(50);
        dogShelter.addAnimal(new Dog("Labrador"));
        dogShelter.addAnimal(new Dog("Poodle"));
        System.out.println(dogShelter);
    }
}
