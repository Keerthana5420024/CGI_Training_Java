//Write a program on method overriding 

class A {
    void add(int a,int b){
        System.out.println(a+b);
    }
}

class B extends A{
    void add(int a,int b){
        System.out.println(a+b+10);
    }
}
public class method_overriding33 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.add(1,2);
        b.add(6,7);
    }
}
