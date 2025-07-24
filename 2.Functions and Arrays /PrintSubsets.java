
public class PrintSubsets {

    //note: A little bit of String is also used here to add values .
    public static void printSubsets(int[] arr) {
        int n = arr.length;   // 4 
        int total_subsets = (int) Math.pow(2, n);  // 2^4= 16 

        System.out.println(total_subsets + "...total subsets possible ");  //16 

        // Convert decimal to binary 
        for (int i = total_subsets - 1; i >= 0; i--) {   // reverse loop because we will be storing the array backwards 

            String subset = "";   //Using string to store new values , becuase of appending values 
            int current_number = i;   // for every number starting from 15 , 14,13,......0

            for (int idx = n - 1; idx >= 0; idx--) {
                int remainder = current_number % 2;
                current_number = current_number / 2;

                // System.out.println(remainder + "..remainder in loop");
                if (remainder == 0) {
                    subset = "_ " + subset;
                } else {
                    subset = arr[idx] + " " + subset;
                }
            }
            System.out.println(subset);
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 2};

        printSubsets(arr);

    }
}
