//Write a program on try with multiple resources

// Write a program on try with multiple resources

import java.util.Formatter;
import java.util.Scanner;

public class Try_with_multiple_resources_122 {
    public static void main(String[] args) {
        // try-with-resources block with Scanner and Formatter
        try (
            Scanner sc = new Scanner(System.in);  // resource 1
            Formatter formatter = new Formatter("output.txt") // resource 2
        ) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            // Writing user input to file using Formatter
            formatter.format("Hello, %s!%n", name);

            System.out.println("Name written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

