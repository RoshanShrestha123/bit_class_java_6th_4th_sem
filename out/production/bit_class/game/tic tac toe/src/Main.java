public class Main
{
public static void main(String[] args)
    {
        //variables for o and x
        String p1="o";
        String p2="x";
        //Turn counter
        int turn=0;
        System.out.println("\t\t\tAALOO --X-- CROSS");
        System.out.println("Player 1=allu (o) and player 2=cross(x)");
      //platform for allu cross

     String platform[]=new String[9];
     System.out.println("1|2|3");
     System.out.println("4|5|6");
     System.out.println("7|8|9");
     while (1==1){

         if (platform[0]==null || platform[1]==null || platform[2]==null || platform[3]==null || platform[4]==null || platform[5]==null || platform[6]==null || platform[7]==null || platform[8]==null) {
             if (turn % 2 == 0) {
                 platform = Play1.play1(platform);
                 if(platform[0]==platform[1] && platform[1]==platform[2] && platform[0]!=null && platform[1]!=null && platform[2]!=null||platform[3]==platform[4] && platform[4]==platform[5] && platform[3]!=null && platform[4]!=null && platform[5]!=null||platform[6]==platform[7] && platform[7]==platform[8] && platform[6]!=null && platform[7]!=null && platform[8]!=null||platform[0]==platform[3] && platform[3]==platform[6] && platform[3]!=null && platform[0]!=null && platform[6]!=null||platform[1]==platform[4] && platform[4]==platform[7] && platform[1]!=null && platform[4]!=null && platform[7]!=null||platform[2]==platform[5] && platform[5]==platform[8] && platform[8]!=null && platform[2]!=null & platform[5]!=null||platform[0]==platform[4] && platform[4]==platform[8] && platform[0]!=null && platform[4]!=null && platform[8]!=null||platform[2]==platform[4] && platform[4]==platform[6] && platform[2]!=null && platform[4]!=null && platform[6]!=null){
                         System.out.println("player 1 wins");
                         break;
                 }
                 turn++;
             }
             else
             {
                 platform = Play2.play2(platform);
                 if(platform[0]==platform[1] && platform[1]==platform[2] && platform[0]!=null && platform[1]!=null && platform[2]!=null||platform[3]==platform[4] && platform[4]==platform[5] && platform[3]!=null && platform[4]!=null && platform[5]!=null||platform[6]==platform[7] && platform[7]==platform[8] && platform[6]!=null && platform[7]!=null && platform[8]!=null||platform[0]==platform[3] && platform[3]==platform[6] && platform[3]!=null && platform[0]!=null && platform[6]!=null||platform[1]==platform[4] && platform[4]==platform[7] && platform[1]!=null && platform[4]!=null && platform[7]!=null||platform[2]==platform[5] && platform[5]==platform[8] && platform[8]!=null && platform[2]!=null & platform[5]!=null||platform[0]==platform[4] && platform[4]==platform[8] && platform[0]!=null && platform[4]!=null && platform[8]!=null||platform[2]==platform[4] && platform[4]==platform[6] && platform[2]!=null && platform[4]!=null && platform[6]!=null){
                         System.out.println("player 2 wins");
                         break;
                 }
                 turn++;
             }
         }
         else {
             System.out.println("Draw!!!");
             break;
         }
     }

    }
}

