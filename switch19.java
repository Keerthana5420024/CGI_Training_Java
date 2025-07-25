//Write a program on switch statement

public class switch19 {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("Grade A");
                break;

            case 'B':
                System.out.println("Grade B");
                break;

            default:
                System.out.println("Neither A nor B");
        }
    }
}
