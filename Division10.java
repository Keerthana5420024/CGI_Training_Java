//Write a program to divide two numbers

public class Division10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        float quo = (float) a / b; // float division
        int rem = a % b;           // integer remainder

        System.out.println("Quotient after dividing a and b is: " + quo);
        System.out.println("Remainder after dividing a and b is: " + rem);
    }
}
