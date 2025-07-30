//Write a program to print the array of strings     

import java.util.Scanner;

public class String_Array_95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int len=sc.nextInt();
        String arr[]=new String[len];
        System.out.println("Enter the elements:");
        for (int i=0;i<len;i++){
            arr[i]=sc.next();
        }

        for (int i=0;i<arr.length;i++){
             System.out.println("Index"+"["+i+"] = "+arr[i]);
        }
    }
}
