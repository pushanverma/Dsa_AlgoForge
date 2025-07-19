
public class ReverseArray {

    public static void swapElements(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr) {

        int i = 0;  //starting pointer 
        int j = arr.length - 1;   //ending pointer 

        while (i <= j) {

            swapElements(arr, i, j);

            i++;
            j--;
        }

        System.out.println("Reversed Array -->");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        //odd number of elements 
        // int[] arr = {11, 12, 13, 14, 15};

        //even number of elements 
        int[] arr = {11, 12, 13, 14, 15,16};

        System.out.println("Original Array -->");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();

        
        reverseArray(arr);

    }
}
