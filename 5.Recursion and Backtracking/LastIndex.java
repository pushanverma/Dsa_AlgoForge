import java.util.*;

public class LastIndex {

    // topic: "On the way Down Approach "
    public static int lastIndex(int[] arr, int index, int target) {
        if (index == arr.length) { // 1
            return -1;
        }

        int furtherlastIndex = lastIndex(arr, index + 1, target); // 2

        if (furtherlastIndex == -1 && arr[index] == target) { // 3
            // is index se pehle tak furtherlastIndex =-1 hai yani isse pehle target nahi
            // mila to aaj ka check kar lete hai
            return index;
        } else {
            return furtherlastIndex;
        }
        
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 5 };

        int finalAns = lastIndex(arr, 0, 2);
        System.out.println(finalAns);

    }

}
