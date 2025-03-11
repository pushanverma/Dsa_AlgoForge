import java.util.*;


public class SumofDigits {

    public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);

        System.out.print("Enter number = ");

        int num =scn.nextInt();

        int originalNumber=num;

        int sum=0;

        while(num>0){
            int lastDigit= num%10; // taking out lastDigit 
            sum=sum+lastDigit;    // adding in the sum 
            num =num/10;        // decreasing the number 


        }

        System.out.println("Sum of Digits = "+sum);
        
    }

}