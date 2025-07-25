//Program using static and non-static methods
class A{
    static int a; // Static Variable
    int b; // Non static Variable
}


public class StaticAndNonStatic79 {
    public static void main(String[] args) {
        A obj = new A();
        obj.a=12;
        A.a=21;
        System.out.println("A :"+obj.a);
        obj.b=22;
        System.out.println("B :"+obj.b);


    }

}
