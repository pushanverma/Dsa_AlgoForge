import java.util.*;


public static class CompressString2{

    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.print("Enter string=");
        String str =scn.next();


        String compressedString =str.charAt(0)+"";



        char previous=str.charAt(0);


        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);

            int count =0;
            if(current == previous){
                count++;
            }else{
                compressedString;
            }
        }






    }
    
}