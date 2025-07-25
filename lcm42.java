//Write a program to find LCM of two numbers
import java.util.Scanner;

public class lcm42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = (Math.abs(num1 * num2)) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}