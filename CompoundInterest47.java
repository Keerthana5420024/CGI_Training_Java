//Program to Calculate Compound Interest

import java.util.Scanner;

public class CompoundInterest47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();
        
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        
        double compoundInterest = principal * Math.pow(1 + (rate / (100 * n)), n * time) - principal;
        System.out.println("Compound interest is: " + compoundInterest);
        
        scanner.close();
    }
}