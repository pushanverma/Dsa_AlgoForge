import java.util.*;

public  class xPowery {

    public static int PowerFunction(int x, int y) {

        if (y == 0) {
            return 1;
        }

        int smallerAns = PowerFunction(x, y - 1);
        int finalAns = x * smallerAns;
        return finalAns;

    }

    public static int PowerFunction2(int x,int y){

        if(y==0){
            return 1;
        }

        int smallAns =PowerFunction2(x,y/2);
        
        int finalAns =1;

        if(y%2==0){
            // if y is even 
          return   finalAns=smallAns*smallAns;
        }else {
            // if y is odd 
          return   finalAns= x*(smallAns*smallAns);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x=");
        int x = scn.nextInt();

        System.out.print("Enter y=");
        int y = scn.nextInt();

        // int ans = PowerFunction(x, y);
        int ans =PowerFunction2(x,y);

        System.out.println(ans);

    }
}