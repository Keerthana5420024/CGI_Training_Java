//Write a program to find the squareroot of a number

import java.util.Scanner;

public class SquareRoot61 {
    public static void main(String [] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=a.nextInt();
        double squareroot=Math.sqrt(num);
        System.out.println("The square root of"+num+"is :"+squareroot);
    }
}
