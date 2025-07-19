
public class SubtractTwoArrays {

    // arr2 is bigger than arr1
    public static void subtractTwoArrays(int[] arr1, int[] arr2) {
        int arr2_size = arr2.length;// 3
        int arr1_size = arr1.length;//2

        int[] res = new int[arr2_size];
        int res_size = res.length;

        int j = arr2_size - 1;
        int i = arr1_size - 1;
        int k = res_size - 1;

        while (k >= 0) {

            int diffrence;
            if (i >= 0) {
                diffrence = arr2[j] - arr1[i];

            } else {
                diffrence = arr2[j];
            }

            System.out.println(j + "...j");
            System.out.println(i + "...i");
            System.out.println(k + "...k");

            // if numerator is less than denominator , means subtraction is -ve 
            if (diffrence < 0) {

                arr2[j] = arr2[j] + 10; // adding 10 to numerator 
                arr2[j - 1] = arr2[j - 1] - 1; // borrowing from left 

                if (i >= 0) {
                    res[k] = arr2[j] - arr1[i];
                    System.out.println(res[k] + "...res at " + k);
                } else {
                    res[k] = arr2[j];
                }
                System.out.println("======================");
            } else {
                // if numerator is big than denominator , means subtraction is +ve
                if (i >= 0) {    
                    res[k] = arr2[j] - arr1[i];
                } else {
                    res[k] = arr2[j];
                }
            }

            j--;
            i--;
            k--;

        }

        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p] + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        // int[] arr2 = {3, 2, 1};
        // int[] arr1 = {7, 8};
        // int []arr2={5,6,7};
        // int []arr1={2,4,1};
        // int[] arr2 = {9, 9, 9};
        // int[] arr1 = {1};
        // int[] arr2 = {9, 9, 9};
        // int[] arr1 = {9, 9, 8};
        int[] arr2 = {8, 1, 3, 5};
        int[] arr1 = {1, 8, 3};

        subtractTwoArrays(arr1, arr2);

    }

}
