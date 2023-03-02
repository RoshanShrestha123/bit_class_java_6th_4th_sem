package Strings;

public class StringLearning {
    public static void main(String[] args) {
        // this will be created on the String pool
        String name ="Roshan";
        name = name + "Shrestha";
        System.out.println(name);

        // This will create the new Instance of the string
        String name2 = new String("Hello world");

        // Data overwrite on the heap memory.
        StringBuffer name3 = new StringBuffer("Roshan");
        name3.append("Shrestha");

        System.out.println(name3);




    }
}