// Write a program on ClassCastException

public class ClassCastException_111 {
    public static void main(String[] args) {
        Object obj = new Integer(10); // obj refers to an Integer

        try {
            // Trying to cast Integer object to String will cause ClassCastException
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e);
        }
    }
}

