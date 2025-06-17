import java.util.*;

public class MultiplicationTable{

    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter number = ");

        int number =scn.nextInt();

        System.out.println("Table of "+number+"->");

        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }


    }
}