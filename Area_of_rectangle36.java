//Write a program to find the area a rectangle


import java.util.Scanner;
public class Area_of_rectangle36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        float length=sc.nextFloat();
        System.out.println("Enter the breadth: ");
        float breadth=sc.nextFloat();
        float area = length*breadth;
        System.out.println("The area of the rectangle is:  "+area);
    }
    
}
