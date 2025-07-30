//Write a program using multiple catch blocks

public class Multiple_catch_blocks_115 {
    public static void main(String[] args) {
        try {
            // Code that may cause multiple exceptions
            int[] numbers = {10, 20, 30};
            int result = numbers[3] / 0; // Causes ArrayIndexOutOfBoundsException first
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // Handles arithmetic exceptions like divide by zero
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            // Handles array index out of bounds exceptions
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        catch (Exception e) {
            // Handles any other exceptions
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after multiple catch blocks.");
    }
}
