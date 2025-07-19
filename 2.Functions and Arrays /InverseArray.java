
public class InverseArray {

    public static void inverseArray(int[] arr) {
        int[] inverseArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int inverseArrayIndex = arr[i];
            inverseArray[inverseArrayIndex] = i;
        }

        //Inverse Array 

        for(int p=0;p<inverseArray.length;p++){
            System.out.print(inverseArray[p]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 0, 6, 2, 8, 9, 5, 1, 4};

        inverseArray(arr);

    }
}
