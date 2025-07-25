//Convert Integer to Float

import java.util.Scanner;

public class IntToFloat59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        float floatNum = (float) num;
        System.out.println("Integer: " + num);
        System.out.println("Converted to float: " + floatNum);
    }
}