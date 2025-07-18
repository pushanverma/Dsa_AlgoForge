
public class AddTwoArrays {

    public static void addTwoArray(int[] arr1, int[] arr2) {

        int arr1_size = arr1.length; //5
        int arr2_size = arr2.length; //3
        int res_size = Math.max(arr1_size, arr2_size) + 1; //adding 1 because say example 999+1 , it becomes 1000 (which is 1 extra from maximum of two arrays)

        //resultant array 
        int[] res = new int[res_size];

        // 3 pointers (wew are starting from back like we normally do in maths )
        int i = arr1_size - 1;
        int j = arr2_size - 1;
        int k = res_size - 1;

        //intially the carry is always 0
        int carry = 0;

        while (k >= 0) {

            int sum = 0;

            // (sum = arr1+ arr2 + previous carry )
            if (i >= 0) {
                sum = sum + arr1[i];
            }
            if (j >= 0) {
                sum = sum + arr2[j];
            }
            sum = sum + carry;

            // if sum crossed the amount greater than 9 , it will be two digits , 
            // that is why dividing into carry and ans (highest carry will also have 1 as carry thats why hard coded)
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            res[k] = sum;

            i--;
            j--;
            k--;

        }

        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //note:test case 
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {9, 1};
        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {9, 9, 7};

        // int[] arr1 = {9,9,9};
        // int[] arr2 = {1};
        addTwoArray(arr1, arr2);

    }

}
