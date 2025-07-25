//Write a program to find the area of a square

import java.util.Scanner;

public class Area_of_square35 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side measure in cm: ");
        float side=sc.nextFloat();
        float area=(side*side);
        System.out.println("The area of the square is:  "+area);

    }
}
