package Lec_16_March_16;

public class Factorial {

    public static int factorialOfNumber(int n) {

        if (n == 1) {
            return fact;
        }

        int fact = n * factorialOfNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        factorialOfNumber(n);
    }

}
