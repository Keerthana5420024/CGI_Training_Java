//Program to Multiply Two Floating Point Numbers

import java.util.Scanner;

public class multiplyfloat52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second float number: ");
        float num2 = scanner.nextFloat();

        float result = num1 * num2;
        System.out.println("Product: " + result);
        scanner.close();
    }
}
