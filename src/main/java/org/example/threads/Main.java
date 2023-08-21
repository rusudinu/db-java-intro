package org.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // example1();
        // example2();
        // example3();
        // threadPool();
    }

    private static void example1() {
        Thread[] employees = new Thread[30];
        for (int i = 0; i < 30; i++) {
            EmployeeRunnable employee = new EmployeeRunnable(i);
            employees[i] = new Thread(employee);
            employees[i].start();
        }

        System.out.println("--------------------");

        Thread[] employeesT = new Thread[30];
        for (int i = 0; i < 30; i++) {
            EmployeeThread employee = new EmployeeThread(i);
            employeesT[i] = new Thread(employee);
            employeesT[i].start();
        }
    }

    private static void example2() {
        Thread[] employees = new Thread[30];

        for (int i = 0; i < 30; i++) {
            EmployeeRunnable employee = new EmployeeRunnable(i);
            employees[i] = new Thread(employee);
            employees[i].start();
        }

        for (int i = 0; i < 30; i++) {
            try {
                employees[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("--------------------");

        Thread[] employeesT = new Thread[30];

        for (int i = 0; i < 30; i++) {
            EmployeeThread employee = new EmployeeThread(i);
            employeesT[i] = new Thread(employee);
            employeesT[i].start();
        }

        for (int i = 0; i < 30; i++) {
            try {
                employeesT[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void example3() {
        Thread[] employees = new Thread[30];

        for (int i = 0; i < 30; i++) {
            EmployeeRunnable employee = new EmployeeRunnable(i);
            employees[i] = new Thread(employee);
            employees[i].start();
            try {
                employees[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("--------------------");

        Thread[] employeesT = new Thread[30];

        for (int i = 0; i < 30; i++) {
            EmployeeThread employee = new EmployeeThread(i);
            employeesT[i] = new Thread(employee);
            employeesT[i].start();
            try {
                employeesT[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void threadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 30; i++) {
            EmployeeRunnable employee = new EmployeeRunnable(i);
            executorService.submit(employee);
        }
        executorService.shutdown();
    }
}
