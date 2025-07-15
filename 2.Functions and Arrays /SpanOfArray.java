
import java.util.*;

public class SpanOfArray {

    public static int maximunOfArray(int[] arr) {
        int max = arr[0];  // considering the maximun ele as arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimumOfArray(int[] arr) {
        int min = arr[0]; // considering the minimum ele as arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // System.out.print("Enter size of array =");
        // int size = scn.nextInt();
        // int[] arr = new int[size];
        // for (int i = 0; i < size; i++) {
        //     arr[i] = scn.nextInt();
        // }
        int[] arr = {10, 14, 7, 19, 3, 21, 43, 16};

        int max = maximunOfArray(arr);
        int min = minimumOfArray(arr);

        int span = max - min;

        System.out.println("Span of Array =" + span);

    }
}
