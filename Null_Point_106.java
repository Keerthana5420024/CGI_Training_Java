// Write a program on NullPointerException

public class Null_Point_106 {

    public static void main(String[] args) {
        String str = null;  // str is not pointing to any object

        try {
            // Trying to access length of null string will cause NullPointerException
            int length = str.length();  // Exception occurs here
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

    }
}
