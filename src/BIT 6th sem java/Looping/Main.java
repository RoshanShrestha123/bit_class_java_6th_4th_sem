public class Main{
    public static void main(String[] args) {

        // for loop
        for(int i = 0; i<=5; i++){
            System.out.println("I is " + i);
        }

        // Foreach
        int[] numbers = {1, 2, 3 ,4};
        for(int arr : numbers){
            System.out.println("Numbers are " + arr);
        }

        // While loop
        int i = 0;
        while(i <10){
            System.out.println("I are " + i);
            i++;
        }

        // Do while loop
        int j = 0;
        do{
            System.out.println("J are " + j);
            j++;
        }
        while(j<10);
    }
}