import java.util.*;

class Student {

    // topic: private (ACCESS MODIFIER)
    int roll_no;
    private int marks;

    // setter function to set marks of student

    public int setMarks(int marks) {
        this.marks = marks;
        return this.marks;
    }

    // getter function to get marks of student

    public void getMarks() {
        System.out.println(this.marks);
    }

}

public class StudentQues {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setMarks(60);
        s1.getMarks();

        // topic: default (ACCESS MODIFIER)
        // note: We can access ComplexNumber class in StudentQues class (with the help
        // of default access modifier)

        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 8);

        ComplexNumber additionAns = c1.addComplexNumber(c2);
        System.out.println(additionAns);

    }

}
