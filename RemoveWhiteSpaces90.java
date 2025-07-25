//Program to remove the white spaces 

import java.util.*;

public class RemoveWhiteSpaces90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", "");
        System.out.println("String without white spaces: " + str);
    }
}
