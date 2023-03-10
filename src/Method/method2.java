// static vs public 
public class method2 {
    //static method
    static void myStaticMethod(){
        System.out.println("calling static method");
        // Static method can be called without creating ovjects
    }
    //public method
    public void myPublicMethod(){
        System.out.println("calling public method");
        // Public method must be called by creating objects
    }

    // Main method
    public static void main(String[] args)
    {
        myStaticMethod();   // calls the static method

        method2 obj1 = new method2();   // creates object of method2 class
        obj1.myPublicMethod();          // calls the public method by the object
    }
}
