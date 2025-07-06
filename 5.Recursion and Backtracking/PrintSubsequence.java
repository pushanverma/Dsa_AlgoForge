
import java.util.*;

public class PrintSubsequence {

    public static void printAllSubsequence(String str, String sub) {

        if (str.length() == 0) {
            System.out.println(sub);
            return;
        }

        char first_character = str.charAt(0);

        String remainString = str.substring(1);

        //first char said no 
        printAllSubsequence(remainString, sub);   //1

        // first char said yes 
        printAllSubsequence(remainString, sub + first_character);    //2

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string =");
        String str = scn.next();

        printAllSubsequence(str, "");
    }

}
