//Write a program on Java super keyword

class A {
    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void show() {
        super.show(); // calls show() of class A
        System.out.println("This is class B");
    }
}

public class Super_99 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
