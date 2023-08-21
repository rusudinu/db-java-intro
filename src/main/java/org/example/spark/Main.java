package org.example.spark;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");

        // http://localhost:4567/hello/Vasile
        get("/hello/:name", (req, res) -> "Hello, " + req.params(":name") + '!');
    }
}
