package Overriding;

public class Main {
    public static void main(String[] args){
        // Person Class Calling
        Person person = new Person();
        person.getData();

        // Gender Class Calling
        Gender gender = new Gender();
        gender.getData();
    }
}
