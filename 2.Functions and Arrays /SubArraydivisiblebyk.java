
import java.util.ArrayList;

public class SubArraydivisiblebyk {

    public static void getSubArrayDivisibeByK(int[] arr, int k) {
        int n = arr.length;

        int count = 0;

        ArrayList<String> al = new ArrayList<>();

        for (int si = 0; si < n; si++) {
            int current_sum = 0;
            for (int ei = si; ei < n; ei++) {

                current_sum = current_sum + arr[ei];

                if (current_sum % k == 0) {
                    count++;
                    al.add(si + "," + ei);
                }
            }
        }

        System.out.println("Number of Subarrays that are divisible by " + k + " = " + count);
        System.out.println("Subarrays that are divisible by " + k + " = " + al);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        getSubArrayDivisibeByK(arr, k);
    }
}
