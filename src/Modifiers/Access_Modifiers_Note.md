<h1><b> Modifiers</b></h1>
<p> The keywords used is an <b> access modifier </b>, meaning that it is used to set the accessibility (visibility) of classes, interfaces, varibles, methods,
  constructors, data members, attributes.
</p>
-->
<h3> There are two groups of modifiers </h3>
<p> -> <b> Access Modifiers </b> - controls the access level </p>
<p> -> <b> Non - Access Modifiers </b> - do not control access level, but provides other functionality </p>

-->
<h2> Access Modifiers </h2>

| Modifiers | Description                                                                                                                                              |
|-----------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| public    | (For class) The class is accessible by any other class. <br> (For attributes, method and constructors ) The code is accessible for all classes.            |
| default   | (For class) The class/code is only accessible by classes in the same package. This is used when you don't specify a modifier.<br> ( Learn in Packages and API)  |
| private   | The code is only accessible within the declared class.                                                             |
| protected | The code is accessible in the same package and subclasses.               |

-->
<h2> Non - Access Modifiers </h2>

| Modifiers | Description                                                                                                                                              |
|-----------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| final     | (For class) The class cannot be inherited by other classes <br> (For attributes and methods) Attributes and methods cannot be overridden/ modified       |
| static    | Attributes and methods belong to the class, rather than an object. |
| abstract  | (For class) The class cannot be used to create objects (To access an abstract class, it must be inherited from another class).                                                    |
| abstract  | (For attributes and methods) Can only be used in an abstract class and can be used on methods. The method doesn't have definition. The definition is provided by the sub class (inherited from)             |
| transient | Attributes and methods are skipped when serializing the object containing them.           |
| synchronized   | Methods can only be accessed by one thread at a time. |
| volatile  | The value of an attribute is not cached thread - locally, and is always read from the "main memory"                                                          |

**-> Try these modiiers in your program / code for better understanding and output✌**
