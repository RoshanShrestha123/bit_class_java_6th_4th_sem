// Sub Class
public class Person extends Gender {
    public String name = "Ankit Shrestha";   

    public int age = 18;

    // if we didn't create a function in subclass then it will call the sub class
    public void getData(){
        System.out.println("My name is " + name + " and i am " + age + " years old ");
    }
}
