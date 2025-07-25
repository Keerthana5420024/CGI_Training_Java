//Write a program to check prime number

import java.util.Scanner;


public class prime28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break;
                }
            }

            if (i == num) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
    
}
