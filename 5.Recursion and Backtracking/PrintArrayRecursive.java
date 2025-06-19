import java.util.*;

public class PrintArrayRecursive {

    public static void printArrayElements(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        printArrayElements(arr, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5 };

        printArrayElements(arr, 0);

    }

}
