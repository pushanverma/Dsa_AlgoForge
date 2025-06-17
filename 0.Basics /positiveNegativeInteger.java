import java.util.*;

public class positiveNegativeInteger {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number =");
        int n = scn.nextInt();

        if (n < 0) {
            System.out.println("Negative  number ");
        } 
        else if(n==0){
            System.out.println("Neither positive nor negative ");
        }
        else {
            System.out.println("Positive number ");
        }
    }
}