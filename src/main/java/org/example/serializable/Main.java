package org.example.serializable;

import java.io.*;

public class Main {
    private final static String FILE_NAME = "car.json";

    public static void main(String[] args) {
        Car car = new Car("dacia", 4);
        saveCar(car);
        System.out.println(readCar());
    }

    private static Car readCar() {
        Car readCar = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            readCar = (Car) is.readObject();
            System.out.println(readCar);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return readCar;
    }

    private static void saveCar(Car car) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            os.writeObject(car);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
