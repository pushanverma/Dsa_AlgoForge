import java.util.*;

public class allIndices {

    // topic: 1st Approach(Only printing the array )

    // public static void allIndices1(int[] arr, int index, int target) {

    //     // base case
    //     if (index == arr.length) {
    //         return;
    //     }

    //     // making an array which has to be return
    //     int arr_size = 0;

    //     // if target is found then size is increased
    //     if (arr[index] == target) {
    //         arr_size++;
    //     }

    //     // on the way up(climbing all the way upto when the index ==arr.length)
    //     allIndices(arr, index + 1, target);

    //     // since we travelled the whole array we know where target is present , so
    //     // making a new array of that size
    //     int[] new_arr = new int[arr_size];

    //     if (arr[index] == target) {
    //         new_arr[arr_size - 1] = index;
    //         arr_size--;
    //     }

    //     // printing array
    //     for (int i = 0; i < new_arr.length; i++) {
    //         System.out.print(new_arr[i] + " , ");
    //     }

    // }

    // topic: 2nd Approach(Returning the whole array) More optimised
    // fsf- found so far
    public static int[] allIndices2(int[] arr, int index, int target, int fsf) {

        if (index == arr.length) { //1
            int[] base_arr = new int[fsf];
            return base_arr;
        }

        int[] new_arr;
        if (arr[index] == target) { //2
            new_arr = allIndices2(arr, index + 1, target, fsf + 1);
        } else {
            new_arr = allIndices2(arr, index + 1, target, fsf);
        }

        if (arr[index] == target) { //3
            new_arr[fsf] = index;
        }

        return new_arr;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 45, 79, 2, 63 };

        // allIndices1(arr, 0, 2);

        int[] finaAns = allIndices2(arr, 0, 2, 0);

        // printing array
        for (int i = 0; i < finaAns.length; i++) {
            System.out.print(finaAns[i] + "  ");
        }
        System.out.println();

    }

}
