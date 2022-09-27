package isel.deetc.cs;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(3000);
        get("/hello", (req, res) -> "Hello World");
    }
}
