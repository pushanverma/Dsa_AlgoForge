import java.util.*;

class ComplexNumber {

    // attributes
    int real;
    int imaginary;

    // Constructor
    public ComplexNumber(int real, int imaginary) {
        // setting the value of real and imaginary in the class
        System.out.println("Parametrized constructor of Complex number class called");
        this.real = real;
        this.imaginary = imaginary;

    }

    // methods
    public ComplexNumber addComplexNumber(ComplexNumber c) {
        // add logic
        int newReal = this.real + c.real;
        int newImaginary = this.imaginary + c.imaginary;

        ComplexNumber ans = new ComplexNumber(newReal, newImaginary);
        return ans;
    }

    public ComplexNumber multiplyComplexNumber(ComplexNumber c) {
        // multiply logic I
        int realPart = this.real * c.real - (this.imaginary * c.imaginary);
        int imaginaryPart = (this.real * c.imaginary + this.imaginary * c.real);

        ComplexNumber ans = new ComplexNumber(realPart, imaginaryPart);
        return ans;
    }

    public String toString() {
        return this.real + "+ " + this.imaginary + "i";
    }

}

public class ComplexNumberQuestion {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 8);

        ComplexNumber additionAns = c1.addComplexNumber(c2);
        System.out.println(additionAns);

        ComplexNumber multiplicationAns = c1.multiplyComplexNumber(c2);
        System.out.println(multiplicationAns);

    }

}
