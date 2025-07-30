//Write a program on try catch block

public class Try_catch_102 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            // Try to divide by zero (will cause ArithmeticException)
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block handles the exception
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

