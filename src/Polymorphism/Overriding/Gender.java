package Overriding;
// Sub Class
public class Gender extends Person{
    String name = "Brad";
    String gender = "Male";

    // If we didn't create a function in sub class then it will call the function of parent class
    public void getData(){
        System.out.println(name + " is " + gender);
    }
}
