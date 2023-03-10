package Overloading;

public class Person {
    String name = "Anoop Shrestha";
    int age = 22;

    // Overloading
    public void getInfo(){
        System.out.println("Hi my name is " + name + " and I'm " + age + " years old");
    }

    // If we want to create multiple function with same name then we have to pass the parameter
    public void getInfo(String name, int age){
        System.out.println("Hi my name is " + name + " and I'm " + age + " years old");
    }
}
