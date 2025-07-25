//Write a program to decalre a static variable in java
class Student{
    static int age;
}


public class static5 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=21;
        Student.age=24;
        System.out.println("S1's age is: "+s1.age);
    }
    
}
