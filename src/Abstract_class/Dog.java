package Abstract_class;

import Abstract_class.Dog;

public class Dog extends Animal {

    // The abstract class of the Animal must be implmented on the Child class (Dog)
    @Override
    public void getColor() {
        System.out.println("Color of animal is Red");
    }
}
