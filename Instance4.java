//Write a program to declare a instance variable in java

public class Instance4 {

    // Instance variable
    String name;

    // Method to set the name
    void setName(String s) {
        name = s;
    }

    // Method to display the name
    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Instance4 s1 = new Instance4();
        Instance4 s2 = new Instance4();

        s1.setName("Kriti");
        s2.setName("Priya");

        s1.display(); 
        s2.display();  
    }
}
