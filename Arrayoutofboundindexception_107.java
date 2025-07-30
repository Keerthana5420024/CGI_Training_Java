// Write a program on ArrayIndexOutOfBoundsException

public class Arrayoutofboundindexception_107 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30}; // Array with 3 elements (index 0 to 2)

        try {
            // Trying to access index 3, which does not exist
            System.out.println("Element at index 3: " + numbers[3]); // Exception occurs here
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
