import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = scn.nextInt();

        boolean isPrime = true;

        if(n==0 || n==1){
            isPrime=false;
        }else{

                // less optimised 
            // for (int i = 2; i < n; i++) {
            //     if (n % i == 0) {
            //         isPrime = false;
            //         break;
            //     }
            // }

            // more optimised (going till root n value )
            for(int i=2;i*i<=n;i++){
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }



        }

        //check for prime number 
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime number ");
        }
    }
}