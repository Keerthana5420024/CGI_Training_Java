//Check Armstrong Number Between Two Integers

import java.util.Scanner;

public class Checkarmstrong51 {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int length = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting integer: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending integer: ");
        int end = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}