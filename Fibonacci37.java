//Write a program to find the Fibonacci series

import java.util.Scanner;

public class Fibonacci37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms of Fibonacci series you want: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("The Fibonacci series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
