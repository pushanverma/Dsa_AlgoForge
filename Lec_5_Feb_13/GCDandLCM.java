import java.util.*;

public class GCDandLCM {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        // 1st Approach ------>


        // GCD(greatest common divisor)= HCF(Highest comman factor)

        System.out.print("Enter num1=");
        int num1 = scn.nextInt();

        System.out.print("Enter num2=");
        int num2 = scn.nextInt();


        int minimum = Math.min(num1, num2);

        System.out.println(minimum + "...minm");


        int possibleGCD=1;
        

        int finalGcd =1;

        while(possibleGCD<=minimum){

            if(num1 % possibleGCD ==0 && num2%possibleGCD==0){
                finalGcd=possibleGCD;
            }

            possibleGCD++;
        }

        System.out.println("GCD/HCF of "+num1+" and "+num2+"="+finalGcd);

        int lcm =(num1*num2)/finalGcd;

        System.out.println("LCM of "+num1+" and "+num2+"="+lcm);




        // 2nd Approach -------->






    }
    }
