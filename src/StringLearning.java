public class StringLearning {
    public static void main(String[] args) {
        // String only [Immutable]
    String str = "Hello";
    str.toUpperCase();
    String str2 = new String("Hello");
    System.out.println(str.equals(str2));

    // StringBuffer [Mutable]
        StringBuffer name = new StringBuffer("Roshan");
        name.append("Shrestha"); // this will modify the stringBuffer

        System.out.println(name);
    }
}