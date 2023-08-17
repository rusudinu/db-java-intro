package designpatterns;

public class SingletonCar {
    private static SingletonCar instance = null;
    private String name;
    private int noDoors;

    private SingletonCar(String name, int noDoors) {
        this.name = name;
        this.noDoors = noDoors;
    }

    public static SingletonCar getInstance(String name, int noDoors) {
        if (instance == null) {
            instance = new SingletonCar(name, noDoors);
        }
        return instance;
    }
}
