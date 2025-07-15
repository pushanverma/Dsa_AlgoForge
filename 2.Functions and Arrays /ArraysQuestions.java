
import java.util.*;

public class ArraysQuestions {

    //topic: Question 1
    public static int findGreaterthan40(int[] arr) {

        int count = 0;

        //note: Extra(storing in arrayList ) 
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 40) {
                al.add(arr[i]);
                count++;
            }
        }

        // Printing elements that are greater than 40 
        for (int ele : al) {
            System.out.print(ele + " , ");
        }

        return count;
    }

    //topic: Question 2
    public static void swapGame(int[] arr) {

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // System.out.print("Enter size of array =");
        // int size = scn.nextInt();
        // int[] arr = new int[size];
        // for (int i = 0; i < size; i++) {
        //     System.out.print("enter ele at " + i + "=");
        //     arr[i] = scn.nextInt();
        // }
        // int count = findGreaterthan40(arr);
        // System.out.println("\nNumber of ele greater than 40 are =" + count);
        int[] swapArr = new int[]{1, 2};

        System.out.println("Elements before swapping ->" + swapArr[0] + " , " + swapArr[1]);
        swapGame(swapArr);
        System.out.println("Elements after swapping ->" + swapArr[0] + " , " + swapArr[1]);

        // System.out.println(swapArr[0]+ ","+ swapArr[1]);
    }

}
