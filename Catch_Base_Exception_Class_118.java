//Write a program catching base exception class only

public class Catch_Base_Exception_Class_118 {
    public static void main(String[] args) {
        try {
            // Code that may throw different types of exceptions
            int result = 10 / 0;  // ArithmeticException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (Exception e) {
            // Base exception class catches all exceptions that are subclasses of Exception
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

    }
}
