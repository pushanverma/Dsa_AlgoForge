
public class RotateArray {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverseArray(int[] arr, int i, int j) {

        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    public static int[] rotateArray(int[] arr, int k) {

        int size = arr.length;

        if (k > size) {
            k = k % size;
        }

        if (k < 0) {
            k = k + size;
        }

        //step 1 : Reverse the whole array 
        reverseArray(arr, 0, size - 1);

        //step 2 : Reverse array from 0 to k 
        reverseArray(arr, 0, k - 1);

        //step 3 : Reverse array from k+1 to size-1 
        reverseArray(arr, k, size - 1);

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {11, 12, 13, 14, 15};

        int k = 2;
        // int k=0;
        // int k=-2;

        int[] ans = rotateArray(arr, k);
        // note: We can either save the resultant array inside ans array or can directly print "arr" because changes are made at indexes (it wont make diffrence in final answer)
        System.out.println("Reversed Array -->");
        for (int p = 0; p < ans.length; p++) {
            System.out.print(ans[p] + " ");
        }
        System.out.println();

    }
}
