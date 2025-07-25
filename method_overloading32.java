//Write a program on method overloading

class A {
    void add(int a ,int b){
        System.out.println(a+b);

    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class method_overloading32 {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(1,2);
        obj.add(1,2,3);
    }
}
