package org.example;

public class ha2 {
    public static void main(String[] args) {
        String name;

        // Check if at least one argument is provided
        if (args.length > 0) {
            name = args[0];  // First command-line argument
        } else {
            name = "taher";  // Default value
        }

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}


