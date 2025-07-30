//Write a program to create an array of integers and print their standard output

import java.util.Scanner;

public class Integer_Array_94 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("Index"+"["+i+"] = "+arr[i]);

        }
    }
}
