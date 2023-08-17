package org.example.generics;

public class Main {
    public static void main(String[] args) {
        GenericsDemo<Integer> genericsDemo = new GenericsDemo<>();
        genericsDemo.setX(1);
        System.out.println(genericsDemo.getX());

        GenericsDemo<String> newGenericsDemo = new GenericsDemo<>();
        newGenericsDemo.setX("a");
        System.out.println(newGenericsDemo.getX());

        GenericsDemo<Object> newNewGenericsDemo = new GenericsDemo<>();
        newNewGenericsDemo.setX("a");
        System.out.println(newNewGenericsDemo.getX());
        newNewGenericsDemo.setX(2);
        System.out.println(newNewGenericsDemo.getX());
    }
}
