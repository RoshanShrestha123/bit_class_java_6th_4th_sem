### PACKAGE AND API
<p>
A package in Java is a namespace that organizes a set of related classes and interfaces. Think of it as a folder in file directory (Library files in C or C++).</p>
<p>
The Java platform provides an enormous class library(a set of packages) suitable for use in own applications. This library is known as the "Application Programming Interface" or "API" for short. Its packages represent the tasks most commonly associated with general-purpose programming. For example, a <b>String</b> object contains state and behavior for characters string; a <b>File</b> object allows a programmer to easily create, delete, inspect, compare, or modify a file on the filesystem; various <b> GUI </b> objects control buttons and checks boxes and anything else related to graphical user interfaces. There are literllary thousands of classes to choose from. This allows you, the programmer, to focus on the design of your particular application, rather than the infrastructure required to make it work.</p>

```
-->
Packages are used for
-Preventing naming conflicts
-Making searching / locating and usage of classes, interfaces, enumerations and annotations easier
-Providing controlled access
-Package can be consideres as data encapsulation (or data-hiding)
```
### Package are divided into two categories
--> Built-in Package (packages from the Java API)
--> User-defined Packages (create your own packages)

<h3> Built-in Package</h3>
<p> Built-in packages are existing java packages that come along with the JDK(Java Development KIT).For example,
<b> java.lang</b>, <b> java.util</b> , <b>java.io</b>,etc. For example:</p>
```
import java.util.ArrayList;
class ArrayListUtilization{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>(3);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.println(myList);
    }
}
```
**Try the program for output**

<h3>User-defined Package</h3>
<p>Java also allows you to create packages as per your need. These packages are called user-defined packages</p>
--> 
To define a package in Java, you use the keyword <b> package</b>. 