public class Main{
    public static void main(String[] args) {
        try{
            int numerator = 90;
            int denominator = 0;
            int result = denominator / numerator;
            System.out.println("Result is " + result);
        }catch(Exception e){
            System.out.println("Exception error " + e.getMessage());
        }
        // finally{
        //     System.out.println("Finally block executed");
        // }
    }

    public static int divide(int numerator, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("Division by zero");
        }
        return denominator / numerator;
    }
}