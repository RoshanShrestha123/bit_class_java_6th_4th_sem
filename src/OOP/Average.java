// Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int userNum = userInput.nextInt();

        System.out.println("Enter the second number: ");
        int userNum2 = userInput.nextInt();

        System.out.println("Enter the third number: ");
        int userNum3 = userInput.nextInt();

        calculateAndPrintAverage(userNum, userNum2, userNum3);
    }

    public static void calculateAndPrintAverage(int userNum, int userNum2, int userNum3){
        int average = (userNum + userNum2 + userNum3) / 3;
        System.out.println("The average of " + userNum + "," + userNum2 + " and " + userNum3 + " is: " + average);
    }
}
