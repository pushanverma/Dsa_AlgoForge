
import java.util.ArrayList;

public class SubArrayWithSumk {

//topic: Brute Force(Not optimized), Time complexity - n^3
    // public static void getSubArrayWithSumk(int[] arr, int target) {
    //     int n = arr.length;
    //     int count = 0;
    //     for (int si = 0; si < n; si++) {
    //         for (int ei = si ; ei < n; ei++) {
    //             int sum = 0;
    //             for (int idx = si; idx <= ei; idx++) {
    //                 sum = sum + arr[idx];
    //                 System.out.print(arr[idx] + ",");
    //             }
    //             System.out.print("sum->" + sum);
    //             // if (sum == target) {
    //             //     count++;
    //             // }
    //             System.out.println();
    //         }
    //     }
    //     System.out.println("number of subarrays with sum" + target + "=>" + count);
    // }
//topic: Brute Force(Not optimized , Time complexity - n^2
    public static int getSubArrayWithSumk(int[] arr, int target) {

        ArrayList<String> required_Subarray = new ArrayList<>();

        int count = 0;

        int n = arr.length;

        for (int si = 0; si < n; si++) {
            int current_sum = 0;
            for (int ei = si; ei < n; ei++) {

                current_sum = current_sum + arr[ei];

                if (current_sum == target) {
                    count++;
                    required_Subarray.add(si + "," + ei);
                }
            }
        }

        System.out.println(required_Subarray);
        return count;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        int ans = getSubArrayWithSumk(arr, target);

        System.out.println("Number of SubArray with total sum " + target + "=" + ans);
    }

}
