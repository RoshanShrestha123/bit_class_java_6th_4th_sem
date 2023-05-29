import java.util.Scanner;
public class Pattern
{
    public static void main(String[] args)
{
    Scanner userInputRows = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int rows = userInputRows.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    userInputRows.close();
 
    }
}

