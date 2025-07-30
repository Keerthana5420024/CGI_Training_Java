//Write a program to handle multiple exceptions in the catch block

public class Handle_Multiple_Exception_in_Catch_117 {

    public static void main(String[] args) {
        try {
            // This will throw ArithmeticException
            int result = 10 / 0;

            // This line won't be reached because of the exception above
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Would throw ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // This block handles both exceptions
            System.out.println("Caught Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

    }
}
