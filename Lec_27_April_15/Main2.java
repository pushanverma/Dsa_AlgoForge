class Student {


    //note:attributes(here we can also give default values) 
    String name="abc";
    int roll_no=-1;

    // topic:default Constructor(runs everytime a object is created )
    public Student() {
        // note: if you want to give a default value to some variable , you can pass
        // here
        name = "Pushan";
        roll_no = 23;
        System.out.println("Hello this is default Constructor ");
    }

    //topic:Parametrized Constructor 
    // public Student(String currentName) {
    //     name = currentName;
    //     System.out.println("Constructor with 1 parameter is called");
    // }

     //topic: Understanding this 
     public Student(String name ){
        System.out.println("this.name ->"+this.name +" , name->"+name);
        this.name =name;
     }

     

    public Student(String currentName, int current_roll_no) {
        name = currentName;
        roll_no=current_roll_no;
        System.out.println("Constructor with 2 parameter is called");
    };

   

}

public class Main2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Shyam");
        Student s3=new Student("Chandresh",45);

        // note: default value is printed for both of the above objects
        System.out.println("S1 name and rollno-> " + s1.name + ", " + s1.roll_no);
        System.out.println("S2 name and rollno-> " + s2.name + ", " + s2.roll_no);
        System.out.println("S3 name and rollno-> " + s3.name + ", " + s3.roll_no);


        


    }

}
