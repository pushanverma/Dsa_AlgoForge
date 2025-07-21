
public class PrintSubArray {

    //note: SubArray = Substring , they both follow continuous fashion 
    public static void getSubArray(char[] arr) {

        int n = arr.length;

        for (int si = 0; si < n; si++) {

            for (int ei = si; ei < n; ei++) {

                for (int idx = si; idx <= ei; idx++) {
                    System.out.print(arr[idx] + ",");
                }
                System.out.println();

            }

        }

    }

    public static void main(String[] args) {

        //topic: Subarray question done for(integer array , character array and String )
        // int[] arr = {1, 2, 3, 4, 5};
        char[] arr = {'a', 'b', 'c', 'd', 'e'};

        getSubArray(arr);

        System.out.println("-------SubArray with String ----------------");
        String str = "abcde";

        int n = str.length();

        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                for (int idx = si; idx <= ei; idx++) {
                    System.out.print(str.charAt(idx) + ",");
                }
                System.out.println();
            }
        }

    }
}
