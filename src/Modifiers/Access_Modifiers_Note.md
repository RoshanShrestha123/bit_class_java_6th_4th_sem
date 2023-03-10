<h1><b> Modifiers</b> </h1>
-->
<p> The keyword used is an <b> access modifier </b> , meaning that it is used to set the accessibility(visibility) for classes, attributes, 
variables, constructors, data members and methods.</p>
<h3>We divide modifiers into two groups:</h3>
<p>--> <b> Access Modifiers</b> - controls the access level</p>
<p>--> <b> Non - Access Modifiers</b> - do not control access level, but provides other functionality</p>



### Access Modifiers
| Modifier | Description                                                                                                                                              |
|----------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| public   | (For class) The class is accessible for any other class.  <br> (For attributes, methods and constructors) The code is accessible for all classes.          |
| default  | The Code / Class is only accessible in the same package. This is used when you dont specify a modifier. <br> ( Learn more in Packages Topic )            |
| private  | The code is only accessible within the declared class.                                                                                                   |
| protected| The code is accessible in the same package and subclasses.                                                                                               |


### Non - Access Modifiers
| Modifier | Description                                                                                                                                              |
|----------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| final    | (For class) The class cannot be inherited by other classes. <br> (For attributes, methods and constructors) Attributes and methods cannot be overridden/modified. |
| static   | Attributes and methods belongs to the class, rather than the object.                                                                                      |
| abstract | (For class) The class cannot be used to create objects ( To access an abstract class , it must be inherited from another class).                          |
| abstract | (For attribute and methods) Can only be used in an abstract class, and can only be used on methods. The method doesn't have defination, the defination is provided by the sublcass (inherited from). |
| transient| Attributes and methods are skipped when serializing the object containing them.                                                                           |
| synchronized | Methods can only ve accessed byone thread at a time.                          |
| volatile | The value of an attribute is not cached thread-locally, and is always read from the "main memory"                          |

**->Try out the access modifiers yourself in programs/codes to find out the output yourself✌**
