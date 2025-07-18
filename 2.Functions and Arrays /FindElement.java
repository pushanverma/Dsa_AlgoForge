
import java.util.Scanner;

// topic: Linear Search (Worst way to search element in array , take O(n) time )
public class FindElement {

    public static int findIndexOfElement(int[] arr, int target) {

        int index = -1;  // we havent found untill now thats why -1

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                index = i; // as soon as we found the value , the index will be returned otherwise -1 will be returned 
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] arr = {10, -1, 14, -19, 11, 45, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter target =");
        int target = scn.nextInt();

        int index = findIndexOfElement(arr, target);

        if (index == -1) {
            System.out.println("Target is not present inside array !!");
        } else {

            System.out.println("Index of " + target + " = " + index);
        }

    }
}
