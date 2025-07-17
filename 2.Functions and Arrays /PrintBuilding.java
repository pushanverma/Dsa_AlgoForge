
public class PrintBuilding {

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 3, 7, 2};

        //total number of line (max of array)
        int tnol = findMaximum(arr); //9

        while (tnol > 0) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= tnol) {
                    System.out.print("*\t");
                } else {
                    System.out.print("_\t");
                }
            }
            System.out.println();

            tnol--;

        }

    }
}
