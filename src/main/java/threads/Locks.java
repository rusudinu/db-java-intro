package threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    private static Lock lock = new ReentrantLock(); // can obtain the lock multiple times
    private static Long balance = 0L;

    public static void main(String[] args) {
        // withLockDemo();
        withoutLockDemo();
    }

    private static void locks() {
        lock.lock();
        try {
            balance += 1;
        } finally {
            lock.unlock();
        }
    }

    private static void withoutLocks() {
        balance += 1;
    }

    private static void withoutLockDemo() {
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(Locks::withoutLocks);
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

    private static void withLockDemo() {
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(Locks::locks);
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
