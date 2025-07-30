// Write a program on IllegalThreadStateException

public class IllegalThreadException_108 {
    public static void main(String[] args) {
        // Creating a thread using an anonymous Runnable class
        Thread t = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        t.start(); // Starting the thread first time - valid

        try {
            t.start(); // Starting the same thread again - causes IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught IllegalThreadStateException: " + e.getMessage());
        }

        System.out.println("Program ends.");
    }
}
