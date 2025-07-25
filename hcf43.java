//Write a program to find HCF of two numbers

import java.util.Scanner;

public class hcf43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}