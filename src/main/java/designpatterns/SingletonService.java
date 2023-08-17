package designpatterns;

public class SingletonService {
    private static SingletonService instance = null;

    private SingletonService() {
    }

    public static SingletonService instance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    private int getRand() {
        return (int) (Math.random() * 100);
    }
}
