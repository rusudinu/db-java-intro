package org.example.genericlist;

public class Main {
    public static void main(String[] args) {
        MyGenericList<String> stringList = new MyGenericList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.print();
        System.out.println(stringList.lookup("Hello"));
        stringList.remove("Hello");
        stringList.print();

//        String x = "lllll";
//        x = x.replaceAll("l", "llllllllll");
//        x.repeat(10);
    }
}
