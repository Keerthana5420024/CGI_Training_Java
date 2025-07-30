//Write a program to close resources using finally block

import java.util.Scanner;

public class Close_resources_using_finally_121 {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in); // Resource opened
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Closing resource in finally block to ensure it closes no matter what
            if (sc != null) {
                sc.close();
                System.out.println("Scanner resource closed.");
            }
        }

        System.out.println("Program completed.");
    }
}