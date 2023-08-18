package threads;

import java.util.concurrent.Semaphore;

public class Semaphores {
    // Locks cannot be shared between more than one thread processes
    // but semaphores can have multiple processes of the same thread.
    // aka. allows more than 1 thread to access a shared resource at a time

    private static final int MAX_THREADS = 4;
    private static final Semaphore semaphore = new Semaphore(MAX_THREADS);

    public void intersectionCross() {
        try {
            semaphore.acquire();
            System.out.println("One more car crosses the intersection : " + semaphore.availablePermits());
            semaphore.release();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Semaphores semaphores = new Semaphores();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(semaphores::intersectionCross);
            threads[i].start();
        }
    }
}
