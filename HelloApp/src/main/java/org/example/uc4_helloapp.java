package org.example;

public class uc4_helloapp {
    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length > 0) {
            // Use StringBuilder to efficiently build the dynamic string
            StringBuilder namesBuilder = new StringBuilder();

            // Iterate through the args array using a traditional for loop
            for (int i = 0; i < args.length; i++) {
                namesBuilder.append(args[i]);

                // Add a comma and space after each name, EXCEPT for the very last one
                if (i < args.length - 1) {
                    namesBuilder.append(", ");
                }
            }

            // Output the final concatenated string
            System.out.println("Hello, " + namesBuilder.toString() + "!");

        } else {
            // Default fallback value if no arguments are passed
            System.out.println("Hello, World!");
        }
    }
}


}
