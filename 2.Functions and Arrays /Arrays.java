
import java.util.*;

public class Arrays {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //topic: Arrays Introduction 
        int[] arr = new int[5];

        //note: Intitially all elements in array stores default values(here default value of array is 0)
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr at index " + i + "=" + arr[i]);
        }

        arr[1] = 45;
        arr[4] = 78;
        System.out.println("---------After filling values ----------");

        //note:After filling values at particular index , value is updated 
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr at index " + i + "=" + arr[i]);
        }

        System.out.println("---------Taking Input from array and Printing Array Elements----------");

        System.out.print("Enter size of array =");
        int size = scn.nextInt();

        // taking input for array 
        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("ele at index " + i + "=");
            newArr[i] = scn.nextInt();
        }

        System.out.println("\nPrinting Array\ns");
        //printing array 
        for (int i = 0; i < size; i++) {
            System.out.println("arr at index " + i + "=" + newArr[i]);
        }

    }

}
