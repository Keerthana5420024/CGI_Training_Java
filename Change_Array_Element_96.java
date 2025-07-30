//Write a program to change an array element 

import java.util.Scanner;

public class Change_Array_Element_96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int a = sc.nextInt();
        char arr[]=new char[a];
        System.out.println("Enter the elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.next().charAt(0);
        }

        for (int i=0;i<arr.length;i++){
            System.out.println("Index"+"["+i+"] = "+arr[i]);
        }

        arr[0]='v';

        System.out.println("Index"+"[0] = "+arr[0]);

    }}

