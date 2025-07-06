import java.util.*;

public class PrintKPC {

    static String[] mobile_letters_array = {",:", "<;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


    public static void printAllKPC(String str, String asf){

        if(str.length()==0){
            System.out.println(asf);
            return ;
        }

        int firstDigit = str.charAt(0)-'0';

        String remainingString = str.substring(1);

        //call 

        String current = mobile_letters_array[firstDigit];    //2 - "abc"

        for(int i =0;i<current.length();i++){   

            char ch = current.charAt(i); // a , b , c 
            printAllKPC(remainingString , asf+ch);
        }

    }

    public static void main(String... args){

        Scanner scn = new Scanner(System.in);

        // System.out.print("Enter string");
        // String str = scn.next();


        printAllKPC("23","");


    }
    
}
