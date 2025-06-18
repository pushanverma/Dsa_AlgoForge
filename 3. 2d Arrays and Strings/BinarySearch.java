import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // System.out.print("Enter number of elements in array =");

        // int n =scn.nextInt();

        // int []arr ;

        int[] arr = { 2, 5, 8, 11, 14, 29, 56 };

        // for(int i =0;i<n;i++){
        // arr[i]=scn.nextInt();
        // }

        // input array

        // si- starting index , mid , ei - ending index
        int si = 0;
        int ei = arr.length - 1;
        int mid;
       

        System.out.print("Enter target= ");
        int target = scn.nextInt();

        int targetIndex=-1;

        while (si <= ei) {

             mid = (si + ei) / 2;

            // System.out.println(arr[mid]+ ", " + target+"   .... arr[mid] and target");

            if (arr[mid] == target) {
                // mid portion
                targetIndex = mid;
                break;

            } else if (target < arr[mid]) {
                // left portion , discarding right portion 
                ei = mid - 1;

            } else if (target > arr[mid]) {
                // right portion , discarding left portion
                si = mid + 1;

            } 

        }

        System.out.println(targetIndex + ".....targetIndex");
    }

}
