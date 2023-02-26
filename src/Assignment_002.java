import java.util.Scanner;

public class Assignment_002
{
  
    // Declaring the color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] arge)
    {
        Scanner input = new Scanner(System.in); //Obj for the scanner to take input
        //Header
        System.out.println(ANSI_YELLOW+"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println(            "▒▒▒▒      JX00-XC-HB1 Nuclear Reactor      ▒▒▒▒");
        System.out.println(            "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"+ANSI_RESET);
        System.out.println("\t     »»»» East of Japan ««««\t");
        System.out.println(ANSI_YELLOW+"───────────────────────────────────────────────"+ANSI_RESET);
        System.out.println("");


        // a)What is the total number of employees? (integer)
        System.out.println("Enter the Total number of Employees: ");
        
        System.out.printf("» ");
        int emp = input.nextInt();
        System.out.println("");
        

        //b)What is the name of supervisor? (string)
        System.out.println("Enter the Name of Supervisor: ");
        input.nextLine(); //FIX Skipped .nextLine
        System.out.printf("» ");
        String vis = input.nextLine();
        System.out.println("");

        //c)How many times the Nuclear waste is removed from the core? (integer)
        System.out.println("Enter the number of Nuclear waste removed from the core ");
        System.out.printf("» ");
        int waste = input.nextInt();
        System.out.println("");

        //d)What is the total weight of the waste produced every 1 week? (float or decimal)
        float totalWaste = (float) waste * 7;

        //e)Is Electric Motor being replaced every 18 days? Press “y” for yes and “n” for no (char)
        System.out.println("Is the electric motor being replaced every 18 days? (y/n): ");
        System.out.printf("» ");
        char motorReplacedChar = ' ';
        while (motorReplacedChar != 'y' && motorReplacedChar != 'n') 
        {
            motorReplacedChar = input.next().charAt(0);
            System.out.println("");
            
            if(motorReplacedChar != 'y' && motorReplacedChar != 'n') 
            {
                System.out.println("Invalid input. Please enter 'y' or 'n': ");
                System.out.printf("» ");
            }
        }

        boolean isMotorReplaced = (motorReplacedChar == 'y' || motorReplacedChar == 'Y');


        //f)What is the core average temperature ( celsius ) of the Nuclear Reactor? 
        System.out.println("Enter the Temperature in celsius of the Nuclear Reactor");
        System.out.printf("» ");
        float celsius = input.nextFloat();
        System.out.println("");

        input.close();

        //-------------------------Record Display-----------------------------

        System.out.println("████▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀████");
        System.out.println("████              UPDATED DATA             ████");
        System.out.println("████▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄████");
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.println("║  Total Number of Employee: "+emp+"           ");
          System.out.print("                                              ║\n");
        System.out.println("║  Supervisor Name: "+vis+"                    ");
          System.out.print("                                              ║\n");
        System.out.println("║  Waste Removal Count: "+waste+"              ");
          System.out.print("                                              ║\n");
        System.out.println("║  Weekly waste weight: "+totalWaste+"         ");
          System.out.print("                                              ║\n");

        if (isMotorReplaced) 
        {
        System.out.println("║  "+ANSI_GREEN+"Motor is Replaced!!!                        "+ANSI_RESET);
          System.out.print("                                              ║\n");
        } 
        else 
        {
        System.out.println("║  "+ANSI_RED+"Motor is Not Replaced!!!                    "+ANSI_RESET);
          System.out.print("                                              ║\n");
        }

        System.out.println("║  Core Temperature (Celsius): "+celsius+"° C   ");
          System.out.print("                                              ║\n");
        double kelvin = celsius + 273.15;
        System.out.println("║  Core Temperature  (Kelvin): "+kelvin+" K     ");
          System.out.print("                                              ║\n");
        System.out.println("████▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄████");

    }
}