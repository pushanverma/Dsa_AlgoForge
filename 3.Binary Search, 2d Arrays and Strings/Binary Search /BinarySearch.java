public class BinarySearch {

    public static void main(String... args) {

        // this could be only performed if the array is sorted .
        int[] arr = { 3, 5, 6, 11,13, 14, 19, 28};
        int target = 14;

        // starting index , ending index , and mid element
        int si = 0;
        int ei = arr.length - 1;    
        while (si <= ei) {
          int  mid = (si + ei) / 2;

            if (arr[mid] == target) {
                System.out.println("Target "+target+" found at ->"+ mid);
                break;
            } else if (arr[mid] < target) {
                // go right
                si = mid + 1;
            } else if(arr[mid]>target) {
                // go left
                ei = mid - 1;
            }else {
                System.out.println("not found ");
            }
            
        }
    }
}