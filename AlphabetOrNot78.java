//Check if a character is number or alphabet

import java.util.Scanner;

public class AlphabetOrNot78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Reading the first character entered by the user

        // Checking if the character is a letter
        if (Character.isLetter(ch))
            System.out.println("Alphabet");
        // Checking if it's a digit
        else if (Character.isDigit(ch))
            System.out.println("Number");
        // If it's neither letter nor digit
        else
            System.out.println("Neither alphabet nor number");
    }
}
