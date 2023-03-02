package Strings;

public class StringMethods{
    public static void main(String[] args) {
    // initial setup 
       String str1 = "  Rahul  ";
       String str2 = "JavaIsLove";
       String str3 = "Mr. Neymar Jr";
       String str4 = "udemy.co.in";
       String str5 = "Java";
       String str6 = "java";
       String str7 = new String("Java");

        //Most used String Methods in java 
        System.out.println(str1.length()); //gives total length of our string
        System.out.println(str2.toUpperCase()); //converts whole string to uppercase
        System.out.println(str2.toLowerCase()); //converts whole string to lowercase
        System.out.println(str1.trim()); //removes all whitespace at head and end of our string
        System.out.println(str2.replace('a', 'e')); //to replace a char or word in our string 
        System.out.println(str2.substring(2)); //creates a substring starting from given index to end
        System.out.println(str2.substring(2,5)); //creates a substring starting from first index upto second index 
        System.out.println(str3.startsWith("Mr")); //checks if our string begins with given prefix
        System.out.println(str3.startsWith("Neymar",4)); //same as above but we can change starting offset
        System.out.println(str3.endsWith("Jr")); //to check if our string ends with given prefix
        System.out.println(str3.charAt(4)); //returns chat at given index
        System.out.println(str4.indexOf(".")); //returns first index of given string
        System.out.println(str4.lastIndexOf(".")); //returns last index of given string
        System.out.println(str5.equals(str6)); //check if two string have same value
        System.out.println(str5.equalsIgnoreCase(str6)); // same as above but ignores different casing (Upper/lower) 
        System.out.println(str5 == str7); //checks reference of strings
        System.out.println(str5.equals(str7));
        System.out.println(str5.compareTo(str6)); //compares dictionary position 
        System.out.println(str6.compareTo(str5));
        System.out.println(str5.compareToIgnoreCase(str6)); //ignores different casing 
        System.out.println(str3.concat(str2)); // to concat two or more strings
        System.out.println(str3.contains("Neymar")); //check if our string contains given value or string literal
        System.out.println(str3.contains("Messi"));
        int val = 56;
        System.out.println(String.valueOf(val) + 5);//converts value to string //our integer value 56 is converted to string
    }
}