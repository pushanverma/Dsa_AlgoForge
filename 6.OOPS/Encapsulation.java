import java.util.*;

//---------------------------Encapsulation(access modifiers -public , private )--------------------

class Employee {

    // topic: private
    private int salary = 200;
    int employeeId;
    int joiningYear;

    // topic:GETTERS

    public void getSalary() {
        System.out.println(this.salary);
    }

    // topic:SETTERS
    public int setSalary(int newSalary) {
        this.salary = newSalary;
        return this.salary;

    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        System.out.println("Before setting salary is ->");
        e1.getSalary();

        System.out.println("After setting salary is ->");
        e1.setSalary(1000000000);

        e1.getSalary();

    }

}
