import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = scn.nextInt();

        int fact = 1;

        //------------------Decreasing Fashion------------------------

        // while (n > 0) {
        //     fact = fact * n;
        //     n--;
        // }
        // System.out.println(fact);

        // for(int i=n;i>0;i--){
        //     fact=fact*i;
        // }
        // System.out.println(fact);




        //------------------Increasing Fashion------------------------

        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        // int i=1;
        // while(i<=n){
        //     fact=fact*i;
        //     i++;
        // }
        // System.out.println(fact);


    }
}