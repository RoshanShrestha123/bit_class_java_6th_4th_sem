public class diamond {
    public  static  void main(String[] args){
        //upper triangle
        for(int i=0;i<4;i++){
            for(int k=0;k<4-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.print("\n");

        }
        //lower triangle
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
                System.out.print("*");


            }
            System.out.print("\n");
            for(int k=0;k<=i;k++){
                    System.out.print(" ");
                }

        }
        System.out.println("\n");

    }
}
