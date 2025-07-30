// Write a program using try and finally block

public class Try_and_Finally_113 {
    public static void main(String[] args) {

        // Try block contains code that may throw an exception
        try {
            int result = 10 / 2; // Simple division operation
            System.out.println("Result: " + result); // Output the result
        } 
        
        // Finally block always executes, whether exception occurs or not
        finally {
            System.out.println("This is the finally block. It always executes.");
        }

    }
}
