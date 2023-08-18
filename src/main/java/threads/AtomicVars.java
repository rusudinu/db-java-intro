package threads;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicVars {
    private static AtomicLong balance = new AtomicLong(0);

    public static void main(String[] args) {
        withoutLockDemo();
    }

    private static void increment() {
        balance.incrementAndGet();
    }

    private static void withoutLockDemo() {
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(AtomicVars::increment);
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(balance);
    }
}
