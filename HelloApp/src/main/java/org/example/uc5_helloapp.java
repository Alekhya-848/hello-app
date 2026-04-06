public class uc5_helloapp {
    public static void main(String[] args) {
        // Step 1: Detect missing arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Initialize StringBuilder for efficient concatenation
            StringBuilder namesBuilder = new StringBuilder();
            boolean isFirst = true;

            // Step 3: Iterate using the enhanced for loop (for-each)
            for (String name : args) {
                // Conditionally add the comma and space before the next name
                if (!isFirst) {
                    namesBuilder.append(", ");
                }

                namesBuilder.append(name);
                isFirst = false; // After the first name, this remains false
            }

            // Step 4: Print the final dynamically built string
            System.out.println("Hello, " + namesBuilder.toString() + "!");
        }
    }
}