//Write a program on try with resources

import java.util.Scanner;

public class Try_with_resources_120 {
    public static void main(String[] args) {
        // try-with-resources automatically closes the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            // Catching any exception that occurs during input
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
