//Convert Float to Integer
import java.util.Scanner;

public class FloatToInt60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a float number: ");
        float num = sc.nextFloat();
        int intNum = (int) num;
        System.out.println("Float: " + num);
        System.out.println("Converted to int: " + intNum);
    }
}