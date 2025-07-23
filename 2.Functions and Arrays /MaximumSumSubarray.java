
public class MaximumSumSubarray {

    //topic: time complexity -O(n^2)
    // public static void getMaximumSumSubarray(int[] arr) {
    //     int n = arr.length;
    //     int count = 0;
    //     int max = 0;
    //     for (int si = 0; si < n; si++) {
    //         int csum = 0;
    //         for (int ei = si; ei < n; ei++) {
    //             csum = csum + arr[ei];
    //             System.out.println("sum from " + si + " to " + ei + " = " + csum);
    //             if (csum > max) {
    //                 max = csum;
    //             }
    //         }
    //     }
    //     System.out.println("Maximum of subarray is =" + max);
    // }



//topic: KADANE'S ALGORITHM , time complexity -O(n)
    public static void getMaximumSumSubarray(int[] arr) {

        int n = arr.length;

        int meh = 0;  // maximum ending till here 
        int maxSum = Integer.MIN_VALUE;  // Max sum which is to be returned

        for (int i = 0; i < n; i++) {
            meh = meh + arr[i];

            if (meh < 0) {
                meh = 0;
            }

            maxSum = Math.max(meh, maxSum);

        }

         System.out.println("Maximum Sum Subarray by KADANES ALGO->"+maxSum);

    }

    public static void main(String[] args) {

        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {3, 4, -6, 1, -1, 8, -4, 5, 7, -19, 1, 3, 43};
        int []arr ={-34,-45,0,-9,-1,-3};

        getMaximumSumSubarray(arr);

    }
}
