// Write a program on ArrayStoreException

public class ArrayStoreException_109 {
    public static void main(String[] args) {
        // Creating an array of type Object but it's actually a String[] at runtime
        Object[] strArray = new String[3];  // This compiles because String[] is a subtype of Object[]

        try {
           
            strArray[0] = "Hello";

            strArray[1] = 123;  // Causes runtime exception because we are trying to store integer in a string array
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e);
        }
    }
}
