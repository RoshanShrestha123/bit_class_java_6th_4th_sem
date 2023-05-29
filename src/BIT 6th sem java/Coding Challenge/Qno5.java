// public class Qno5 {
//     public static void main(String[] args) {
//       String str = "MOBILE PHONE IS DEAD";
//       String result = str.replaceAll("[AEIOUaeiou]", ""); 
//       System.out.println(result); 
//     }
//   }


public class Qno5 {
    public static void main(String[] args) {
        String str = "MOBILE PHONE IS DEAD";
        String vowels = "AEIOU";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) == -1 || i == 0 || str.charAt(i-1) == ' ') {
                System.out.print(c);
            }
            i++;
        }
    }
}


  