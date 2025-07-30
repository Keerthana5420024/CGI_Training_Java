// Write a program on throw

public class Throw_104 {
    public static void main(String[] args) {
        int age = 15;  // Declare and initialize age

        try {
            if (age < 18) {
                // Throw an exception manually if age is less than 18
                throw new ArithmeticException("Age must be 18 or above to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (ArithmeticException e) {
            // Catch the thrown exception and print the message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
