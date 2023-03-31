//Simple java code to generate most strong password
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();
        String lc = "abcdefghijklmnopqrstuvwxyz";
        String uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String symbols = "@#$%&*";
        String use = lc + uc + number + symbols;
        int length = 8;
        char[] pass = new char[length];
        for(int i=0;i<length;i++)
        {
            pass[i] = use.charAt(random.nextInt(use.length()));
        }
        System.out.println("The new generated password is :" + new String(pass) );
    }
    
}