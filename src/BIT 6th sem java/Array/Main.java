public class Main{
    public static void main(String[] args) {

        // Looping array using for
        int[] age = {10, 20, 30};
        for(int i = 0; i<age.length; i++){
            System.out.println("Ages are " + age[i]);
        }

        // Looping array using foreach
        int[] salary = {1000, 2000, 3000};
        for(int arr : salary){
            System.out.println("Salary will be increment per month by " + arr);
        }
    }
}