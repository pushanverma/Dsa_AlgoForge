import java.util.*;

public class PrintReverseArrayRecursive {

    public static void printReverseArray(int[] arr, int idx) {

        if (idx == arr.length) {
            return;
        }

        printReverseArray(arr, idx + 1);
        System.out.println(arr[idx]);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        printReverseArray(arr, 0);
    }

}
