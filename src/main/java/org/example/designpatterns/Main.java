package org.example.designpatterns;

public class Main {
    public static void main(String[] args) {
        SingletonCar car1 = SingletonCar.getInstance("dacia", 4);
        SingletonCar car2 = SingletonCar.getInstance("dacia", 4);
        System.out.println(car1);
        System.out.println(car2);

        SingletonService service1 = SingletonService.instance();
        SingletonService service2 = SingletonService.instance();
        System.out.println(service1);
        System.out.println(service2);

        Car car3 = CarFactory.getCar(CarType.DACIA);
        Car car4 = CarFactory.getCar(CarType.RENAULT);
        Car car5 = CarFactory.getCar(CarType.PORSCHE);
        System.out.println(car3.getName());
        System.out.println(car4.getName());
        System.out.println(car5.getName());

        CarWithBuilder car6 = new CarWithBuilder.CarBuilder().name("dacia").doors(4).build();
        System.out.println(car6);
    }
}
