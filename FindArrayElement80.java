// Finding an element in an array

public class FindArrayElement80 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int key = 15;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " is found in the array.");
        else
            System.out.println(key + " is not found in the array.");
    }
}
