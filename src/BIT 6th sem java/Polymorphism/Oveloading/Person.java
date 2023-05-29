// Sub Class
public class Person extends Main{
    public String name = "Anoop Shrestha";
    public int age = 22;

    // Overloading
    public void getInfo(){
        System.out.println("Hi my name is " + name + " and i am " + age + " years old ");
    }

    // If we want to create the function with same name then we have to pass the parameter
    public void getInfo(String name, int age){
        System.out.println("Hi my name is " + name + " and i am " + age + " years old ");
    }

}
