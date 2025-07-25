//Write a program on a constructor

public class Constructor40 {
    String name;

    Constructor40(String userName) {
        name = userName;
    }

    void display() {
        System.out.println( name);
    }

    public static void main(String[] args) {
        Constructor40 obj = new Constructor40("Keerthana");
        obj.display();
    }
}
