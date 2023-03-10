package Input;

import java.util.Random;
import java.util.Scanner;

public class SPRClass{
    public static void main(String[] args) {

        // take input from user, S,P,R
        char a='Y';
        while(a=='Y') {
            Scanner inputObj = new Scanner(System.in);
            System.out.println("Please enter S,P or R. (Press Capslock)");
            char userMove = inputObj.next().charAt(0);
            System.out.println("\n\uD83D\uDC64:Your input-->>" + userMove);


            // make computer to make there move
            char[] arr = {'S', 'R', 'P'};
            Random random = new Random();
            int guessNumber = random.nextInt(3);
            char computerMove = arr[guessNumber];
            System.out.println("\uD83D\uDDA5️:Computer move-->>" + computerMove);


            // computer = user -> draw!!!
            if (userMove == computerMove) {
                System.out.println("\n----->Its draw.❌❌❌❌");
            }


            // user wins
            else if (userMove == 'S' || computerMove == 'P' && userMove == 'P' || computerMove == 'R' && userMove == 'R' || computerMove == 'P') {
                System.out.println("\n------>You Win.\uD83C\uDFC6\uD83C\uDFC6");
            }
            // computer wins
            else if (computerMove == 'S' || userMove == 'P' && computerMove == 'P' || userMove == 'R' && computerMove == 'R' || userMove == 'P') {
                System.out.println("\n------>Computer Wins.\uD83C\uDFC6\uD83C\uDFC6");

            }
            System.out.println("\n\uD83D\uDD04:Do you want to play again?");
            System.out.println("\uD83D\uDD04:If 'Yes' than type 'Y' or 'N' for 'Not.'");
            a = inputObj.next().charAt(0);
        }





    }



}



