package org.example.exceptions;

public class Main {
    public static void main(String[] args) {
        //thisWillCrash();
        thisWontCrash();
        //throwingException();
        catchingException();
        finallyFinally();
        // throwingIncorrectUserException();
    }

    static void thisWillCrash() {
        System.out.println(3 / 0);
    }

    static void thisWontCrash() {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
    }

    static void throwingException() {
        throw new ArithmeticException("I threw this myself!");
    }

    static void catchingException() {
        try {
            throwingException();
        } catch (ArithmeticException e) {
            System.out.println("I caught my exception!");
        }
    }

    static void finallyFinally() {
        try {
            throwingException();
        } catch (ArithmeticException e) {
            System.out.println("I caught my exception!");
        } finally {
            System.out.println("I'm always executed!");
        }
    }

    static void throwingIncorrectUserException() {
        throw new IncorrectUserException("I created this exception myself!");
    }
}
