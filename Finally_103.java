// Write a program on finally block

public class Finally_103 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            // This will throw ArithmeticException (division by zero)
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block handles the exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // This block always runs whether an exception occurs or not
            System.out.println("This is the finally block. It always executes.");
        }

    }
}
