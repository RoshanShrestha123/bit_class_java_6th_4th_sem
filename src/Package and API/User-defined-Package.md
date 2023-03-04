<h2> User-defined Package</h2>
<p>These are the packages that are defined by the User.</p>
<p>Similar to user-defined functions in C & C++</p>

### How to define a Java Package?
<p>To create a package in Java, you use the keyword <b> package</b>. </p>

```
package packageName;
```

<h3>packageClass.java</h3>

```
package packclass;
public class packageClass{
    public static void main(String[] args) {
        System.out.println("This is my package");
        System.out.println("User-defined package");
   }
}
```

<h4> Save the file as packageClass.java, and compile it: </h4>

```
C:\Users\Hawana>javac packageClass.java**
```

<h4>Then compile the package:</h4>

```
C:\Users\Hawana>javac -d . packageClass.java
```
<p>Note: This forces the compiler to create the "packclass" package.</p>
<p>Note: The package name should be written in lower case to avoid conflict with class names</p>
   
<h4> To run the packageClass.java file, write the following command </h4>

```
C:\Users\Hawana>java packclass.packageClass
```
