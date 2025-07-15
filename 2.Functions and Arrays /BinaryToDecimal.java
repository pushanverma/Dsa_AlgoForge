
import java.util.*;

public class BinaryToDecimal {

    public static int convertBinaryToDecimal(int binaryNumber) {

        //    int numberOfDigits= countDigits(binaryNumber);
        double decimalNumber = 0;

        //eg.1011
        int count = 0;
        while (binaryNumber != 0) {

            int lastDigit = binaryNumber % 10;   //taking last digit 

            decimalNumber = decimalNumber + lastDigit * Math.pow(2, count);   // calculating 

            binaryNumber = binaryNumber / 10;  // making the number short 

            count++;
        }

        return (int) decimalNumber;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter binary number =");
        int binaryNumber = scn.nextInt();

        int decimalNumber = convertBinaryToDecimal(binaryNumber);

        System.out.println(decimalNumber);

    }

}
