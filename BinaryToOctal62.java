//Program to convert Binary to Octal

public class BinaryToOctal62 {
    public static void main(String[] args) {
        String binary = "101101";
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }
}


