//Write a program catching base and child exception classes

public class Catch_base_and_child_exception_class_119 {
    public static void main(String[] args) {
        try {
            // This will cause an ArithmeticException (child of Exception)
            int result = 10 / 0;
        } catch (ArithmeticException ae) {
            // Catching the specific child exception class
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
        } catch (Exception e) {
            // Catching the base exception class
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
