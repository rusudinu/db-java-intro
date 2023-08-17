package org.example.internalclasses;

public class Main {
    public static void main(String[] args) {
        Extern extern = new Extern();
        Extern.Intern intern = extern.new Intern();
        intern.method2();

        intern.method3();
    }
}
