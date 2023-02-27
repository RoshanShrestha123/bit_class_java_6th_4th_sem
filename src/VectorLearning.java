import java.util.Vector;

public class VectorLearning {
    public static void main(String[] args) {
        // This is a fixed length array.
        int[] age = {10,20,30}; //length = 3;

        Vector age2 = new Vector();
        age2.add(10);
        age2.add(20);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        age2.add(30);
        System.out.println(age2);
        System.out.println("Vector age capacity>> " +age2.capacity());



    }
}
