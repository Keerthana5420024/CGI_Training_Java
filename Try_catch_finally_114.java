//Write a program using try, catch and finally

public class Try_catch_finally_114 {
    public static void main(String[] args) {

        try {
            // Code that might throw an exception
            int number = 10;
            int result = number / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // This block handles the exception
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        finally {
            // This block always executes
            System.out.println("This is the finally block. It always runs.");
        }

    }
}
