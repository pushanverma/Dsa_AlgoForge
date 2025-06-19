import java.util.*;

public class firstIndex {

    // topic: "On the way Down" Approach

    // public static int findfirstIndex(int[] arr, int idx, int target) {

    // // base case
    // if (idx == arr.length) { //1
    // return -1;
    // }

    // int firstIndexsoFar = findfirstIndex(arr, idx + 1, target); //2

    // if (arr[idx] == target) { //3
    // return idx;
    // } else {
    // return firstIndexsoFar;
    // }
    // }

    // topic: "On the way Up" Approach(More optimized)- it will find the index
    public static int findfirstIndex(int[] arr, int idx, int target) {

        if (idx == arr.length) { // 1
            return -1;
        }

        if (arr[idx] == target) { //2
            return idx;
        }

        int firstIndexsoFar = findfirstIndex(arr, idx + 1, target); //3

        return firstIndexsoFar;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] arr = { 9, 10, 3, 2, 2, 4, 5 };

        // printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

        System.out.print("\nEnter target =");
        int target = scn.nextInt();

        int ans = findfirstIndex(arr, 0, target);
        System.out.println(ans);

    }

}
