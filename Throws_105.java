// Write a program on throws

public class Throws_105 {

    // This method declares that it may throw an exception
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;  // May throw ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            // Call the method that might throw an exception
            divide(10, 0);  // Division by zero
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
