import java.util.*;


public class Billing {
    public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);

        // Taking input 

        System.out.println("Enter pen cost =");
        int pen =scn.nextInt();

        System.out.println("Enter notebook cost =");
        int noteBook=scn.nextInt();

        System.out.println("Enter textBook cost =");
        int textBook=scn.nextInt();


        int costWithoutGst = pen + noteBook +textBook;

        double gstCost = (costWithoutGst* 0.18);

        double totalCost = costWithoutGst+gstCost;

        System.out.println("Total Cost -"+ totalCost);

    }
}