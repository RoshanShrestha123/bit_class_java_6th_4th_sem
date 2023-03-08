package Overriding;
// Parent Class
public class Person {
    String name = "Brad";
    int age = 45;

    // Overriding this function in subclass
    public void getData(){
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }
}
