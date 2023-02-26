public class StringLearning {
    public static void main(java.lang.String[] args) {
        // String are Immutable.
        // Create new String with new keyword
        String str = new String("Hello world");
        str = str + " Kist"; //its not mutable, new obj is created.
        str.toUpperCase(); // its not mutable, new object is created.

        System.out.println(str);
    }
}