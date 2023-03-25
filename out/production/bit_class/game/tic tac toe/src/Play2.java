import java.util.Scanner;
public class Play2 {
    public static String[] play2(String[] platform ){
        String player2;
        Scanner input = new Scanner(System.in);
        System.out.println("player 2 turn...where u'd like to place ur alu?");
        player2 = input.nextLine();
        switch (player2) {
            case "9":
                if(platform[8]==null)
                platform[8] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }
                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "1":
                if(platform[0]==null)
                platform[0] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }
                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "2":
                if(platform[1]==null)
                    platform[1] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }
                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "3":
                if(platform[2]==null)
                    platform[2] = "x";
                else {
                    System.out.println("this space is not available.please try another place....");
                    platform=Play2.play2(platform);
                    break;
                }
                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "4":
                if(platform[3]==null)
                    platform[3] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "5":
                if(platform[4]==null)
                    platform[4] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "6":
                if(platform[5]==null)
                    platform[5] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "7":
                if(platform[6]==null)
                    platform[6] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
                        System.out.print("\n");
                    }
                }
                break;
            case "8":
                if(platform[7]==null)
                    platform[7] = "x";
                else {
                    System.out.println("this space is not available");
                    platform=Play2.play2(platform);
                    break;
                }                for (int i = 0; i < 9; i++) {
                    if (platform[i] != null) {
                        System.out.print(platform[i] + "|");
                    } else
                        System.out.print("_" + "|");
                    if (i == 2 || i == 5 || i == 8) {
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
