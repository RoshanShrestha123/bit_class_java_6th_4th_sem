package OOP.paramatrizedConstructor;

public class Person {
    String name = "Roshan";
    int age = 25;

    Person(String n , int a) {
        name = n;
        age =a;
    }

    void introduce(){
        System.out.println("My name is" + name);
    }
}
