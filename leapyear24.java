//Write a program to find whether if the year is a leap year

import java.util.Scanner;

public class leapyear24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year: ");
        int year=sc.nextInt();
        if ((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    
    }
    
}
