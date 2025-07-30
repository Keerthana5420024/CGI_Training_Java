//Write a program on this keyword

public class This_100 {
    int num;

    This_100(int num) {
        this.num = num;  // 'this' refers to the current object's variable
    }

    void display() {
        System.out.println("Number is: " + this.num);
    }

    public static void main(String[] args) {
        This_100 obj = new This_100(50);
        obj.display();
    }
}
