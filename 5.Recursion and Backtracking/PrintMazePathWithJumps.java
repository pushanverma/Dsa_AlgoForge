import java.util.*;

public class PrintMazePathWithJumps {

    public static void printAllMazePathWithJumps(int sr, int sc, int dr , int dc, String asf){

        if(sr>dr || sc>dc){
            return;
        }

        if(sr==dr && sc==dc){
            System.out.println(asf);
          
            return;
        }


        //horizontal call 
        for(int jump =1;jump<=dc-sc;jump++){
            printAllMazePathWithJumps(sr,sc+jump,dr,dc,"h"+jump+asf);
        }

        //vertical call
        for (int jump = 1; jump <= dr - sr; jump++) {
            printAllMazePathWithJumps(sr+jump, sc, dr, dc, "v" + jump + asf);
        }

        //diagonal call
        for (int jump = 1; jump <=Math.min(dr - sr,dc-sc) ; jump++) {
            printAllMazePathWithJumps(sr + jump, sc+jump, dr, dc, "d" + jump + asf);
        }


       
    }


    public static void main(String[] args) {
        
        printAllMazePathWithJumps(0,0,2,3,"");

    }
    
}
