import java.util.Scanner;
public class Play1 {
    public static String[] play1(String[] platform){
        Scanner input = new Scanner(System.in);
        String player1;
        System.out.println("player 1 turn...where u'd like to place ur alu?");
        player1 = input.nextLine();
        switch (player1){
            case "9":
                if(platform[8]==null)
                    platform[8] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "1":
                if(platform[0]==null)
                    platform[0] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "2":
                if(platform[1]==null)
                    platform[1] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }                  for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "3":
                if(platform[2]==null)
                    platform[2] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }                  for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "4":
                if(platform[3]==null)
                    platform[3] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "5":
                if(platform[4]==null)
                    platform[4] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "6":
                if(platform[5]==null)
                    platform[5] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "7":
                if(platform[6]==null)
                    platform[6] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            case "8":
                if(platform[7]==null)
                    platform[7] = "o";
                else {
                    System.out.println("this space is not available");
                    platform=Play1.play1(platform);
                    break;
                }
                for(int i=0;i<9;i++){
                    if(platform[i]!=null){
                        System.out.print(platform[i]+"|");
                    }
                    else
                        System.out.print("_"+"|");
                    if(i==2||i==5||i ==8){
                        System.out.print("\n");
                    }
                }
                break;
            default:
                System.out.println("invalid input");
        }
        return platform;
    }
}
