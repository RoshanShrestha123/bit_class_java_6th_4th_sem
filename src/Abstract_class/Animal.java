package Abstract_class;

public abstract class Animal {

    private  String name = "Animal";

    public void getName() {
        System.out.println("Name of the animal is " + name);
    }

    // The abstract method doesn't have its own implementation , its just an idea
    public abstract void getColor();
}
