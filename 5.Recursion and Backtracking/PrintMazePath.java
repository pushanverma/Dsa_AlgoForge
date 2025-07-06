import java.util.*;


public class PrintMazePath {

    public static void printAllMazePath(int sr, int sc, int dr , int dc, String asf){

        if(sr>dr || sc>dc){
            return ;
        }    

        if(sr==dr && sc==dc){
            System.out.println(asf);
            return;
        }    


        //horizontal call 
        printAllMazePath(sr,sc+1,dr,dc,"h"+ asf);

        //vertical call
        printAllMazePath(sr+1, sc, dr, dc, "v" + asf);


    }

    public static void main(String[] args) {

     
        printAllMazePath(0,0,2,2,"");

       

    }
    
}
