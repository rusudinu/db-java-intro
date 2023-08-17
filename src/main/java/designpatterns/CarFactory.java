package designpatterns;

enum CarType {
    DACIA, RENAULT, PORSCHE
}

class Car {
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

class Dacia extends Car {

}

class Renault extends Car {
}

class Porsche extends Car {
}

public class CarFactory {
    public static Car getCar(CarType carType) {
        if (carType == null) {
            return null;
        }
        return switch (carType) {
            case DACIA -> new Dacia();
            case RENAULT -> new Renault();
            case PORSCHE -> new Porsche();
        };
    }
}
