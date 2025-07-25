
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        //strating index and ending index
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {

            int mid = (si + ei) / 2;  // mid 

            if (target == arr[mid]) {
                // found at middle 
                return mid;
            } else if (target < arr[mid]) {
                // will be found at left  
                ei = mid - 1;
            } else {
                // will be found at right 
                si = mid + 1;
            }

        }

        return -1;

    }

    public static void main(String... args) {

        int[] arr = {1, 4, 7, 8, 11, 14, 17, 19, 21};
        // int target = 15;
        // int target =4;
        int target =19;

        int index = binarySearch(arr, target);

        System.out.println(index + "...index");

    }
}
