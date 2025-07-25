//Write a program on two-level inheritance

class A{
    void display(){
        System.out.println("Hello");
    }
}

class B extends A{
    void add(int a,int b){
        System.out.println(a+b);
    }
}

class C extends B{

}

public class two_level_inheritance41{
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
        obj.add(2,7);
    }
}
