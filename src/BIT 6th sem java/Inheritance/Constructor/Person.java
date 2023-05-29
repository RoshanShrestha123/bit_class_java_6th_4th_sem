public class Person extends Main{
    public String name;
    public int age;

    // Parametrized Constructor
    // Person(String a, int b){
    //     name = a;
    //     age = b;
    // }

    // Default Constructor
    Person(){
        name = "Ankit Shrestha";
        age = 22;
    }

    public void getData(){
        System.out.println("Hi my name is " + name + " and my age is " + age);
    }
}