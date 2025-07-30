//Write a program throwing multiple exceptions

public class Throwing_Multiple_Exceptions_116 {
    // This method performs a division by zero and throws ArithmeticException
    public static void riskyDivide() throws ArithmeticException {
        int result = 10 / 0; // This will cause ArithmeticException
    }

    // This method tries to access an invalid index of the array and throws ArrayIndexOutOfBoundsException
    public static void riskyArrayAccess() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // This will cause ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        // Handling ArithmeticException using try-catch block
        try {
            riskyDivide(); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Handling ArrayIndexOutOfBoundsException using another try-catch block
        try {
            riskyArrayAccess(); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

    }
}

