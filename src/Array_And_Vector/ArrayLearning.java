package Array_And_Vector;

public class ArrayLearning {
    public static void main(String[] args) {
        // Create new default array of element 0 of length 5 [0,0,0,0,0]
        int[] x = new int[5];

        // create new array of element [10,20,30];
        int[] y = {10, 20, 30};

        // looping with for-loop in array
        for(int i = 0 ; i < x.length; i++){
            System.out.println(x[i]); // display value from the index
        }

        // looping with the for-each
        for(int element : y) {
            System.out.println(element); // display value without index
        }
    }
}