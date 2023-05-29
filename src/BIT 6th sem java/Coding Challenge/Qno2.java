public class Qno2 {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50 };
        int i = 0;
        int sum = 0;

        while (i < number.length) {
            sum += number[i];
            i++;
        }

        System.out.println("Sum of elements of this array " + number + " is " + sum);
    }
}
