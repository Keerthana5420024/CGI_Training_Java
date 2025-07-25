//Write a program to display all prime numbers from 1 to 10


public class Prime1to10_49 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 10 are:");
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
}