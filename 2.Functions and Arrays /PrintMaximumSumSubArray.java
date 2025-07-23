
public class PrintMaximumSumSubArray {

    //topic: 1st method (using O(n^2) time complexity)
    // public static void printSubarrayWithMaximumSum(int[] arr) {
    //     int n = arr.length;
    //     int msf = Integer.MIN_VALUE;  // maximum so far 
    //     int subArray_startingIndex = 0;
    //     int subArray_endingIndex = 0;
    //     for (int si = 0; si < n; si++) {
    //         int subArraySum = 0;
    //         for (int ei = si; ei < n; ei++) {
    //             subArraySum = subArraySum + arr[ei];
    //             System.out.println(subArraySum + "...sum");
    //             if (subArraySum > msf) {
    //                 msf = subArraySum;
    //                 subArray_startingIndex = si;
    //                 subArray_endingIndex = ei;
    //             }
    //             System.out.println(msf + "------msf");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("SubArray startingIndex & endingIndex -> " + subArray_startingIndex + "," + subArray_endingIndex);
    //     System.out.println("Subarray with maximum sum -->\n");
    //     for (int i = subArray_startingIndex; i <= subArray_endingIndex; i++) {
    //         System.out.print(arr[i] + ",");
    //     }
    //     System.out.println();
    // }
    //topic: 2nd method (Using KADANES ALGO , O(N) time complexity)
    public static void printSubarrayWithMaximumSum(int[] arr) {

        int n = arr.length;

        int meh = 0;  // maximum ending here (means maximum sum till index )

        int maxSum = Integer.MIN_VALUE;

        int maxSum_si = 0;
        int maxSum_ei = 1;

        for (int i = 0; i < n; i++) {

            meh = meh + arr[i];

            if (meh > maxSum) {
                maxSum = meh;

                maxSum_ei = i;
            }

            if (meh < 0) {
                maxSum_si = i + 1;
                // maxSum_ei = i + 1;
                // you will start new , so update starting index
                meh = 0;
            }

            System.out.println(maxSum_si + "," + maxSum_ei + ", maximum sum till here is " + maxSum);

        }

        System.out.println("-------Maximum Sum Subarray is-------");
        for (int i = maxSum_si; i <= maxSum_ei; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {3, 4, -6, 1, -1, 8, -4, 5, 7, -19, 1, 3, 43};
        // int[] arr = {3, 4, -9, -1, 5, 3, 7, -9, -8, 12, -3, 7, -8};
        int[] arr = {-34, -45, 0, -9, -1, -3};

        printSubarrayWithMaximumSum(arr);

    }
}
