## Basic Java Syntax
### Case sensitivity
Java is case sensitive
the identifier Hello and hello would be interpreted differently

### Class names
For all class names, the first letter should be in uppercase. If multiple words are used to declare the class, TitleCase should be used
Example:
```java
class MyFirstJavaClass {}
```

### Method names
All method names should start with a lowercase letter. If several words are used to declare the method, camelCase should be used
Example:
```java
public void myMethodName()
```

### Program file name
The name of the program file should exactly match the class name
Example:
Assume `MyFirstJavaProgram` is the class name, the file should be saved as `MyFirstJavaProgram.java`

### public static void main(String args[])
Java processing starts from the `main()` method which is a mandatory part of every Java program

### Java identifiers
All java components require names. These names (classes, variables, methods) are called identifiers
points to note:
 - all identifiers should begin with letters (a-z, A-Z) or currency characters or underscores
 -  key word cannot be used as an identifier
 - Identifiers are case sensitive, (classes can only begin in caps, methods cannot begin in caps)

### Java modifiers
Used to make changes to classes. There are two categories:
 - Access modifies - default, public, protected, private
 - Non Access modifiers - final, abstract, strictfp

### Java variables
the following are java variables
 - Local variables
 - Class variables (Static variables)
 - Instance variables (non static variables)

### Java enums
They restrict variables to have a few pre-defined values

Example:

if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. This would make sure that it would not allow anyone to order any size other than small, medium, or large.

```java
class FreshJuice{
    enum FreshJuiceSize {Small, Medium, Large}
    FreshJuiceSize size;
}

public class FreshJuiceTest {

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println("size" + juice.size);
    }
}
```

### Inheritance
In Java, classes can be derived from classes. Basically, if you need to create a new class and here is already a class that has some of the code you require, then it is possible to derive your new class from the already existing code.

This concept allows you to reuse the fields and methods of the existing class without having to rewrite the code in a new class. In this scenario, the existing class is called the `superclass` and the derived class is called the `subclass`.

### Interfaces
In Java language, an interface can be defined as a contract between objects on how to communicate with each other. Interfaces play a vital role when it comes to the concept of inheritance.

An interface defines the methods, a deriving class (subclass) should use. But the implementation of the methods is totally up to the subclass.
