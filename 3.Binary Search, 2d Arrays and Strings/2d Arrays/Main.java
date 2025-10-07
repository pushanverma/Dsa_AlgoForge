
public class Main {

    //topic : Print 2d Array 
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] newarr = arr[0];
            for (int j = 0; j < newarr.length; j++) {
                System.out.print("[" + i + "," + j + "]->" + arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //topic: Fill Values 
    public static void fillValues(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=i+j;
            }
        }

    }
    //topic: Matrix Multiplication





    public static void main(String[] args) {
        int[][] arr = new int[6][3];
        fillValues(arr);
        print2DArray(arr);

        
        matrixMultiplication(arr);

    }

}
