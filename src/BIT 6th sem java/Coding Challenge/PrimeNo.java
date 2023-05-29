import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = userInput.nextInt();
        userInput.close();

        boolean isPrime = true;

        if (userNum <= 1) {
            isPrime = false;
         } else {
            for (int i = 2; i <= Math.sqrt(userNum); i++) {
               if (userNum % i == 0) {
                  isPrime = false;
                  break;
               }
            }
         }

         if(isPrime){
            System.out.println(userNum + " is a prime number");
         }else{
            System.out.println(userNum + " is not a prime number");
         }


    }
}
