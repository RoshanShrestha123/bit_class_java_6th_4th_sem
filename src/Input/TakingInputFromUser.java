package Input;

import java.util.Scanner;

public class TakingInputFromUser {
  public static void main(String[] abc){
    System.out.println("Enter your name:");
    Scanner input = new Scanner(System.in); // create only one Scanner object.
    String name = input.nextLine(); // asking string from scanner object.

    System.out.println("Enter your age:");
    int age = input.nextInt(); // asking int

    System.out.println("Are you married (y/n):");
    char married = input.next().charAt(0); // asking single char



  }
}