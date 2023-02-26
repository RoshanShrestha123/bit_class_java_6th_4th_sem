public class Looping {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }

        // Enhanced for loop (for-each loop)
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            System.out.println("num is " + num);
        }

        // While loop
        int j = 0;
        while (j < 10) {
            System.out.println("j is " + j);
            j++;
        }

        // Do-while loop
        int k = 0;
        do {
            System.out.println("k is " + k);
            k++;
        } while (k < 10);


    }
}