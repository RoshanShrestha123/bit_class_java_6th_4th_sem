public class TwoDimension{
    public static void main(String[] args) {
        int[][] age = {{10, 20, 30},
                        {70, 80, 90},
                        {76, 67, 43}};

         // looping two dimension array using for
        for(int i = 0; i<age.length; i++){
            for(int j = 0; j<age[i].length; j++){
                System.out.println("Ages are " + age[i][j]);
            }
        }
    }

}