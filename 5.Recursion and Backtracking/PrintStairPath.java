import java.util.*;

public class PrintStairPath {


    public static void printAllStairPath(int step , String asf){

        if(step<0){
            return;
        }

        if(step==0){
            System.out.println(asf);
            return;
        }

        // 1 step call 
        printAllStairPath(step-1,"1"+asf);

        //2 step call
        printAllStairPath(step - 2, "2" + asf);

        //3 step call 
        printAllStairPath(step - 3, "3" + asf);



    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter steps =");
        int n = scn.nextInt();

        printAllStairPath(n,"");

    }
    
}
