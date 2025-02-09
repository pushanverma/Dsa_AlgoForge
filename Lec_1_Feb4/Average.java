import java.util.*;


public class Average {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        // taking integer inputs from user 

        System.out.println("Enter three Numbers= -------->");
        int a =scn.nextInt();
        int b =scn.nextInt();
        int c=scn.nextInt();

        // Average can be decimal also , therefore making it double

        double average= (a+b+c)/3;

        System.out.println("Average-"+average);



    
    }
}

