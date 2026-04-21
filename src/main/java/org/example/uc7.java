package org.example;
public class uc7 {
    public static void main(String[] args) {
        String names;
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }
        System.out.println("Hello, " + names);
    }
}