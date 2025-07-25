//Write a program on inheritance

class A{
    void display(){
        System.out.println("This one's an example of Inheritance");
    }
}

class B extends A{

}
public class inheritance31 {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}
