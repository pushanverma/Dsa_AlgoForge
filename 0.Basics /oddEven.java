import java.util.*;


public class oddEven {

    public static void main(String [] args){

        Scanner scn =new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.print("Enter number = ");
             int number =scn.nextInt();

             if(number%2==0){
                System.out.println("Even number");
             }
             else {
                System.out.println("Odd number ");
             }
        }

    }
}