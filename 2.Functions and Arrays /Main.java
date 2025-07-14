
public class Main {

    //note: Function (it can be written before main function and after main function also , it will run in both cases )
    // public static int add(int a, int b) {
    //     System.out.println("inside add function...2 ");
    //     int result = a + b;
    //     return result;
    // }
    //note: SWAP using variable 
    public static void swap1(int a, int b) {
        // using variable 

        int swap = a;
        a = b;
        b = swap;

        System.out.println("in swap1 fun " + a + " , " + b);

    }

    //note: SWAP using no variable 
    public static void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("in swap2 fun " + a + " , " + b);
    }

//note: SWAP with return type
    public static int[] swap3(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("in swap3 fun " + a + " , " + b);

        return new int[]{a, b};
    }

    public static void main(String[] args) {

        // System.out.println("inside main function...1");
        // int ans = add(3, 5);
        // System.out.println(ans);
        int a = 7;
        int b = 1;

        //note: swap 1(with variable)
        // System.out.println("Value of a & b before swap in main -->" + a + " , " + b);
        // swap1(a, b);
        // System.out.println("Value of a & b after swap in main -->" + a + " , " + b);
        //note:  swap 2(without variable)
        // System.out.println("Value of a & b before swap in main -->" + a + " , " + b);
        // swap2(a, b);
        // System.out.println("Value of a & b after swap in main -->" + a + " , " + b);

        //note: swap 3(with return type array)
        System.out.println("Value of a & b before swap in main -->" + a + " , " + b);
        int[] ans = swap3(a, b);
        System.out.println("Value of a & b after swap in main -->" + ans[0] + " , " + ans[1]);

    }

}
