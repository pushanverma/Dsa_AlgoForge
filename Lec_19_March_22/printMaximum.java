import java.util.*;

public class printMaximum {

    public static int findMaximum(int[] arr, int idx) {

        if (idx == arr.length) {
             
            //returning the minimum value 
            return Integer.MIN_VALUE;

            // returning the last value of array , assuming the array has one element 
            // return arr[arr.length-1];

        }

        int maximumSoFar = findMaximum(arr, idx + 1);
        int max = Math.max(maximumSoFar, arr[idx]);

        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 16, 78, 56, 93, 21 };

        int finalAns = findMaximum(arr, 0);

        System.out.println(finalAns);
    }

}
