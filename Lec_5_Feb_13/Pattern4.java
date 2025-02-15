import java.util.*;

public class Pattern4 {
    
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter lines --->");
        int n =scn.nextInt();

        int total_number_of_line=n;


        int current_line=1;
        int stars=n;
        int spaces=0;

        while(current_line<=total_number_of_line){

            // print spaces 
            for(int i=1;i<=spaces;i++){
                System.out.print("\t");
            }


            // print stars

            for(int i=1;i<=stars;i++){
                System.out.print("*\t");
            }

            // move to next Line , increase number of stars and decrease number of spaces 
            System.out.println();
            stars--;
            spaces++;

            current_line++;

        }

    }
}
