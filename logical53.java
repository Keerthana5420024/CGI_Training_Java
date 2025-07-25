// Program on Logical Operators

import java.util.Scanner;

public class logical53{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("Both numbers are positive");
        } else if (a > 0 || b > 0) {
            System.out.println("At least one number is positive");
        } else {
            System.out.println("Neither number is positive");
        }
        scanner.close();
    }
}