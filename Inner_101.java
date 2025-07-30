//Write a program on inner class

public class Inner_101 {

    class Inner {
        void display() {
            System.out.println("This is an inner class.");
        }
    }

    public static void main(String[] args) {
        Inner_101 outer = new Inner_101();           // Create outer class object
        Inner_101.Inner inner = outer.new Inner();   // Create inner class object
        inner.display();                             // Call method of inner class
    }
}
