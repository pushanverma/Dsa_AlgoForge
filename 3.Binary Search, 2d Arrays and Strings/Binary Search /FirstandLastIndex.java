public class FirstandLastIndex {

    public static int[] getFirstandLastIndex(int[] arr, int target) {

        int firstIndex = -1;
        int lastIndex = -1;

        // finding first Index
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                ei = mid - 1;
            } else if (arr[mid] < target) {
                // go right
                si = mid + 1;
            } else {
                // go left
                ei = mid - 1;
            }
        }

        // finding lastIndex (before finding first and last index , putting values of si
        // =0and ei as arr.length-1)
        si = 0;
        ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                si = mid + 1;
            } else if (arr[mid] < target) {
                // go right
                si = mid + 1;
            } else {
                // go left
                ei = mid - 1;
            }
        }

        return new int[] { firstIndex, lastIndex };

    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 3, 3, 5, 5, 5, 5, 8, 11, 13, 13, 19, 19, 19 };

        int target = 19;
        int[] ans = getFirstandLastIndex(arr, target);

        System.out.println("first Index =" + ans[0]);
        System.out.println("Last Index =" + ans[1]);

    }
}
