// Write a program on user defined exception

//Create a simple custom exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class User_Defined_Exception_110 {
    public static void main(String[] args) {
        try {
            // Manually throw the custom exception
            throw new MyException("This is a user-defined exception.");
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
