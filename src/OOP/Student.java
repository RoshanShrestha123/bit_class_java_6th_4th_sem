import javax.management.relation.Role;

// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

public class Student {
    public String name;
    public int roll_no;

    Student(int a, String b){
        roll_no = a;
        name = b;
    }

    public void getDetails(){
        System.out.println("Hi my name is " + name + " and my roll number is " + roll_no);
    }
}
