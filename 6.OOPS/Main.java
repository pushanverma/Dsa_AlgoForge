import java.util.*;

class Student {

    //Attributes / Properties
    String name;
    int roll_no;

    //Methods / Functions

    public int sum(int a, int b) {
        return a + b;
    }

    // note: toString() method 
    // method is only invoked when try to print object , it is by
    // default called . There is a diffrence between constructor call (when object
    // is created) and toString call(when object is printed). eg.toString() function
    // is written internally in java  for ArrayList , Stacks and Queues and not written for Arrays

    public String toString() {
        return "Name of student is - " + name + ", Roll no is - " + roll_no;
    }

    // topic: MAIN FUNCTION 1
    public static void main(String[] args) {
        System.out.println("Hello , this is main function inside Student class");
    }
}

// note: There are two main function inside two diffrent classes, how would we know which one to run ?
// we run our java program by writing "javac Main.java && java Main" ,
// here the "javac Main.java" means the code(Main.java file) is being compiled
// by the compiler and "java Main" means to run the byteCode generated
// (Main.class), if we would have given "javac Main.java && java Student" then
// it runs Student.class(bytecode) file , and we get output as "main function in
// Student class"

public class Main {

        // topic: MAIN FUNCTION 2
    public static void main(String[] args) {

        System.out.println("Hello , this is main function inside Main class");

        // topic: Object 1(without setting the value)
        Student s1 = new Student();

        // Note: if we do not set any value, the object's attribute returns the default value of that particular data structure

        System.out.println(s1.name); // name returns "null", since its the default value of String
        System.out.println(s1.roll_no); // roll_no returns "0", since its default value of integer.

        // topic: Obejct 2(setting the value)

        Student s2 = new Student();

        s2.name = "pushan";
        s2.roll_no = 36;

        System.out.println(s2.name);   // pushan
        System.out.println(s2.roll_no);  //36

        // topic: Printing objects
        System.out.println(s1); // toString() function is called
        System.out.println(s2);

        // note: if we comment out the toString() method in class and try to run the
        // program , it will print the address of the objects insted of values, output
        // is below:-
        // Student@1dbd16a6
        // Student@7ad041f3


    }

}
