//Write a program to generate a table of a given number, take input from user

import java.util.Scanner;

public class table27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+ "*"+i+"="+num*i);
        }
    }
}
