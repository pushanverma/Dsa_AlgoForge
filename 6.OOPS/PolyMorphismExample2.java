import java.util.*;

//------------RUN-TIME POLYMORPHISM(IN -DEPTH EXAMPLE)---------------------------
class Bank {

    String rules;

    public int rateofInterest() {
        return 4;
    }

}

class SBI extends Bank {
    public int rateofInterest() {
        return 5;
    }

}

class HDFC extends Bank {
    public int rateofInterest() {
        return 6;
    }

}

class YES extends Bank {
    public int rateofInterest() {
        return 7;
    }

}

public class PolyMorphismExample2 {

    public static void main(String[] args) {

        Bank b = new HDFC();

        // note : HOW CAN THIS BE RUN-TIME POLYMORPHISM , the answer is the program is
        // executed in two parts - 1st one is compiling and then running . At compile
        // stage only Bank object is created , at that time we dont know which bank can
        // be made (it can be sbi/yes/hdfc), then at run time it looks which bank to
        // make and function runs

        System.out.println(b.rateofInterest());

    }

}
