package org.example;

public class uc3_helloapp {
    public static void main(String[] args) {
        String name = "World";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("hello," + name + "!");
    }
}
