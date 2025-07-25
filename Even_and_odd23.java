//Write a program to find even and odd number

import java.util.Scanner;

public class Even_and_odd23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num +" is even");
        }else{
            System.out.println(num +" is odd");
        }
    }
    
}
