//Write a program to find the area(l*b) and volume(l*b*h)


import java.util.Scanner;

public class Area_and_volume39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input

        // Taking length input from the user
        System.out.print("Enter the length: ");
        float length = sc.nextFloat();

        // Taking breadth input from the user
        System.out.print("Enter the breadth: ");
        float breadth = sc.nextFloat();

        // Taking height input from the user
        System.out.print("Enter the height: ");
        float height = sc.nextFloat();

        // Calculating area of a rectangle (length * breadth)
        float area = length * breadth;

        // Calculating volume of a cuboid (length * breadth * height)
        float volume = length * breadth * height;

        // Printing the area and volume
        System.out.println("Area (length * breadth): " + area);
        System.out.println("Volume (length * breadth * height): " + volume);
    }
}

