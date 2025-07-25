//Write a program to check the behaviour of a protected member in inheritance


class A {
    protected String message = "Hi!!";

    protected void display() {
        System.out.println("Protected Method: " + message);
    }
}

public class protected_member38 extends A {
    public static void main(String[] args) {
        A obj = new A();

        System.out.println("Accessing protected variable: " + obj.message);
        obj.display();
    }
}
