
public class ReverseArray {

    public static void swapElements(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverseArray(int[] arr) {

        int i = 0;  //starting pointer 
        int j = arr.length - 1;   //ending pointer 

        while (i <= j) {

            swapElements(arr, i, j);

            i++;
            j--;
        }

        return arr;

    }

    public static void main(String[] args) {

        //odd number of elements 
        // int[] arr = {11, 12, 13, 14, 15};
        //even number of elements 
        int[] arr = {11, 12, 13, 14, 15, 16};

        System.out.println("Original Array -->");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();

        int[] ans = reverseArray(arr);

        // note: We can either save the resultant array inside ans array or can directly print "arr" because changes are made at indexes (it wont make diffrence in final answer)
        System.out.println("Reversed Array -->");
        for (int p = 0; p < ans.length; p++) {
            System.out.print(ans[p] + " ");
        }
        System.out.println();

    }
}
