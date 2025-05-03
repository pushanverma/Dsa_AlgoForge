import java.util.*;

public class firstIndex {

    public static int findfirstIndex(int[] arr, int idx, int target) {


        if(idx==arr.length ){
            return -1;
        }

        if(arr[idx]==target){
            return idx;
        }

       

        findfirstIndex(arr,idx+1,target);

        

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] arr = { 9, 10, 2, 3, 2, 2, 4, 5 };

        System.out.print("Enter target =");
        int target = scn.nextInt();

        int ans = findfirstIndex(arr, 0, target);
        System.out.println(ans);

    }

}
