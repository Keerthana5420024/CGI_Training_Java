//Program to find the area of triangle

import java.util.Scanner;

public class Area_of_triangle34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        float base=sc.nextFloat();
        System.out.println("Enter the height: ");
        float height=sc.nextFloat();
        float area=(0.5f*base*height);
        System.out.println("The area of the triangle is:  "+area);

    }
}
