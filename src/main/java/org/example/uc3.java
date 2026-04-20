package org.example;

public class uc3 {

            // Check if arguments are provided
            if (args.length > 0) {

                // Use StringBuilder to combine names
                StringBuilder nameBuilder = new StringBuilder();

                for (int i = 0; i < args.length; i++) {
                    nameBuilder.append(args[i]);

                    // Add comma and space except for last name
                    if (i < args.length - 1) {
                        nameBuilder.append(", ");
                    }
                }

                // Display greeting with all names
                System.out.println("Hello, " + nameBuilder.toString());

            } else {
                // Default case when no arguments are provided
                System.out.println("Hello, World!");
            }
        }
