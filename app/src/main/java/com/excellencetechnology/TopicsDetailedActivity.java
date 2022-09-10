package com.excellencetechnology;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TopicsDetailedActivity extends AppCompatActivity {

    //Java Topics
    String intro = "<b>JAVA</b> was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy. It helps to create reusable code and modular programs.\n" +
            "\n" +
            "Java is a class-based, object-oriented programming language and is designed to have as few implementation dependencies as possible. A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java. Java applications are compiled to byte code that can run on any Java Virtual Machine. The syntax of Java is similar to c/c++.\n" +
            "History\n" +
            "\n" +
            "Java’s history is very interesting. It is a programming language created in 1991. James Gosling, Mike Sheridan, and Patrick Naughton, a team of Sun engineers known as the Green team initiated the Java language in 1991. Sun Microsystems released its first public implementation in 1996 as Java 1.0. It provides no-cost -run-times on popular platforms. Java1.0 compiler was re-written in Java by Arthur Van Hoff to strictly comply with its specifications. With the arrival of Java 2, new versions had multiple configurations built for different types of platforms.\n" +
            "\n" +
            "In 1997, Sun Microsystems approached the ISO standards body and later formalized Java, but it soon withdrew from the process. At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status. Sun generated revenue from Java through the selling of licenses for specialized products such as the Java Enterprise System.\n" +
            "\n" +
            "On November 13, 2006, Sun released much of its Java virtual machine as free, open-source software. On May 8, 2007, Sun finished the process, making all of its JVM’s core code available under open-source distribution terms.\n" +
            "\n" +
            "The principles for creating java were simple, robust, secured, high performance, portable, multi-threaded, interpreted, dynamic, etc. James Gosling in 1995 developed Java, who is known as the Father of Java. Currently, Java is used in mobile devices, internet programming, games, e-business, etc.\n" +
            "Java programming language is named JAVA. Why?\n" +
            "\n" +
            "After the name OAK, the team decided to give a new name to it and the suggested words were Silk, Jolt, revolutionary, DNA, dynamic, etc. These all names were easy to spell and fun to say, but they all wanted the name to reflect the essence of technology. In accordance with James Gosling, Java the among the top names along with Silk, and since java was a unique name so most of them preferred it.\n" +
            "\n" +
            "Java is the name of an island in Indonesia where the first coffee(named java coffee) was produced. And this name was chosen by James Gosling while having coffee near his office. Note that Java is just a name, not an acronym.";
    String print = "In Java, we usually use the println() method to print the statement. It belongs to the PrintStream class. The class also provides the other methods for the same purpose. In this section, we will learn how to print in Java. Along with this, we will also explain the statement System.out.println().\n" +
            "\n" +
            "The method we should use depends on what we want to print and what type of output we want. There are following three methods to print the statements:\n" +
            "\n" +
            "    print() Method\n" +
            "    println() Method\n" +
            "    printf() Method\n" +
            "\n" +
            "print() Method\n" +
            "\n" +
            "The print() method is used to print text on the console. It is an overloaded method of the PrintStream class. It accepts a string as a parameter. After printing the statement, the cursor remains on the same line. It also works if we do not parse any parameter.";
    String basic ="When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.\n" +
            "\n" +
            "    Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.\n" +
            "\n" +
            "    Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.\n" +
            "\n" +
            "    Methods − A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.\n" +
            "\n" +
            "    Instance Variables − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.\n";
    String  variables ="A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.\n" +
            "\n" +
            "Variable is a name of memory location. There are three types of variables in java: local, instance and static.\n" +
            "\n" +
            "There are two types of data types in Java: primitive and non-primitive.Variable\n" +
            "\n" +
            "A variable is the name of a reserved area allocated in memory. In other words, it is a name of the memory location. It is a combination of \"vary + able\" which means its value can be changed.Types of Variables\n" +
            "\n" +
            "There are three types of variables in Java:\n" +
            "\n" +
            "    local variable\n" +
            "    instance variable\n" +
            "    static variable\n1) Local Variable\n" +
            "\n" +
            "A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.\n" +
            "\n" +
            "A local variable cannot be defined with \"static\" keyword.\n" +
            "2) Instance Variable\n" +
            "\n" +
            "A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.\n" +
            "\n" +
            "It is called an instance variable because its value is instance-specific and is not shared among instances.\n" +
            "3) Static variable\n" +
            "\n" +
            "A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.";
    String  data_Types = "Java has two categories of data: \n" +
            "\n" +
            "    Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double\n" +
            "    Non-Primitive Data Type or Object Data type: such as String, Array, etc.Types of Primitive Datatypes\n" +
            "\n" +
            "There are 8 primitive data types. These are: \n" +
            "\n" +
            "1. boolean: boolean data type represents only one bit of information either true or false, but the size of the boolean data type is virtual machine-dependent. Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. But the programmer can easily write conversion code.2. byte: The byte data type is an 8-bit signed two’s complement integer. The byte data type is useful for saving memory in large arrays.3. short: The short data type is a 16-bit signed two’s complement integer. Similar to byte, use a short to save memory in large arrays, in situations where the memory savings actually matters.4. int: It is a 32-bit signed two’s complement integer.5. long: The long data type is a 64-bit two’s complement integer. 6. float: The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers.7. double: The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice.8. char: The char data type is a single 16-bit Unicode character.";
    String input = "Java User Input\n" +
            "\n" +
            "The Scanner class is used to get user input, and it is found in the java.util package.\n" +
            "\n" +
            "To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:";
    String operators ="Operators in Java\n" +
            "\n" +
            "Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.\n" +
            "\n" +
            "There are many types of operators in Java which are given below:\n" +
            "\n" +
            "    Unary Operator,\n" +
            "    Arithmetic Operator,\n" +
            "    Shift Operator,\n" +
            "    Relational Operator,\n" +
            "    Bitwise Operator,\n" +
            "    Logical Operator,\n" +
            "    Ternary Operator and\n" +
            "    Assignment Operator.";
    String javaIfandElse = "Java If-else Statement\n" +
            "\n" +
            "The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in Java.\n" +
            "\n" +
            "    if statement\n" +
            "    if-else statement\n" +
            "    if-else-if ladder\n" +
            "    nested if statement\n" +
            "\n" +
            "Java if Statement\n" +
            "\n" +
            "The Java if statement tests the condition. It executes the if block if condition is true.\n" +
            "\n" +
            "Syntax:Java if-else Statement\n" +
            "\n" +
            "The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.";
    String javaSwitch ="Java Switch Statement\n" +
            "\n" +
            "The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement. The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.\n" +
            "\n" +
            "In other words, the switch statement tests the equality of a variable against multiple values.";
    String javaLoops = "The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.\n" +
            "\n" +
            "There are three types of for loops in Java.\n" +
            "    Simple for Loop\n" +
            "    For-each or Enhanced for Loop\n" +
            "    Labeled for Loop\nJava Simple for Loop\n" +
            "\n" +
            "A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:\n" +
            "\n" +
            "    Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.\n" +
            "    Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.\n" +
            "    Increment/Decrement: It increments or decrements the variable value. It is an optional condition.\n" +
            "    Statement: The statement of the loop is executed each time until the second condition is false.\nJava Nested for Loop\n" +
            "\n" +
            "If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.Java for-each Loop\n" +
            "\n" +
            "The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.\n" +
            "\n" +
            "It works on the basis of elements and not the index. It returns element one by one in the defined variable. Java Labeled For Loop\n" +
            "\n" +
            "We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful while using the nested for loop as we can break/continue specific for loop.";
    String javaBreakandContinue ="Java Break\n" +
            "\n" +
            "You have already seen the break statement used in an earlier chapter of this tutorial. It was used to \"jump out\" of a switch statement.\n" +
            "\n" +
            "The break statement can also be used to jump out of a loop.Java Continue\n" +
            "\n" +
            "The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.";
    String javaMethods = "What is a method in Java?\n" +
            "\n" +
            "A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.\n" +
            "\n" +
            "The most important method in Java is the main() method.Method Declaration\n" +
            "\n" +
            "The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header, as we have shown in the following figure.Method Signature: Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.\n" +
            "\n" +
            "Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:\n" +
            "\n" +
            "    Public: The method is accessible by all classes when we use public specifier in our application.\n" +
            "    Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.\n" +
            "    Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.\n" +
            "    Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.\n" +
            "\n" +
            "Return Type: Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.\n" +
            "\n" +
            "Method Name: It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.\n" +
            "\n" +
            "Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.\n" +
            "\n" +
            "Method Body: It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces.\n" +
            "Naming a Method\n" +
            "\n" +
            "While defining a method, remember that the method name must be a verb and start with a lowercase letter. If the method name has more than two words, the first name must be a verb followed by adjective or noun. In the multi-word method name, the first letter of each word must be in uppercase except the first word. For example:";
    String javaMethodOverloading = "Method Overloading in Java\n" +

            "\n" +
            "If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.\n" +
            "\n" +
            "If we have to perform only one operation, having same name of the methods increases the readability of the program.\n" +
            "\n" +
            "Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs. ";
    String javaArray = "Java Arrays\n" +
            "\n" +
            "Normally, an array is a collection of similar type of elements which has contiguous memory location.\n" +
            "\n" +
            "Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.\n" +
            "\n" +
            "Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on. Types of Array in java\n" +
            "\n" +
            "There are two types of array.\n" +
            "\n" +
            "    Single Dimensional Array\n" +
            "    Multidimensional Array\n" +
            "\n";
    String javaStrings  ="Java String\n" +
            "\n" +
            "In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.";
    String javaStringMethodsandOperations = "Java String Class Methods\n" +
            "\n" +
            "The java.lang.String class provides a lot of built-in methods that are used to manipulate string in Java. By the help of these methods, we can perform operations on String objects such as trimming, concatenating, converting, comparing, replacing strings etc.\n" +
            "\n" +
            "Java String is a powerful concept because everything is treated as a String if you submit any form in window based, web based or mobile application.\n" +
            "\n" +
            "Let's use some important methods of String class.\n" +
            "Java String toUpperCase() and toLowerCase() method\n" +
            "\n" +
            "The Java String toUpperCase() method converts this String into uppercase letter and String toLowerCase() method into lowercase letter.\n";
    String javaObjectOrientedProgramming = "Java OOPs Concepts\n" +

            "In this page, we will learn about the basics of OOPs. Object-Oriented Programming is a paradigm that provides many concepts, such as inheritance, data binding, polymorphism, etc.\n" +
            "\n" +
            "Simula is considered the first object-oriented programming language. The programming paradigm where everything is represented as an object is known as a truly object-oriented programming language.\n" +
            "\n" +
            "Smalltalk is considered the first truly object-oriented programming language. OOPs (Object-Oriented Programming System)\n" +
            "\n" +
            "Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:\n" +
            "\n" +
            "    Object\n" +
            "    Class\n" +
            "    Inheritance\n" +
            "    Polymorphism\n" +
            "    Abstraction\n" +
            "    Encapsulation\n" +
            "\n" +
            "Apart from these concepts, there are some other terms which are used in Object-Oriented design:\n" +
            "\n" +
            "    Coupling\n" +
            "    Cohesion\n" +
            "    Association\n" +
            "    Aggregation\n" +
            "    Composition\n" +
            "\nObject\n" +
            "Java Object\n" +
            "\n" +
            "Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.\n" +
            "\n" +
            "An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing is the type of message accepted and the type of response returned by the objects.\n" +
            "\n" +
            "Example: A dog is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, barking, eating, etc.\n" +
            "Class\n" +
            "\n" +
            "Collection of objects is called class. It is a logical entity.\n" +
            "\n" +
            "A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.";

    String javaClassesandObjects ="Objects and Classes in Java\n" +

            "In this page, we will learn about Java objects and classes. In object-oriented programming technique, we design a program using objects and classes.\n What is an object in Java\n" +
            "object in Java\n" +
            "\n" +
            "An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible). The example of an intangible object is the banking system. \n" +
            "    State: represents the data (value) of an object.\n" +
            "    Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.\n" +
            "    Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.\nAn object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class. Object Definitions:\n" +
            "\n" +
            "    An object is a real-world entity.\n" +
            "    An object is a runtime entity.\n" +
            "    The object is an entity which has state and behavior.\n" +
            "    The object is an instance of a class.\nWhat is a class in Java\n" +
            "\n" +
            "A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.\n" +
            "\n" +
            "A class in Java can contain:\n" +
            "\n" +
            "    Fields\n" +
            "    Methods\n" +
            "    Constructors\n" +
            "    Blocks\n" +
            "    Nested class and interface\n" +
            "\n" +
            "An object in Java is the physical as well as a logical entity, whereas, a class in Java is a logical entity only. ";
    String javaArrayofObjects = "Array of Objects in Java\n" +
            "\n" +
            "Java is an object-oriented programming language. Most of the work done with the help of objects. We know that an array is a collection of the same data type that dynamically creates objects and can have elements of primitive types. Java allows us to store objects in an array. In Java, the class is also a user-defined data type. An array that conations class type elements are known as an array of objects. It stores the reference variable of the object.Creating an Array of Objects\n" +
            "\n" +
            "Before creating an array of objects, we must create an instance of the class by using the new keyword. We can use any of the following statements to create an array of objects.";
    String javaConstructorOverloading = "Constructor overloading in Java\n" +
            "\n" +
            "In Java, we can overload constructors like methods. The constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.\n" +
            "\n" +
            "Consider the following Java program, in which we have used different constructors in the class. ";
    String javaAccessModifiers = "Access Modifiers in Java\n" +

            "There are two types of modifiers in Java: access modifiers and non-access modifiers.\n" +
            "\n" +
            "The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.\n" +
            "\n" +
            "There are four types of Java access modifiers:\n" +
            "\n" +
            "    Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.\n" +
            "    Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.\n" +
            "    Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.\n" +
            "    Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.\n" +
            "\n" +
            "There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. Here, we are going to learn the access modifiers only.";
    String javaInheritance = "Inheritance in Java\n" +
            "\n" +
            "    Inheritance\n" +
            "    Types of Inheritance\n" +
            "    Why multiple inheritance is not possible in Java in case of class?\n" +
            "\n" +
            "Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).\n" +
            "\n" +
            "The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.\n" +
            "\n" +
            "Inheritance represents the IS-A relationship which is also known as a parent-child relationship.";
    String javasuperKeyword = "Super Keyword in Java\n" +
            "\n" +
            "The super keyword in Java is a reference variable which is used to refer immediate parent class object.\n" +
            "\n" +
            "Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.";
    String javaAbstraction = "Abstract class in Java\n" +
            "\n" +
            "A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).\n" +
            "\n" +
            "Before learning the Java abstract class, let's understand the abstraction in Java first.";
    String javaAbstractclass  = "Abstract class in Java\n" +
            "\n" +
            "A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.";
    String javaInterface = "An interface in Java is a blueprint of a class. It has static constants and abstract methods.\n" +
            "\n" +
            "The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.\n" +
            "\n" +
            "In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. ";
    String javaEncapsulation = " Encapsulation in Java\n" +
            "\n" +
            "Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.\n" +
            "encapsulation in java\n" +
            "\n" +
            "We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.";
    String javastaticKeyword = "Java static keyword\n" +

            "The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.";
    String javathisKeyword = "this keyword in Java\n" +
            "\n" +
            "There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.";
    String javafinalKeyword = "Final Keyword In Java\n" +

            "The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:\n" +
            "\n" +
            "    variable\n" +
            "    method\n" +
            "    class\n" +
            "\n" +
            "The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword. ";
    String javaErrorsandExceptions = "Exception Vs Error in Java\n" +
            "\n" +
            "The general meaning of exception is a deliberate act of omission while the meaning of error is an action that is inaccurate or incorrect. In Java, Exception, and Error both are subclasses of the Java Throwable class that belongs to java.lang package. But there exist some significant differences between them. So, in this section, we are going to discuss the key differences between exception and error.";
    String javaExceptionHandling = "Exception Handling in Java\n" +

            "The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.\n" +
            "\n" +
            "In this tutorial, we will learn about Java exceptions, it's types, and the difference between checked and unchecked exceptions.";
    String javaThrowandThrows ="Difference between throw and throws in Java\n" +
            "\n" +
            "The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly from a method or a block of code whereas the throws keyword is used in signature of the method.";

    String javaAssertion = "Assertion:\n" +
            "\n" +
            "Assertion is a statement in java. It can be used to test your assumptions about the program.\n" +
            "\n" +
            "While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError. It is mainly used for testing purpose. ";
    String javaFileHandling = "File Operations in Java\n" +
            "\n" +
            "In Java, a File is an abstract data type. A named location used to store related information is known as a File. There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.\n" +
            "\n" +
            "Before understanding the File operations, it is required that we should have knowledge of Stream and File methods. If you have knowledge about both of them, you can skip it.";
    String javaWrapperClasses = "Wrapper classes in Java\n" +
            "\n" +
            "The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.\n" +
            "\n" +
            "Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.";
    String javaCollectionFramework = "Is collections a framework in Java?\n" +
            "The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.";
    String javaArrayList = "Java ArrayList\n" +
            "Java ArrayList class hierarchy\n" +
            "\n" +
            "Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.\n" +
            "\n" +
            "The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.\n" +
            "\n" +
            "It inherits the AbstractList class and implements List interface.\n" +
            "\n" +
            "The important points about the Java ArrayList class are:";
    String javaIterator = "Iterator in Java\n" +
            "Java Iterator is an interface that is practiced in order to iterate over a collection of Java object components entirety one by one. It is free to use in the Java programming language since the Java 1.2 Collection framework. It belongs to java. util package.";
    String javaNestedClasses = "In Java, it is possible to define a class within another class, such classes are known as nested classes. They enable you to logically group classes that are only used in one place, thus this increases the use of encapsulation, and creates more readable and maintainable code";
    String javaLambdaExpressions = "Java Lambda Expressions\n" +
            "\n" +
            "Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.\n" +
            "\n" +
            "The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.";
    String javaAnnotations = "Java Annotations\n" +
            "\n" +
            "Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.\n" +
            "\n" +
            "Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker interfaces.";

    //Python Topics
    String PythonIntroduction = "In IT sector, one of the top company named Google uses Python for its system administration and system building purpose. There are extensive number of applications written in or uses Python programming language. In which these are the list of some famous and well-known applications all over the world:\n" +
            "\n" +
            "    YouTube - uses Python programming as its Back-end (server-side) development, along with some other languages that are C, C++, or Java, and Go.\n" +
            "    Google - uses Python programming as its Back-end, along with other languages such as C, C++, Java, Go, and Node\n" +
            "    Facebook - despite of PHP being the core language of Facebook, they also uses Python as its Back-end development, along with other languages such as C++, Java, PHP (HHVM), Hack, Erlang, D, XHP, and Haskell.\n" +
            "    Similarly Yahoo, Pinterest, Spotify, Dropbox, NetFlix, Reddit etc. also uses Python.\n" +
            "\n" +
            "Even NASA and SpaceX uses Python programming language for many purposes like testing, automation etc.\n" +
            "\n" +
            "If these multi-national companies uses Python, then there must be a big reason behind it. Those big reasons are covered in the What is Python used for ? section, given below. Most of the time, many companies that are using Python because of its versatility and dexterity.";

    String PythonPrint ="Python print() Function\n" +
            "\n" +
            "The print() function or statement in Python is I think the most used statement in my perspective. Because every time we need to produce or print some output, the print() function is required. This article teaches you everything about this function.";
    String PythonBasics = "Python can be used for many purposes, in which these are the list of some common ones:\n" +
            "\n" +
            "    Web Development - Python is increasing its area in the field of web development too. Using Python's famous web framework say Django or Flask, you can write fast and secured Back-end code for your web. From all the web frameworks provided by Python, Django is the most famous and widely used. Also it is highly-scalable. Even Django like full-stack web framework, can be used for front-end too.\n" +
            "    Data Science - Python programming also helps to develop an application that extracts knowledge and insights from both an unstructured and structured data across broad range of applications. Scrapy is one of the most used data science library in Python, used for Data Mining. Now-a-day, web scrapping application are also getting developed by many stealer too, to scrap the things from Internet. Whereas NumPy, Pandas, and TensorFlow are the three most used data science libraries in Python programming, used for Data Processing and Modeling.\n" +
            "    Machine Learning - NumPy and SciPy are the two famous libraries that can be used in the field of machine learning using Python. Basically machine learning is a step to artificial intelligence. Like human learning, that You're or I'm learning the things, machine can also learn using data statistics and whatever you want to provide.\n" +
            "    Artificial Intelligence - This is the field where I think Python dominates almost all the other programming languages. As Python is trending in Artificial intelligence. It is I think the most used language in this field. The Pandas and SciPy are the famous and widely used libraries in the field of artificial intelligence using Python.\n" +
            "    Data Visualization - Python programming can also be used to create data visualization applications. Data visualization means representing the data or information in the form of graphs. Matplotlib is one of the famous library that can be used for data visualization in Python.\n" +
            "    Operating System Applications - Application for operating system such as command line application, system administration, business application etc. can also be developed using Python programming language.\n" +
            "    Desktop GUI - In Python, Tkinter is one of the famous Python programming package that can be used to develop desktop Graphical User Interface (GUI) applications.\n" +
            "    Mobile Application Development - Kivy is one of the famous framework used to develop mobile application using Python programming.\n" +
            "    Video Games Development - Pygame is a library used in Python to develop multimedia related things like video games. Scripting engine of the game can also be written using Python programming.\n" +
            "    Bots - Bots can also be created using Python programming. Bots are helpful to deploy an automated task over the internet or wherever the programmer need to deploy. Bots works only on pre-defined tasks.\n";
    String PythonVariables = "Variables in Python refers to reserved memory locations, and are used to store values. In simple words, we can say that a variable is basically a container for a value used in a program.\n" +
            "\n" +
            "Python doesn't provide any command to declare a variable. The variable is created at the time of assigning value to it. The type of variable, depends on the type of value assigned to it.\n" +
            "\n" +
            "Python is a case-sensitive language. Therefore myname and myName are two different variables.";
    String PythonDataTypes = "Data types in Python, is basically an attribute of data which tells the compiler or interpreter, how to interpret its value. For example, if we have a numeric types of data, means that, it can be used to perform arithmetic operations.\n" +
            "Python 7 Built-in Data Types\n" +
            "\n" +
            "Data type represents the type of value and determines how the value can be used in a Python program. Here are the list of 7 built-in data types:\n" +
            "\n" +
            "    Text Type\n" +
            "    Numeric Types\n" +
            "    Sequence Types\n" +
            "    Mapping Type\n" +
            "    Set Types\n" +
            "    Boolean Type\n" +
            "    Binary Types\n" +
            "\n" +

            "Let's describe briefly about these 7 built-in data types, one by one along with example programs. But before starting, let's first understand how can we get the type of data, a variable holds.";
    String PythonInput = "This article is very important before starting the series of Python programs. Since understanding how to receive inputs from user in Python is required in almost every program.\n" +
            "\n" +
            "Therefore I've created some programs here in Python, that shows how inputs gets received from user in many ways. Here are the list of programs on receiving user inputs in Python:\n" +
            "\n" +
            "    Simplest Way to Receive User Input\n" +
            "    Get Integer Input from User\n" +
            "    Floating-point Input\n" +
            "    A Character Input\n" +
            "    String Input\n" +
            "    Receive Continuous Inputs\n";
    String PythonOperators = "Operators that are used in Python, divided into 7 categories as listed here:\n" +
            "\n" +
            "    Arithmetic Operators\n" +
            "    Assignment Operators\n" +
            "    Comparison Operators\n" +
            "    Logical Operators\n" +
            "    Bitwise Operators\n" +
            "    Identity Operators\n" +
            "    Membership Operators\n" +
            "\n" +
            "Now let's discuss about all these operators in brief with well designed example programs for each category.";
    String PythonIfandElse = "The if, if-else or if-elif-else statement are most-used statement in Python world. Since these provides to implement conditions in a program. And based on those conditions, automatically or dynamically, the decisions can be taken by the program. Therefore, without complete understanding about these statements, don't move forward. This is like the basic building block of Python programming.\n" +
            "\n" +
            "Therefore, I've provided all these three conditional statements in one single tutorial, with its description, syntax, and well-understandable examples. This article deals with:\n" +
            "\n" +
            "    if Statement\n" +
            "    if...else Statement\n" +
            "    if...elif...else Statement\n" +
            "    Nested if, if...else, if...elif...else Statement\n";
    String PythonWhileLoop = "The while loop in Python, used to execute some block of code, multiple times. I've included all version of the loop. That is, this article deals with:\n" +
            "\n" +
            "    Example of while loop\n" +
            "    while loop as infinite loop\n" +
            "    How to stop the infinite execution of while loop\n" +
            "    while loop with break keyword\n" +
            "    while loop with continue keyword\n" +
            "    while loop with pass keyword\n" +
            "    while loop with list\n" +
            "    while loop with else block\n" +
            "    while loop in single line\n" +
            "    And at last, the nested while loop\n";
    String PythonForLoop = "The for loop in Python, is used to execute some block of code, multiple times. This article is created to provide all versions of for loop in Python. That is, this article deals with:\n" +
            "\n" +
            "    Iterating string using for loop\n" +
            "    Iterating list using for loop\n" +
            "    Iterating for loop using range() function\n" +
            "    for loop with range(), started by specified value\n" +
            "    for loop with range(), started and incremented by specified values\n" +
            "    Iterating for loop in reverse or backward using range()\n" +
            "    for loop with else statement\n" +
            "    break statement in for loop\n" +
            "    continue statement in for loop\n" +
            "    pass statement in for loop\n" +
            "    nested for loop\n";
    String PythonBreakandContinue = "This tutorial is created to cover one of the second most used conditional statement named break in Python. Here I've provide you all the details about break keyword or statement along with its simple examples. This article deals with:\n" +
            "\n" +
            "    What is break statement ?\n" +
            "    Syntax of break statement\n" +
            "    Examples of break statement\n" +
            "    break statement in while loop\n" +
            "    break statement in nested while loop\n" +
            "    break statement in for loop\n \ncontinue Statement in Python\n" +
            "\n" +
            "This tutorial is created to cover one of the most used conditional statement of Python, that is continue statement. The continue statement sometime plays an important role in creating the logical program. Therefore, I've provided all the details about it along with its examples. This article deals with:\n" +
            "\n" +
            "    What is continue statement ?\n" +
            "    Syntax of continue statement\n" +
            "    Examples of continue statement\n";
    String PythonLists = "List in Python is a built-in data type, used to store multiple items in a single variable. That is, when we need to store collection of data in a single variable, then we use list.\n" +
            "\n" +
            "Note - List items are ordered, changeable, and allows duplicates.\n" +
            "\n" +
            "List items are ordered, means that all the items (elements or values) of the list are numbered. For example, if there is a list named mylist, then mylist[0] refers to the first element, whereas the mylist[1] refers to the second element, and so on.\n" +
            "\n" +
            "List items are changeable, means that we can change the items of the list further, after initialization.\n" +
            "\n" +
            "List items allows duplicate values, means that in a particular list, there may be two or more items with same values.";
    String PythonListComprehension = "What is Python List Comprehension?\n" +
            "\n" +
            "Some of the programming languages have a syntactic construct called list comprehension for creating lists on the basis of existing lists. Python is one such language. In other words, list comprehensions are used for converting one list into another list or creating a new list from other iterables.\n" +
            "A list comprehension consists of:\n" +
            "\n" +
            "    Input sequence\n" +
            "    A variable to store members of the input sequence\n" +
            "    Predicate expression\n" +
            "    Output expression that produces the output list based on the input sequence and also satisfies the predicate\n" +
            "\n" +
            "Let’s take a brief look over Python lists before starting with Python list comprehensions.";
    String PythonStrings = "Strings are used to represent text, a combination of characters, without mattering the type of characters. Therefore, strings can also store a value that contains numbers.\n" +
            "\n" +
            "But the question is, how can we identify whether the value is of string (str) type or not ?\n" +
            "The answer is: anything enclosed within a single or double quotes, is a string.";
    String PythonTuples = "Tuple in Python is a built-in data type, used to store multiple items in a single variable";
    String PythonDictionary = "Dictionary in Python is a data type, a kind of mapping type, which is used when we need to store multiple items in the form of key:value pairs.\n" +
            "\n" +
            "In real world, you can consider any dictionary book where the information stored in the form of key:value pair, where key refers the word, and the value refers to its definition.\n" +
            "\n" +
            "Dictionary helps in organizing the information. For example, in dictionary book, all the words are organized in alphabetical order, so that we can easily find the required word and get the definition or description about that word, very easily";
    String PythonDictionaryComprehension = "Dictionary comprehension is an elegant and concise way to create dictionaries.";
    String PythonSets = "This article provides you the easy way to learn all about Sets in Python with the help of not only theory, but with example programs and their respective outputs. This article deals with:\n" +
            "\n" +
            "    Set definition and its syntax\n" +
            "    Precaution of using curly braces\n" +
            "    Get unique elements from list using set\n" +
            "    Add new items to a set\n" +
            "    The set() constructor\n" +
            "    Set Operations\n" +
            "    Set Example with item of multiple data types\n" +
            "    Add multiple items to a set\n" +
            "    Add two sets\n" +
            "    Find and print length of a set\n" +
            "    Check if an element is available in set or not\n" +
            "    Remove an element from a set\n";
    String PythonFunctions = "Function in Python is used when we need to execute some block of code, multiple times. The block of statements written inside a function, is only gets executed, when the function is called.";
    String PythonFixedVariableArgument = "";
    String PythonOOP = "Python is a multi-paradigm programming language. It supports different programming approaches.\n" +
            "\n" +
            "One of the popular approaches to solve a programming problem is by creating objects. This is known as Object-Oriented Programming (OOP).\n" +
            "\n" +
            "An object has two characteristics:\n" +
            "\n" +
            "    attributes\n" +
            "    behavior\n" +
            "\n" +
            "Let's take an example:\n" +
            "\n" +
            "A parrot is an object, as it has the following properties:\n" +
            "\n" +
            "    name, age, color as attributes\n" +
            "    singing, dancing as behavior\n" +
            "\n" +
            "The concept of OOP in Python focuses on creating reusable code. This concept is also known as DRY (Don't Repeat Yourself).\n" +
            "\n" +
            "In Python, the concept of OOP follows some basic principles:";
    String PythonClassesandObjects = "This article is created to deliver all the things about classes and objects in Python. This article deals with these topics, related to class and object:\n" +
            "\n" +
            "    Creating a class\n" +
            "    Creating an object\n" +
            "    Accessing attributes of the class\n" +
            "    The __init__() method of class\n" +
            "    The self parameter in method of class\n" +
            "    Deleting an object\n" +
            "    Class and object example program\n" +
            "\n" +
            "Classes is an object-oriented feature of Python, provides to create program in more organized way by putting data members and methods in one place. Class also helps in encapsulating functionality into objects.";
    String PythonInstanceClassandtaticMethod = "Instance methods need a class instance and can access the instance through self . Class methods don't need a class instance. They can't access the instance ( self ) but they have access to the class itself via cls . Static methods don't have access to cls or self .";
    String PythonSubclassofaClass = "Python Subclass\n" +
            "\n" +
            "To understand what a subclass is, let’s look at an example.\n" +
            "\n" +
            "Suppose we define a rectangle with some length and breadth. Now, a square is also a rectangle but having the same length and breadth.\n" +
            "\n" +
            "From this, you must have got the feel that a square is a subclass of rectangle.\n" +
            "\n" +
            "Let’s think of some more examples of subclasses. A class ‘Book’ can have ‘ScienceBook’ and ‘MathsBook’ as its subclasses. Another class ‘Animals’ can have ‘Dog’, ‘Cat’ and ‘Goat’ as its subclasses.\n" +
            "\n" +
            "The class whose subclass has been made is called a superclass. Other names of superclass are base class or parent class, and other names of subclass are derived class or child class. In our Rectangle example, Rectangle is the superclass and Square is its subclass. The process of creating a subclass of a class is called inheritance.\n" +
            "\n" +
            "All the attributes and methods of superclass are inherited by its subclass also. This means that an object of a subclass can access all the attributes and methods of the superclass. Moreover, subclass may have its own attributes or methods in addition to the inherited ones as well. ";
    String PythonMultipleInheritance = "Python Multiple Inheritance\n" +
            "\n" +
            "In this tutorial, you'll learn about multiple inheritance in Python and how to use it in your program. You'll also learn about multi-level inheritance and the method resolution order.\n" +
            "Python Multiple Inheritance\n" +
            "\n" +
            "A class can be derived from more than one base class in Python, similar to C++. This is called multiple inheritance.\n" +
            "\n" +
            "In multiple inheritance, the features of all the base classes are inherited into the derived class. The syntax for multiple inheritance is similar to single inheritance.";
    String PythonMethodOverridingandMRO = "Method overriding is an ability of any object-oriented programming language that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class";
    String PythonErrorsandExceptions= "8. Errors and Exceptions\n" +
            "\n" +
            "Until now error messages haven’t been more than mentioned, but if you have tried out the examples you have probably seen some. There are (at least) two distinguishable kinds of errors:";
    String PythonExceptionHandling = "Exception handling in Python, is a process of handling an exception raised by the Python program. Following are the keywords used to deal with exception handling in Python:\n" +
            "\n" +
            "    try\n" +
            "    except\n" +
            "    finally\n" +
            "    raise\n" +
            "\n" +
            "Sometime exception handling becomes important, to continue the execution of program, to avoid the program halt when an exception is raised.";

    String PythonRaisingExceptions = "Raise an exception\n" +
            "\n" +
            "As a Python developer you can choose to throw an exception if a condition occurs.\n" +
            "\n" +
            "To throw (or raise) an exception, use the raise keyword.";
    String PythonAssert ="The assert keyword is used when debugging code.\n" +
            "\n" +
            "The assert keyword lets you test if a condition in your code returns True, if not, the program will raise an AssertionError.";
    String PythonFilesHandling = "This article is created to cover all the topics of file handling along with example programs and its respective sample runs or outputs. Therefore, the tutorial on file handling here, is designed to make you feel like, from ground to top.\n" +
            "\n" +
            "File handling is one of the hot topic of Python. Because, sometime we need to process the file using our Python program, to insert, update, or delete the information in/from the file.\n" +
            "\n" +
            "The most used function in file handling is open(). Because every time to perform any operation on the file, we need to open the file first, and this function is used to open the file.\n" +
            "\n" +
            "Note - Based on the opening modes, the file gets opened for the purpose of reading, writing, appending etc.";
    String PythonIterators  = "Python Iterators\n" +
            "\n" +
            "An iterator is an object that contains a countable number of values.\n" +
            "\n" +
            "An iterator is an object that can be iterated upon, meaning that you can traverse through all the values.\n" +
            "\n" +
            "Technically, in Python, an iterator is an object which implements the iterator protocol, which consist of the methods __iter__() and __next__().";
    String PythonStringFormatting = "Instead of using a string as it is, many times we need to stuff the string with other data value. And it is called as string formatting.\n" +
            "\n" +
            "You will learn more about it as I explain string formatting with an example below.\n" +
            "\n" +
            "In this tutorial, you will also learn to use different approaches for string formatting in Python.";
    String PythonLambdaFunctions = "Python Lambda Functions are anonymous function means that the function is without a name. As we already know that the def keyword is used to define a normal function in Python. Similarly, the lambda keyword is used to define an anonymous function in Python. ";
    String PythonNestedFunctions = "Inner functions, also known as nested functions, are functions that you define inside other functions. In Python, this kind of function has direct access to variables and names defined in the enclosing function. Inner functions have many uses, most notably as closure factories and decorator functions.\n" +
            "\n" +
            "In this tutorial, you’ll learn how to:\n" +
            "\n" +
            "    Provide encapsulation and hide your functions from external access\n" +
            "    Write helper functions to facilitate code reuse\n" +
            "    Create closure factory functions that retain state between calls\n" +
            "    Code decorator functions to add behavior to existing functions\n";
    String PythonScopeofVariables = "In Python, variables are the containers for storing data values. They are reference, or pointers, to an object in memory which means that whenever a variable is assigned to an instance, it gets mapped to that instance. Unlike other languages like C/C++/JAVA, Python is not “statically typed”. We do not need to declare variables before using them or declare their type. A variable is created the moment we first assign a value to it.";
    String PythonClosures  = " Python closures tutorial shows how to use closure functions in Python.\n" +
            "\n" +
            "Python functions are first-class citizens. This means that functions have equal status with other objects in Python. Functions can be assigned to variables, stored in collections, created and deleted dynamically, or passed as arguments. ";
    String PythonDecorators ="A decorator is a design pattern in Python that allows a user to add new functionality to an existing object without modifying its structure. Decorators are usually called before the definition of a function you want to decorate. In this tutorial, we'll show the reader how they can use decorators in their Python functions.\n" +
            "\n" +
            "Functions in Python are first class citizens. This means that they support operations such as being passed as an argument, returned from a function, modified, and assigned to a variable. This is a fundamental concept to understand before we delve into creating Python decorators.";
    String PythonDocstrings ="Python documentation strings (or docstrings) provide a convenient way of associating documentation with Python modules, functions, classes, and methods.\n" +
            "\n" +
            "It’s specified in source code that is used, like a comment, to document a specific segment of code. Unlike conventional source code comments, the docstring should describe what the function does, not how.\n" +
            "\n" +
            "What should a docstring look like?\n" +
            "\n" +
            "    The doc string line should begin with a capital letter and end with a period.\n" +
            "    The first line should be a short description.\n" +
            "    If there are more lines in the documentation string, the second line should be blank, visually separating the summary from the rest of the description.\n" +
            "    The following lines should be one or more paragraphs describing the object’s calling conventions, its side effects, etc.\n" +
            "\n" +
            "Declaring Docstrings: The docstrings are declared using ”’triple single quotes”’ or “””triple double quotes””” just below the class, method or function declaration. All functions should have a docstring.\n" +
            "\n" +
            "Accessing Docstrings: The docstrings can be accessed using the __doc__ method of the object or using the help function.\n" +
            "The below examples demonstrates how to declare and access a docstring.";

    //Js Topics
    String WhatisJavaScript = "JavaScript is a client and server-side object-based scripting language that is used to make interactive Web pages. A scripting language is a lightweight programming language with less complexity.\n" +
            "\n" +
            "JavaScript is the most usually used scripting language to add dynamism and interactivity to Web pages. This is because JavaScript, written on the client-side, executes on a client browser, thereby reducing the load on the server.";

    String UnderstandingEvents = "An event is an action that occurs in the web browser, which the web browser feedbacks to you so that you can respond to it.\n" +
            "\n" +
            "For example, when users click a button on a webpage, you may want to respond to this click event by displaying a dialog box.\n" +
            "\n" +
            "Each event may have an event handler which is a block of code that will execute when the event occurs.\n" +
            "\n" +
            "An event handler is also known as an event listener. It listens to the event and executes when the event occurs.";
    String JavaScriptExample = "Javascript example is easy to code. JavaScript provides 3 places to put the JavaScript code: within body tag, within head tag and external JavaScript file.";
    String ExternalJavaScript = "We can create external JavaScript file and embed it in many html page.\n" +
            "\n" +
            "It provides code re usability because single JavaScript file can be used in several html pages.\n" +
            "\n" +
            "An external JavaScript file must be saved by .js extension. It is recommended to embed all JavaScript files into a single file. It increases the speed of the webpage.\n" +
            "\n" +
            "Let's create an external JavaScript file that prints Hello Javatpoint in a alert dialog box.";
    String Comment = "The JavaScript comments are meaningful way to deliver message. It is used to add information about the code, warnings or suggestions so that end user can easily interpret the code.\n" +
            "\n" +
            "The JavaScript comment is ignored by the JavaScript engine i.e. embedded in the browser";

    String Variable= "A JavaScript variable is simply a name of storage location. There are two types of variables in JavaScript : local variable and global variable.\n" +
            "\n" +
            "There are some rules while declaring a JavaScript variable (also known as identifiers).\n" +
            "\n" +
            "    Name must start with a letter (a to z or A to Z), underscore( _ ), or dollar( $ ) sign.\n" +
            "    After first letter we can use digits (0 to 9), for example value1.\n" +
            "    JavaScript variables are case sensitive, for example x and X are different variables.\n";
    String GlobalVariable = "A JavaScript global variable is declared outside the function or declared with window object. It can be accessed from any function.";
    String DataTypes = "JavaScript provides different data types to hold different types of values. There are two types of data types in JavaScript.\n" +
            "\n" +
            "    Primitive data type\n" +
            "    Non-primitive (reference) data type\n" +
            "\n" +
            "JavaScript is a dynamic type language, means you don't need to specify type of the variable because it is dynamically used by JavaScript engine. You need to use var here to specify the data type. It can hold any type of values such as numbers, strings etc. ";
    String JSoperators = "There are following types of operators in JavaScript.\n" +
            "\n" +
            "    Arithmetic Operators\n" +
            "    Comparison (Relational) Operators\n" +
            "    Bitwise Operators\n" +
            "    Logical Operators\n" +
            "    Assignment Operators\n" +
            "    Special Operators\n";
    String IfStatement = "The JavaScript if-else statement is used to execute the code whether condition is true or false. There are three forms of if statement in JavaScript.\n" +
            "\n" +
            "    If Statement\n" +
            "    If else statement\n" +
            "    if else if statement\n";
    String Switch = "The JavaScript switch statement is used to execute one code from multiple expressions. It is just like else if statement that we have learned in previous page. But it is convenient than if..else..if because it can be used with numbers, characters etc.";
    String Loopforandwhile = "The JavaScript loops are used to iterate the piece of code using for, while, do while or for-in loops. It makes the code compact. It is mostly used in array.\n" +
            "\n" +
            "There are four types of loops in JavaScript.\n" +
            "\n" +
            "    for loop\n" +
            "    while loop\n" +
            "    do-while loop\n" +
            "    for-in loop\n" +
            "JavaScript For loop\n" +
            "\n" +
            "The JavaScript for loop iterates the elements for the fixed number of times. It should be used if number of iteration is known. " +
            "JavaScript while loop\n" +
            "\n" +
            "The JavaScript while loop iterates the elements for the infinite number of times. It should be used if number of iteration is not known. " +
            "JavaScript do while loop\n" +
            "\n" +
            "The JavaScript do while loop iterates the elements for the infinite number of times like while loop. But, code is executed at least once whether condition is true or false." +
            "JavaScript for in loop\n" +
            "\n" +
            "The JavaScript for in loop is used to iterate the properties of an object.";
    String Function ="JavaScript functions are used to perform operations. We can call JavaScript function many times to reuse the code.\n" +
            "Advantage of JavaScript function\n" +
            "\n" +
            "There are mainly two advantages of JavaScript functions.\n" +
            "\n" +
            "    Code reusability: We can call a function several times so it save coding.\n" +
            "    Less coding: It makes our program compact. We don’t need to write many lines of code each time to perform a common task.\n";
    String JavaScriptobjects  = "JavaScript Objects\n" +
            "\n" +
            "A javaScript object is an entity having state and behavior (properties and method). For example: car, pen, bike, chair, glass, keyboard, monitor etc.\n" +
            "\n" +
            "JavaScript is an object-based language. Everything is an object in JavaScript.\n" +
            "\n" +
            "JavaScript is template based not class based. Here, we don't create class to get the object. But, we direct create objects.";
    String JavaScriptArray ="JavaScript Array\n" +
            "\n" +
            "JavaScript array is an object that represents a collection of similar type of elements.\n" +
            "\n" +
            "There are 3 ways to construct array in JavaScript\n" +
            "\n" +
            "    By array literal\n" +
            "    By creating instance of Array directly (using new keyword)\n" +
            "    By using an Array constructor (using new keyword)\n";

    //HTML Topics
    String HTMLIntroduction = "What is HTML?\n" +
            "\n" +
            "    HTML stands for Hyper Text Markup Language\n" +
            "    HTML is the standard markup language for creating Web pages\n" +
            "    HTML describes the structure of a Web page\n" +
            "    HTML consists of a series of elements\n" +
            "    HTML elements tell the browser how to display the content\n" +
            "    HTML elements label pieces of content such as \"this is a heading\", \"this is a paragraph\", \"this is a link\", etc.\n";
    String HTMLEditors = "\n" +
            "    An HTML file is a text file, so to create an HTML file we can use any text editors.\n" +
            "    Text editors are the programs which allow editing in a written text, hence to create a web page we need to write our code in some text editor.\n" +
            "    There are various types of text editors available which you can directly download, but for a beginner, the best text editor is Notepad (Windows) or TextEdit (Mac).\n" +
            "    After learning the basics, you can easily use other professional text editors which are, Notepad++, Sublime Text, Vim, etc.\n" +
            "    In our tutorial, we will use Notepad and sublime text editor. Following are some easy ways to create your first web page with Notepad, and sublime text.\n" +
            "";
    String HTMLBasic = "In this article, we will see the HTML Basics by understanding all the basic stuff of HTML coding. There are various tags that we must consider and include while starting to code in HTML. These tags help in the organization and basic formatting of elements in our script or web pages. These step-by-step procedures will guide you through the process of writing HTML.\n" +
            "\n" +
            "Basic HTML Document: Below mentioned are the basic HTML tags that divide the whole document into various parts like head, body, etc.\n" +
            "\n" +
            "    Every HTML document begins with a HTML document tag. Although this is not mandatory, it is a good convention to start the document with this below-mentioned tag. Please refer to the HTML Doctypes article for more information related to Doctypes.\n" +
            "\n" +
            "<!DOCTYPE html>\n" +
            "\n" +
            "    <html> : Every HTML code must be enclosed between basic HTML tags. It begins with <html> and ends with </html> tag.\n" +
            "    <head>: The head tag comes next which contains all the header information of the web page or documents like the title of the page and other miscellaneous information. This information is enclosed within the head tag which opens with <head> and ends with </head>. The contents will of this tag will be explained in the later sections of the course.\n" +
            "    <title>: We can mention the title of a web page using the <title> tag. This is header information and hence is mentioned within the header tags. The tag begins with <title> and ends with </title>.\n" +
            "    <body>: Next step is the most important of all the tags we have learned so far. The body tag contains the actual body of the page which will be visible to all the users. This opens with <body> and ends with </body>. Every content enclosed within this tag will be shown on the web page be it writings or images or audios or videos or even links. We will see later in the section how using various tags we may insert mentioned contents into our web pages.\n" +
            "\n"  ;
    String HTMLElements = " HTML Elements\n" +
            "\n" +
            "An HTML file is made of elements. These elements are responsible for creating web pages and define content in that webpage. An element in HTML usually consist of a start tag <tag name>, close tag </tag name> and content inserted between them. Technically, an element is a collection of start tag, attributes, end tag, content between them.";
    String HTMLAttributes = "HTML Attribute\n" +
            "\n" +
            "    HTML attributes are special words which provide additional information about the elements or attributes are the modifier of the HTML element.\n" +
            "    Each element or tag can have attributes, which defines the behaviour of that element.\n" +
            "    Attributes should always be applied with start tag.\n" +
            "    The Attribute should always be applied with its name and value pair.\n" +
            "    The Attributes name and values are case sensitive, and it is recommended by W3C that it should be written in Lowercase only.\n" +
            "    You can add multiple attributes in one HTML element, but need to give space between two attributes";
    String HTMLHeadings = " A HTML heading or HTML h tag can be defined as a title or a subtitle which you want to display on the webpage. When you place the text within the heading tags <h1>.........</h1>, it is displayed on the browser in the bold format and size of the text depends on the number of heading.\n" +
            "\n" +
            "There are six different HTML headings which are defined with the <h1> to <h6> tags, from highest level h1 (main heading) to the least level h6 (least important heading).\n" +
            "\n" +
            "h1 is the largest heading tag and h6 is the smallest one. So h1 is used for most important heading and h6 is used for least important.";
    String HTMLParagraphs = "HTML paragraph or HTML p tag is used to define a paragraph in a webpage. Let's take a simple example to see how it work. It is a notable point that a browser itself add an empty line before and after a paragraph. An HTML <p> tag indicates starting of new paragraph.";
    String HTMLFormatting = "HTML Formatting is a process of formatting text for better look and feel. HTML provides us ability to format text without using CSS. There are many formatting tags in HTML. These tags are used to make text bold, italicized, or underlined. There are almost 14 options available that how text appears in HTML and XHTML.\n" +
            "\n" +
            "In HTML the formatting tags are divided into two categories:\n" +
            "\n" +
            "    Physical tag: These tags are used to provide the visual appearance to the text.\n" +
            "    Logical tag: These tags are used to add some logical or semantic value to the text.\n";
    String HTMLLinks = "    It is a connection from one web resource to another.A link has two ends,An anchor and direction. The link starts at the “source” anchor and points to the “destination” anchor, which may be any Web resource such as an image, a video clip, a sound bite, a program, an HTML document or an element within an HTML document.";
    String HTMLHead = "The HTML <head> element is used as a container for metadata (data about data). It is used between <html> tag and <body> tag.\n" +
            "\n" +
            "The head of an HTML document is a part whose content is not displayed in the browser on page loading. It just contains metadata about the HTML document which specifies data about the HTML document.\n" +
            "\n" +
            "An HTML head can contain lots of metadata information or can have very less or no information, it depends on our requirement. But head part has a crucial role an HTML document while creating a website.\n" +
            "\n" +
            "Metadata defines the document title, character set, styles, links, scripts, and other meta information.";
    String HTMLCSS = "Let's suppose we have created our web page using a simple HTML code, and we want something which can present our page in a correct format, and visibly attractive. So to do this, we can style our web page with CSS (Cascading Stylesheet) properties.\n" +
            "\n" +
            "CSS is used to apply the style in the web page which is made up of HTML elements. It describes the look of the webpage.\n" +
            "\n" +
            "CSS provides various style properties such as background color, padding, margin, border-color, and many more, to style a webpage.\n" +
            "\n" +
            "Each property in CSS has a name-value pair, and each property is separated by a semicolon (;).";
    String HTMLImages = "HTML img tag is used to display image on the web page. HTML img tag is an empty tag that contains attributes only, closing tags are not used in HTML image element.";
    String HTMLTables = "HTML table tag is used to display data in tabular form (row * column). There can be many columns in a row.\n" +
            "\n" +
            "We can create a table to display data in tabular form, using <table> element, with the help of <tr> , <td>, and <th> elements.\n" +
            "\n" +
            "In Each table, table row is defined by <tr> tag, table header is defined by <th>, and table data is defined by <td> tags.\n" +
            "\n" +
            "HTML tables are used to manage the layout of the page e.g. header section, navigation bar, body content, footer section etc. But it is recommended to use div tag over table to manage the layout of the page .";
    String HTMLLayout = "HTML Elements\n" +
            "\n" +
            "An HTML file is made of elements. These elements are responsible for creating web pages and define content in that webpage. An element in HTML usually consist of a start tag <tag name>, close tag </tag name> and content inserted between them. Technically, an element is a collection of start tag, attributes, end tag, content between them.";
    String HTMLForms = "An HTML form is a section of a document which contains controls such as text fields, password fields, checkboxes, radio buttons, submit button, menus etc.\n" +
            "\n" +
            "An HTML form facilitates the user to enter data that is to be sent to the server for processing such as name, email address, password, phone number, etc. .";
    String HTMLIframes = "In HTML <input type=\" \"> is an important element of HTML form. The \"type\" attribute of input element can be various types, which defines information field. Such as <input type=\"text\" name=\"name\"> gives a text box. " ;
    String HTMLList ="HTML Lists are used to specify lists of information. All lists may contain one or more list elements. There are three different types of HTML lists:\n" +
            "\n" +
            "    Ordered List or Numbered List (ol)\n" +
            "    Unordered List or Bulleted List (ul)\n" +
            "    Description List or Definition List (dl)\n";
    String HTMLBlock = "Block Elements\n" +
            "\n" +
            "Block elements appear on the screen as if they have a line break before and after them. For example, the <p>, <h1>, <h2>, <h3>, <h4>, <h5>, <h6>, <ul>, <ol>, <dl>, <pre>, <hr />, <blockquote>, and <address> elements are all block level elements. They all start on their own new line, and anything that follows them appears on its own new line.";
    String HTMLColors = "HTML colors are specified with predefined color names, or with RGB, HEX, HSL, RGBA, or HSLA values.";
    String HTMLColornames = "500+ HTML Color Names\n" +
            "\n" +
            "There is given a list of all HTML color names with hexadecimal code alphabetically. It is arranged from A to Z.\n" +
            "\n" +
            "It is recommended to use hex values than html color names because it occupies less space. Whenever you minify your css file, it uses hex color value replacing html color names.";
    String HTMLColorvalues = "\n" +
            "#000000\n" +
            "Black\n" +
            "#000080\n" +
            "Navy\n" +
            "#00008B\n" +
            "DarkBlue\n" +
            "#0000CD\n" +
            "MediumBlue\n" +
            "#0000FF\n" +
            "Blue\n" +
            "#006400\n" +
            "DarkGreen\n" +
            "#008000\n" +
            "Green\n" +
            "#008080\n" +
            "Teal\n" +
            "#008B8B\n" +
            "DarkCyan\n" +
            "#00BFFF\n" +
            "DeepSkyBlue\n" +
            "#00CED1\n" +
            "DarkTurquoise\n" +
            "#00FA9A\n" +
            "MediumSpringGreen\n" +
            "#00FF00\n" +
            "Lime\n" +
            "#00FF7F\n" +
            "SpringGreen\n" +
            "#00FFFF\n" +
            "Aqua\n" +
            "#00FFFF\n" +
            "Cyan\n" +
            "#191970\n" +
            "MidnightBlue\n" +
            "#1E90FF\n" +
            "DodgerBlue\n" +
            "#20B2AA\n" +
            "LightSeaGreen\n" +
            "#228B22\n" +
            "ForestGreen\n" +
            "#2E8B57\n" +
            "SeaGreen\n" +
            "#2F4F4F\n" +
            "DarkSlateGray\n" +
            "#2F4F4F\n" +
            "DarkSlateGrey\n" +
            "#32CD32\n" +
            "LimeGreen\n" +
            "#3CB371\n" +
            "MediumSeaGreen\n" +
            "#40E0D0\n" +
            "Turquoise\n" +
            "#4169E1\n" +
            "RoyalBlue\n" +
            "#4682B4\n" +
            "SteelBlue\n" +
            "#483D8B\n" +
            "DarkSlateBlue\n" +
            "#48D1CC\n" +
            "MediumTurquoise\n" +
            "#4B0082\n" +
            "Indigo\n" +
            "#556B2F\n" +
            "DarkOliveGreen\n" +
            "#5F9EA0\n" +
            "CadetBlue\n" +
            "#6495ED\n" +
            "CornflowerBlue\n" +
            "#663399\n" +
            "RebeccaPurple\n" +
            "#66CDAA\n" +
            "MediumAquaMarine\n" +
            "#696969\n" +
            "DimGray\n" +
            "#696969\n" +
            "DimGrey\n" +
            "#6A5ACD\n" +
            "SlateBlue\n" +
            "#6B8E23\n" +
            "OliveDrab\n" +
            "#708090\n" +
            "SlateGray\n" +
            "#708090\n" +
            "SlateGrey\n" +
            "#778899\n" +
            "LightSlateGray\n" +
            "#778899\n" +
            "LightSlateGrey\n" +
            "#7B68EE\n" +
            "MediumSlateBlue\n" +
            "#7CFC00\n" +
            "LawnGreen\n" +
            "#7FFF00\n" +
            "Chartreuse\n" +
            "#7FFFD4\n" +
            "Aquamarine\n" +
            "#800000\n" +
            "Maroon\n" +
            "#800080\n" +
            "Purple\n" +
            "#808000\n" +
            "Olive\n" +
            "#808080\n" +
            "Gray\n" +
            "#808080\n" +
            "Grey\n" +
            "#87CEEB\n" +
            "SkyBlue\n" +
            "#87CEFA\n" +
            "LightSkyBlue\n" +
            "#8A2BE2\n" +
            "BlueViolet\n" +
            "#8B0000\n" +
            "DarkRed\n" +
            "#8B008B\n" +
            "DarkMagenta\n" +
            "#8B4513\n" +
            "SaddleBrown\n" +
            "#8FBC8F\n" +
            "DarkSeaGreen\n" +
            "#90EE90\n" +
            "LightGreen\n" +
            "#9370DB\n" +
            "MediumPurple\n" +
            "#9400D3\n" +
            "DarkViolet\n" +
            "#98FB98\n" +
            "PaleGreen\n" +
            "#9932CC\n" +
            "DarkOrchid\n" +
            "#9ACD32\n" +
            "YellowGreen\n" +
            "#A0522D\n" +
            "Sienna\n" +
            "#A52A2A\n" +
            "Brown\n" +
            "#A9A9A9\n" +
            "DarkGray\n" +
            "#A9A9A9\n" +
            "DarkGrey\n" +
            "#ADD8E6\n" +
            "LightBlue\n" +
            "#ADFF2F\n" +
            "GreenYellow\n" +
            "#AFEEEE\n" +
            "PaleTurquoise\n" +
            "#B0C4DE\n" +
            "LightSteelBlue\n" +
            "#B0E0E6\n" +
            "PowderBlue\n" +
            "#B22222\n" +
            "FireBrick\n" +
            "#B8860B\n" +
            "DarkGoldenRod\n" +
            "#BA55D3\n" +
            "MediumOrchid\n" +
            "#BC8F8F\n" +
            "RosyBrown\n" +
            "#BDB76B\n" +
            "DarkKhaki\n" +
            "#C0C0C0\n" +
            "Silver\n" +
            "#C71585\n" +
            "MediumVioletRed\n" +
            "#CD5C5C\n" +
            "IndianRed\n" +
            "#CD853F\n" +
            "Peru\n" +
            "#D2691E\n" +
            "Chocolate\n" +
            "#D2B48C\n" +
            "Tan\n" +
            "#D3D3D3\n" +
            "LightGray\n" +
            "#D3D3D3\n" +
            "LightGrey\n" +
            "#D8BFD8\n" +
            "Thistle\n" +
            "#DA70D6\n" +
            "Orchid\n" +
            "#DAA520\n" +
            "GoldenRod\n" +
            "#DB7093\n" +
            "PaleVioletRed\n" +
            "#DC143C\n" +
            "Crimson\n" +
            "#DCDCDC\n" +
            "Gainsboro\n" +
            "#DDA0DD\n" +
            "Plum\n" +
            "#DEB887\n" +
            "BurlyWood\n" +
            "#E0FFFF\n" +
            "LightCyan\n" +
            "#E6E6FA\n" +
            "Lavender\n" +
            "#E9967A\n" +
            "DarkSalmon\n" +
            "#EE82EE\n" +
            "Violet\n" +
            "#EEE8AA\n" +
            "PaleGoldenRod\n" +
            "#F08080\n" +
            "LightCoral\n" +
            "#F0E68C\n" +
            "Khaki\n" +
            "#F0F8FF\n" +
            "AliceBlue\n" +
            "#F0FFF0\n" +
            "HoneyDew\n" +
            "#F0FFFF\n" +
            "Azure\n" +
            "#F4A460\n" +
            "SandyBrown\n" +
            "#F5DEB3\n" +
            "Wheat\n" +
            "#F5F5DC\n" +
            "Beige\n" +
            "#F5F5F5\n" +
            "WhiteSmoke\n" +
            "#F5FFFA\n" +
            "MintCream\n" +
            "#F8F8FF\n" +
            "GhostWhite\n" +
            "#FA8072\n" +
            "Salmon\n" +
            "#FAEBD7\n" +
            "AntiqueWhite\n" +
            "#FAF0E6\n" +
            "Linen\n" +
            "#FAFAD2\n" +
            "LightGoldenRodYellow\n" +
            "#FDF5E6\n" +
            "OldLace\n" +
            "#FF0000\n" +
            "Red\n" +
            "#FF00FF\n" +
            "Fuchsia\n" +
            "#FF00FF\n" +
            "Magenta\n" +
            "#FF1493\n" +
            "DeepPink\n" +
            "#FF4500\n" +
            "OrangeRed\n" +
            "#FF6347\n" +
            "Tomato\n" +
            "#FF69B4\n" +
            "HotPink\n" +
            "#FF7F50\n" +
            "Coral\n" +
            "#FF8C00\n" +
            "DarkOrange\n" +
            "#FFA07A\n" +
            "LightSalmon\n" +
            "#FFA500\n" +
            "Orange\n" +
            "#FFB6C1\n" +
            "LightPink\n" +
            "#FFC0CB\n" +
            "Pink\n" +
            "#FFD700\n" +
            "Gold\n" +
            "#FFDAB9\n" +
            "PeachPuff\n" +
            "#FFDEAD\n" +
            "NavajoWhite\n" +
            "#FFE4B5\n" +
            "Moccasin\n" +
            "#FFE4C4\n" +
            "Bisque\n" +
            "#FFE4E1\n" +
            "MistyRose\n" +
            "#FFEBCD\n" +
            "BlanchedAlmond\n" +
            "#FFEFD5\n" +
            "PapayaWhip\n" +
            "#FFF0F5\n" +
            "LavenderBlush\n" +
            "#FFF5EE\n" +
            "SeaShell\n" +
            "#FFF8DC\n" +
            "Cornsilk\n" +
            "#FFFACD\n" +
            "LemonChiffon\n" +
            "#FFFAF0\n" +
            "FloralWhite\n" +
            "#FFFAFA\n" +
            "Snow\n" +
            "#FFFF00\n" +
            "Yellow\n" +
            "#FFFFE0\n" +
            "LightYellow\n" +
            "#FFFFF0\n" +
            "Ivory";
    String HTMLJavaScript = "A Script is a small program which is used with HTML to make web pages more attractive, dynamic and interactive, such as an alert popup window on mouse click. Currently, the most popular scripting language is JavaScript used for websites.";
    String HTMLEntities = "HTML Entities\n" +
            "\n" +
            "HTML character entities are used as a replacement of reserved characters in HTML. You can also replace characters that are not present on your keyboard by entities.\n" +
            "\n" +
            "These characters are replaced because some characters are reserved in HTML. HTML entities provide a wide range of characters which can allow you to add icons, geometric shapes, mathematical operators, etc.";
    String HTMLURLEncode = "URL encoding converts characters into a format that can be transmitted over the Internet.\n" +
            "\n" +
            "URLs can only be sent over the Internet using the ASCII character-set.\n" +
            "\n" +
            "Since URLs often contain characters outside the ASCII set, the URL has to be converted into a valid ASCII format.\n" +
            "\n" +
            "URL encoding replaces unsafe ASCII characters with a \"%\" followed by two hexadecimal digits.\n" +
            "\n" +
            "URLs cannot contain spaces. URL encoding normally replaces a space with a plus (+) sign or with %20.";
    String HTMLQuickList = "The following is an HTML Quick List:\n" +
            "\n" +
            "Heading Element\n" +
            "\n" +
            "<h1></h1>\n" +
            "<h2></h2>\n" +
            "<h3></h3>\n" +
            "<h4></h5>\n" +
            "<h6></h6>\n" +
            "\n" +
            "Text Element :\n" +
            "\n" +
            "<p></p> paragraph\n" +
            "<br> line break\n" +
            "<hr> horizontal rule\n" +
            "\n" +
            "Physical Style\n" +
            "\n" +
            "<b></b> bold\n" +
            "<i></i> italic\n" +
            "\n" +
            "Unordered (bullet) List\n" +
            "\n" +
            "<ul>\n" +
            "<li>First Item</li>\n" +
            "<li>Second Item</li>\n" +
            "</ul>\n" +
            "\n" +
            "Ordered (Number) List\n" +
            "\n" +
            "<ol>\n" +
            "<li>First Item</li>\n" +
            "<li>Second Item</li>\n" +
            "</ol>\n" +
            "\n" +
            "Tables\n" +
            "\n" +
            "<table border =\"1\">\n" +
            "<tr>\n" +
            "<th>some heading</th>\n" +
            "<th>some heading</th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sometext</td>\n" +
            "<td>sometext</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "\n" +
            "Forms\n" +
            "\n" +
            "<form action=\"\" method=\"post\">\n" +
            "\n" +
            "<p>Name:</p>\n" +
            "<p><input type=\"text\" name=\"name\" value=\"Your name\"></p>\n" +
            "\n" +
            "<p>Comments: </p>\n" +
            "<p><textarea name=\"comments\" rows=\"5\" cols=\"20\">Your comments</textarea></p>\n" +
            "\n" +
            "<p>Gender:</p>\n" +
            "<p><input type=\"radio\" name=\"gender\" value=\"male\"> Male</p>\n" +
            "<p><input type=\"radio\" name=\"gender\" value=\"female\"> Female</p>\n" +
            "\n" +
            "<p><input type=\"submit\"></p>\n" +
            "\n" +
            "</form>\n" +
            "\n" +
            "Image Element\n" +
            "\n" +
            "<img src =\"\" />";
    String HTMLSummary = "This tutorial has taught you how to use HTML to create your own web site.\n" +
            "\n" +
            "HTML is the universal markup language for the Web. HTML lets you format text, add graphics, create links, input forms, frames and tables, etc., and save it all in a text file that any browser can read and display.\n" +
            "\n" +
            "The key to HTML is the tags, which indicates what content is coming up.";

    //CSS Topics
    String CSSBasic = "CSS stands for Cascading Style Sheet, is a text file with .css extension and is commonly used to define styles and layouts of Web pages written in HTML and Extensible Hypertext Markup Language (XHTML).CSS was invented by Hakon Wium Lie on 10th Oct, 1994 and maintained by a group of people within World Wide Web Consortium (W3C).CSS simplifies the task of maintaining a Web document by separating its style information, such as font size, font color, line width, and background color etc. This separation allows you to apply the same style rules to multiple Web pages. CSS also allows you to apply a style multiple times in a single Web page.";
    String CSSHOME = "Suppose, you have a Web page that contains multiple tables and you want to apply some style on the table caption, table header, and table cells. To do this, you just need to write the code once in a CSS style sheet and apply this style sheet to all the tables of your Web page. This reduces the complexity and redundancy of code in the Web page and saves your time, as you do not need to write the same code again and again.";
    String CSSIntroduction = "The CSS file contains the style code for the structure, such as headings, paragraphs, and links. The styles patterns and layouts defined in a CSS file can be modified by making the required changes in the code of the CSS file. CSS also provides a pattern that helps in applying the style rules on specific elements. This pattern is known as a selector. Some of the most-commonly used CSS selectors are universal, type, and class.Advantages of CSS\n" +
            "\n" +
            "Here are some advantages of using CSS to style HTML documents:\n" +
            "\n" +
            "    CSS saves more time\n" +
            "    CSS provides faster page loads\n" +
            "    CSS is easy to maintain\n" +
            "    CSS has superior styles to HTML\n" +
            "    CSS provides multiple device compatibility\n" +
            "    CSS provides global web standards\n" +
            "    CSS provides offline browsing\n" +
            "    CSS is platform independence\n" +
            "\n" +
            "Here is a simple CSS example. Here, we are going to apply style to a HTML document using CSS.";
    String CSSSyntax = "The syntax to write a CSS code, comprises of:\n" +
            "\n" +
            "    selector\n" +
            "    declaration\n" +
            "p {color: brown;}In above code:\n" +
            "\n" +
            "    p - is a selector. Selects the paragraph (P) tag\n" +
            "    color: brown; - is declaration. Declares brown color to text inside P tag\n" +
            "    color - is a property\n" +
            "    brown - is a value\n" +
            "\n" +
            "Note - The declaration block consists of property and value, in the form of property: value;.\n" +
            "\n" +
            "Note - We can have multiple declarations for a selector (an HTML element).";
    String CSSIdClass = "The benefit of this is that you can have the same HTML element, but present it differently depending on its class or ID.\n" +
            "\n" +
            "In the CSS, a class selector is a name preceded by a full stop (“.”) and an ID selector is a name preceded by a hash character (“#”).The HTML refers to the CSS by using the attributes id and class. The difference between an ID and a class is that an ID can be used to identify one element, whereas a class can be used to identify more than one.\n" +
            "\n" +
            "You can also apply a selector to a specific HTML element by simply stating the HTML selector first, so p.jam { /* whatever */ } will only be applied to paragraph elements that have the class “jam”.";
    String CSSHowTo = "When a browser reads a style sheet, it will format the HTML document according to the information in the style sheet.\n" +
            "Three Ways to Insert CSS\n" +
            "\n" +
            "There are three ways of inserting a style sheet:\n" +
            "\n" +
            "    External CSS\n" +
            "    Internal CSS\n" +
            "    Inline CSS\n" +
            "\n" +
            "External CSS\n" +
            "\n" +
            "With an external style sheet, you can change the look of an entire website by changing just one file!\n" +
            "\n" +
            "Each HTML page must include a reference to the external style sheet file inside the <link> element, inside the head section.";
    String CSSBackgrounds = "The CSS background properties are used to add background effects for elements.\n" +
            "\n" +
            "In these chapters, you will learn about the following CSS background properties:\n" +
            "\n" +
            "    background-color\n" +
            "    background-image\n" +
            "    background-repeat\n" +
            "    background-attachment\n" +
            "    background-position\n" +
            "    background (shorthand property)\n" +
            "\n" +
            "CSS background-color\n" +
            "\n" +
            "The background-color property specifies the background color of an element.";
    String CSSText = "This text is styled with some of the text formatting properties. The heading uses the text-align, text-transform, and color properties. The paragraph is indented, aligned, and the space between characters is specified. The underline is removed from this colored \"Try it Yourself\" link.The color property is used to set the color of the text. The color is specified by:\n" +
            "\n" +
            "    a color name - like \"red\"\n" +
            "    a HEX value - like \"#ff0000\"\n" +
            "    an RGB value - like \"rgb(255,0,0)\"\n" +
            "\n" +
            "Look at CSS Color Values for a complete list of possible color values.";
    String CSSFonts = "Font Selection is Important\n" +
            "\n" +
            "Choosing the right font has a huge impact on how the readers experience a website.\n" +
            "\n" +
            "The right font can create a strong identity for your brand.\n" +
            "\n" +
            "Using a font that is easy to read is important. The font adds value to your text. It is also important to choose the correct color and text size for the font.\n" +
            "Generic Font Families\n" +
            "\n" +
            "In CSS there are five generic font families:\n" +
            "\n" +
            "    Serif fonts have a small stroke at the edges of each letter. They create a sense of formality and elegance.\n" +
            "    Sans-serif fonts have clean lines (no small strokes attached). They create a modern and minimalistic look.\n" +
            "    Monospace fonts - here all the letters have the same fixed width. They create a mechanical look. \n" +
            "    Cursive fonts imitate human handwriting.\n" +
            "    Fantasy fonts are decorative/playful fonts.\n" +
            "\n" +
            "All the different font names belong to one of the generic font families. \n" +
            "Difference Between Serif and Sans-serif Fonts\n" +
            "Serif vs. Sans-serif\n" +
            "\n" +
            "Note: On computer screens, sans-serif fonts are considered easier to read than serif fonts.\n" +
            "Some Font Examples\n" +
            "Generic Font Family \tExamples of Font Names\n" +
            "Serif \tTimes New Roman\n" +
            "Georgia\n" +
            "Garamond\n" +
            "Sans-serif \tArial\n" +
            "Verdana\n" +
            "Helvetica\n" +
            "Monospace \tCourier New\n" +
            "Lucida Console\n" +
            "Monaco\n" +
            "Cursive \tBrush Script MT\n" +
            "Lucida Handwriting\n" +
            "Fantasy \tCopperplate\n" +
            "Papyrus";
    String CSSLinks = "With CSS, links can be styled in many different ways.\n" +
            "Text Link Text Link Link Button Link Button\n" +
            "Styling Links\n" +
            "\n" +
            "Links can be styled with any CSS property (e.g. color, font-family, background, etc.).In addition, links can be styled differently depending on what state they are in.\n" +
            "\n" +
            "The four links states are:\n" +
            "\n" +
            "    a:link - a normal, unvisited link\n" +
            "    a:visited - a link the user has visited\n" +
            "    a:hover - a link when the user mouses over it\n" +
            "    a:active - a link the moment it is clicked\n";
    String CSSLists = "\n" +
            "Unordered Lists:\n" +
            "\n" +
            "    Coffee\n" +
            "    Tea\n" +
            "    Coca Cola\n" +
            "\n" +
            "    Coffee\n" +
            "    Tea\n" +
            "    Coca Cola\n" +
            "\n" +
            "Ordered Lists:\n" +
            "\n" +
            "    Coffee\n" +
            "    Tea\n" +
            "    Coca Cola\n" +
            "\n" +
            "    Coffee\n" +
            "    Tea\n" +
            "    Coca Cola\n" +
            "\n" +
            "HTML Lists and CSS List Properties\n" +
            "\n" +
            "In HTML, there are two main types of lists:\n" +
            "\n" +
            "    unordered lists (<ul>) - the list items are marked with bullets\n" +
            "    ordered lists (<ol>) - the list items are marked with numbers or letters\n" +
            "\n" +
            "The CSS list properties allow you to:\n" +
            "\n" +
            "    Set different list item markers for ordered lists\n" +
            "    Set different list item markers for unordered lists\n" +
            "    Set an image as the list item marker\n" +
            "    Add background colors to lists and list items\n" +
            "\n" +
            "Different List Item Markers\n" +
            "\n" +
            "The list-style-type property specifies the type of list item marker.";
    String CSSTables = "The look of an HTML table can be greatly improved with CSS:\n" +
            "Company \tContact \tCountry\n" +
            "Alfreds Futterkiste \tMaria Anders \tGermany\n" +
            "Berglunds snabbköp \tChristina Berglund \tSweden\n" +
            "Centro comercial Moctezuma \tFrancisco Chang \tMexico\n" +
            "Ernst Handel \tRoland Mendel \tAustria\n" +
            "Island Trading \tHelen Bennett \tUK\n" +
            "Königlich Essen \tPhilip Cramer \tGermany\n" +
            "Laughing Bacchus Winecellars \tYoshi Tannamuri \tCanada\n" +
            "Magazzini Alimentari Riuniti \tGiovanni Rovelli \tItaly\nTable Borders\n" +
            "\n" +
            "To specify table borders in CSS, use the border property.\n" +
            "\n" +
            "The example below specifies a solid border for <table>, <th>, and <td> elements:" ;
    String CSSBoxModel = "CSS Box Sizing\n" +
            "\n" +
            "The CSS box-sizing property allows us to include the padding and border in an element's total width and height.\n" +
            "Without the CSS box-sizing Property\n" +
            "\n" +
            "By default, the width and height of an element is calculated like this:\n" +
            "\n" +
            "width + padding + border = actual width of an element\n" +
            "height + padding + border = actual height of an element\n" +
            "\n" +
            "This means: When you set the width/height of an element, the element often appears bigger than you have set (because the element's border and padding are added to the element's specified width/height).\n" +
            "\n" +
            "The following illustration shows two <div> elements with the same specified width and height:";
    String CSSBorder = "The CSS border properties allow you to specify the style, width, and color of an element's border.CSS Border Style\n" +
            "\n" +
            "The border-style property specifies what kind of border to display.\n" +
            "\n" +
            "The following values are allowed:\n" +
            "\n" +
            "    dotted - Defines a dotted border\n" +
            "    dashed - Defines a dashed border\n" +
            "    solid - Defines a solid border\n" +
            "    double - Defines a double border\n" +
            "    groove - Defines a 3D grooved border. The effect depends on the border-color value\n" +
            "    ridge - Defines a 3D ridged border. The effect depends on the border-color value\n" +
            "    inset - Defines a 3D inset border. The effect depends on the border-color value\n" +
            "    outset - Defines a 3D outset border. The effect depends on the border-color value\n" +
            "    none - Defines no border\n" +
            "    hidden - Defines a hidden border\n" +
            "\n" +
            "The border-style property can have from one to four values (for the top border, right border, bottom border, and the left border).";
    String CSSOutline = "An outline is a line drawn outside the element's border.\nCSS Outline\n" +
            "\n" +
            "An outline is a line that is drawn around elements, OUTSIDE the borders, to make the element \"stand out\".CSS has the following outline properties:\n" +
            "\n" +
            "    outline-style\n" +
            "    outline-color\n" +
            "    outline-width\n" +
            "    outline-offset\n" +
            "    outline\nCSS Outline Style\n" +
            "\n" +
            "The outline-style property specifies the style of the outline, and can have one of the following values:\n" +
            "\n" +
            "    dotted - Defines a dotted outline\n" +
            "    dashed - Defines a dashed outline\n" +
            "    solid - Defines a solid outline\n" +
            "    double - Defines a double outline\n" +
            "    groove - Defines a 3D grooved outline\n" +
            "    ridge - Defines a 3D ridged outline\n" +
            "    inset - Defines a 3D inset outline\n" +
            "    outset - Defines a 3D outset outline\n" +
            "    none - Defines no outline\n" +
            "    hidden - Defines a hidden outline\n";
    String CSSMargin = "Margins are used to create space around elements, outside of any defined borders.\nCSS Margins\n" +
            "\n" +
            "The CSS margin properties are used to create space around elements, outside of any defined borders.\n" +
            "\n" +
            "With CSS, you have full control over the margins. There are properties for setting the margin for each side of an element (top, right, bottom, and left).\n" +
            "Margin - Individual Sides\n" +
            "\n" +
            "CSS has properties for specifying the margin for each side of an element:\n" +
            "\n" +
            "    margin-top\n" +
            "    margin-right\n" +
            "    margin-bottom\n" +
            "    margin-left\n" +
            "\n" +
            "All the margin properties can have the following values:\n" +
            "\n" +
            "    auto - the browser calculates the margin\n" +
            "    length - specifies a margin in px, pt, cm, etc.\n" +
            "    % - specifies a margin in % of the width of the containing element\n" +
            "    inherit - specifies that the margin should be inherited from the parent element\n" +
            "\n" +
            "Tip: Negative values are allowed.";
    String CSSPadding = "Padding is used to create space around an element's content, inside of any defined borders.CSS Padding\n" +
            "\n" +
            "The CSS padding properties are used to generate space around an element's content, inside of any defined borders.\n" +
            "\n" +
            "With CSS, you have full control over the padding. There are properties for setting the padding for each side of an element (top, right, bottom, and left).\n" +
            "Padding - Individual Sides\n" +
            "\n" +
            "CSS has properties for specifying the padding for each side of an element:\n" +
            "\n" +
            "    padding-top\n" +
            "    padding-right\n" +
            "    padding-bottom\n" +
            "    padding-left\n" +
            "\n" +
            "All the padding properties can have the following values:\n" +
            "\n" +
            "    length - specifies a padding in px, pt, cm, etc.\n" +
            "    % - specifies a padding in % of the width of the containing element\n" +
            "    inherit - specifies that the padding should be inherited from the parent element\n" +
            "\n" +
            "Note: Negative values are not allowed.";
    String CSSGroupingNesting = "The Nesting & Grouping concept is very important for a web developer to write precise codes. You can group and nest items to reduce the amount of code that you write, which will reduce the length of your code and allow pages to load faster. It is a way to simplify your code. With the help of Nesting and Grouping, we can be more specific in our code. In this article, we will see how nesting & grouping helps to optimize the code & make it efficient & increases readability.\n" +
            "\n" +
            "Nesting: The nesting property in CSS facilitates nesting one style rule inside another, with the selector of the child rule that is relative to the selector of the parent rule. It helps to increase the modularity and maintainability of CSS stylesheets & hence increase the overall readability of the code. For instance, if you write a structured CSS module, instead of specifying the separate selectors for every HTML element ie, by using many classes or ID selectors, you can simply specify properties to selectors within other selectors. While nesting the CSS properties, HTML elements form a tree-structured shape. Nesting is a shortcut to create CSS rules for multiple selectors for a specific property. So, instead of rewriting the same set of properties for the different selectors, we can simply nest selectors inside other selectors. For this reason, we are not only reducing the size of the code but also reducing the overall loading time.";
    String CSSDimension = "You have seen the border that surrounds every box ie. element, the padding that can appear inside each box and the margin that can go around them. In this tutorial we will learn how we can change the dimensions of boxes.\n" +
            "\n" +
            "We have the following properties that allow you to control the dimensions of a box.\n" +
            "\n" +
            "    The height property is used to set the height of a box.\n" +
            "\n" +
            "    The width property is used to set the width of a box.\n" +
            "\n" +
            "    The line-height property is used to set the height of a line of text.\n" +
            "\n" +
            "    The max-height property is used to set a maximum height that a box can be.\n" +
            "\n" +
            "    The min-height property is used to set the minimum height that a box can be.\n" +
            "\n" +
            "    The max-width property is used to set the maximum width that a box can be.\n" +
            "\n" +
            "    The min-width property is used to set the minimum width that a box can be.\n" +
            "\n" +
            "The Height and Width Properties\n" +
            "\n" +
            "The height and width properties allow you to set the height and width for boxes. They can take values of a length, a percentage, or the keyword auto.The line-height Property\n" +
            "\n" +
            "The line-height property allows you to increase the space between lines of text. The value of the line-height property can be a number, a length, or a percentage.";
    String CSSDisplay = "The display property is the most important CSS property for controlling layout.\n" +
            "The display Property\n" +
            "\n" +
            "The display property specifies if/how an element is displayed.\n" +
            "\n" +
            "Every HTML element has a default display value depending on what type of element it is. The default display value for most elements is block or inline.Block-level Elements\n" +
            "\n" +
            "A block-level element always starts on a new line and takes up the full width available (stretches out to the left and right as far as it can).\n" +
            "The <div> element is a block-level element.\n" +
            "\n" +
            "Examples of block-level elements:\n" +
            "\n" +
            "    <div>\n" +
            "    <h1> - <h6>\n" +
            "    <p>\n" +
            "    <form>\n" +
            "    <header>\n" +
            "    <footer>\n" +
            "    <section>\n" +
            "\n" +
            "Inline Elements\n" +
            "\n" +
            "An inline element does not start on a new line and only takes up as much width as necessary.\n" +
            "\n" +
            "This is an inline <span> element inside a paragraph.\n" +
            "\n" +
            "Examples of inline elements:\n" +
            "\n" +
            "    <span>\n" +
            "    <a>\n" +
            "    <img>\n" +
            "\n" +
            "Display: none;\n" +
            "\n" +
            "display: none; is commonly used with JavaScript to hide and show elements without deleting and recreating them. Take a look at our last example on this page if you want to know how this can be achieved.\n" +
            "\n" +
            "The <script> element uses display: none; as default. ";
    String CSSPositioning = "The position property specifies the type of positioning method used for an element (static, relative, fixed, absolute or sticky).\n" +
            "The position Property\n" +
            "\n" +
            "The position property specifies the type of positioning method used for an element.\n" +
            "\n" +
            "There are five different position values:\n" +
            "\n" +
            "    static\n" +
            "    relative\n" +
            "    fixed\n" +
            "    absolute\n" +
            "    sticky\n" +
            "\n" +
            "Elements are then positioned using the top, bottom, left, and right properties. However, these properties will not work unless the position property is set first. They also work differently depending on the position value.\n" +
            "position: static;\n" +
            "\n" +
            "HTML elements are positioned static by default.\n" +
            "\n" +
            "Static positioned elements are not affected by the top, bottom, left, and right properties.\n" +
            "\n" +
            "An element with position: static; is not positioned in any special way; it is always positioned according to the normal flow of the page:\n" +
            "This <div> element has position: static;position: relative;\n" +
            "\n" +
            "An element with position: relative; is positioned relative to its normal position.\n" +
            "\n" +
            "Setting the top, right, bottom, and left properties of a relatively-positioned element will cause it to be adjusted away from its normal position. Other content will not be adjusted to fit into any gap left by the element.\n" +
            "This <div> element has position: relative;\n" +
            "\n" +
            "Here is the CSS that is used:";
    String CSSFloating = "The CSS float property specifies how an element should float.\n" +
            "\n" +
            "The CSS clear property specifies what elements can float beside the cleared element and on which side.The float Property\n" +
            "\n" +
            "The float property is used for positioning and formatting content e.g. let an image float left to the text in a container.\n" +
            "\n" +
            "The float property can have one of the following values:\n" +
            "\n" +
            "    left - The element floats to the left of its container\n" +
            "    right - The element floats to the right of its container\n" +
            "    none - The element does not float (will be displayed just where it occurs in the text). This is default\n" +
            "    inherit - The element inherits the float value of its parent\n" +
            "\n" +
            "In its simplest use, the float property can be used to wrap text around images. ";
    String CSSAlign = "Center Align Elements\n" +
            "\n" +
            "To horizontally center a block element (like <div>), use margin: auto;\n" +
            "\n" +
            "Setting the width of the element will prevent it from stretching out to the edges of its container.\n" +
            "\n" +
            "The element will then take up the specified width, and the remaining space will be split equally between the two margins:Note: Center aligning has no effect if the width property is not set (or set to 100%).Tip: For more examples on how to align text, see the CSS Text chapter." +
            "Center an Image\n" +
            "\n" +
            "To center an image, set left and right margin to auto and make it into a block element:" +
            "Left and Right Align - Using position\n" +
            "\n" +
            "One method for aligning elements is to use position: absolute;:Note: Absolute positioned elements are removed from the normal flow, and can overlap elements.";
    String CSSPseudoclass = "What are Pseudo-classes?\n" +
            "\n" +
            "A pseudo-class is used to define a special state of an element.\n" +
            "\n" +
            "For example, it can be used to:\n" +
            "\n" +
            "    Style an element when a user mouses over it\n" +
            "    Style visited and unvisited links differently\n" +
            "    Style an element when it gets focus\nSyntax\n" +
            "\n" +
            "The syntax of pseudo-classes:\n" +
            "selector:pseudo-class {\n" +
            "  property: value;\n" +
            "}\n";
    String CSSPseudoelement = "What are Pseudo-Elements?\n" +
            "\n" +
            "A CSS pseudo-element is used to style specified parts of an element.\n" +
            "\n" +
            "For example, it can be used to:\n" +
            "\n" +
            "    Style the first letter, or line, of an element\n" +
            "    Insert content before, or after, the content of an element\n" +
            "\n" +
            "Syntax\n" +
            "\n" +
            "The syntax of pseudo-elements:selector::pseudo-element {\n" +
            "  property: value;\n" +
            "}The ::first-line Pseudo-element\n" +
            "\n" +
            "The ::first-line pseudo-element is used to add a special style to the first line of a text.\n" +
            "\n" +
            "The following example formats the first line of the text in all <p> elements:Note: The ::first-line pseudo-element can only be applied to block-level elements.\n" +
            "\n" +
            "The following properties apply to the ::first-line pseudo-element:\n" +
            "\n" +
            "    font properties\n" +
            "    color properties\n" +
            "    background properties\n" +
            "    word-spacing\n" +
            "    letter-spacing\n" +
            "    text-decoration\n" +
            "    vertical-align\n" +
            "    text-transform\n" +
            "    line-height\n" +
            "    clear\nThe ::first-letter Pseudo-element\n" +
            "\n" +
            "The ::first-letter pseudo-element is used to add a special style to the first letter of a text.\n" +
            "\n" +
            "The following example formats the first letter of the text in all <p> elements: Note: The ::first-letter pseudo-element can only be applied to block-level elements.\n" +
            "\n" +
            "The following properties apply to the ::first-letter pseudo- element: \n" +
            "\n" +
            "    font properties\n" +
            "    color properties \n" +
            "    background properties\n" +
            "    margin properties\n" +
            "    padding properties\n" +
            "    border properties\n" +
            "    text-decoration\n" +
            "    vertical-align (only if \"float\" is \"none\")\n" +
            "    text-transform\n" +
            "    line-height\n" +
            "    float\n" +
            "    clear\n" +
            "\n";
    String CSSNavigationBar = "Navigation Bars\n" +
            "\n" +
            "Having easy-to-use navigation is important for any web site.\n" +
            "\n" +
            "With CSS you can transform boring HTML menus into good-looking navigation bars.\nNavigation Bar = List of Links\n" +
            "\n" +
            "A navigation bar needs standard HTML as a base.\n" +
            "\n" +
            "In our examples we will build the navigation bar from a standard HTML list.\n" +
            "\n" +
            "A navigation bar is basically a list of links, so using the <ul> and <li> elements makes perfect sense:";
    String CSSImageGallery = "Image Gallery\n" +
            "\n" +
            "The following image gallery is created with CSS:\n" +
            "Example\n" +
            "<html>\n" +
            "<head>\n" +
            "<style>\n" +
            "div.gallery {\n" +
            "  margin: 5px;\n" +
            "  border: 1px solid #ccc;\n" +
            "  float: left;\n" +
            "  width: 180px;\n" +
            "}\n" +
            "\n" +
            "div.gallery:hover {\n" +
            "  border: 1px solid #777;\n" +
            "}\n" +
            "\n" +
            "div.gallery img {\n" +
            "  width: 100%;\n" +
            "  height: auto;\n" +
            "}\n" +
            "\n" +
            "div.desc {\n" +
            "  padding: 15px;\n" +
            "  text-align: center;\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<div class=\"gallery\">\n" +
            "  <a target=\"_blank\" href=\"img_5terre.jpg\">\n" +
            "    <img src=\"img_5terre.jpg\" alt=\"Cinque Terre\" width=\"600\" height=\"400\">\n" +
            "  </a>\n" +
            "  <div class=\"desc\">Add a description of the image here</div>\n" +
            "</div>\n" +
            "\n" +
            "<div class=\"gallery\">\n" +
            "  <a target=\"_blank\" href=\"img_forest.jpg\">\n" +
            "    <img src=\"img_forest.jpg\" alt=\"Forest\" width=\"600\" height=\"400\">\n" +
            "  </a>\n" +
            "  <div class=\"desc\">Add a description of the image here</div>\n" +
            "</div>\n" +
            "\n" +
            "<div class=\"gallery\">\n" +
            "  <a target=\"_blank\" href=\"img_lights.jpg\">\n" +
            "    <img src=\"img_lights.jpg\" alt=\"Northern Lights\" width=\"600\" height=\"400\">\n" +
            "  </a>\n" +
            "  <div class=\"desc\">Add a description of the image here</div>\n" +
            "</div>\n" +
            "\n" +
            "<div class=\"gallery\">\n" +
            "  <a target=\"_blank\" href=\"img_mountains.jpg\">\n" +
            "    <img src=\"img_mountains.jpg\" alt=\"Mountains\" width=\"600\" height=\"400\">\n" +
            "  </a>\n" +
            "  <div class=\"desc\">Add a description of the image here</div>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html> ";
    String CSSImageOpacity = "The opacity property specifies the opacity/transparency of an element.\n" +
            "Transparent Image\n" +
            "\n" +
            "The opacity property can take a value from 0.0 - 1.0. The lower value, the more transparent:" +
            "Transparent Hover Effect\n" +
            "\n" +
            "The opacity property is often used together with the :hover selector to change the opacity on mouse-over:Example explained\n" +
            "\n" +
            "The first CSS block is similar to the code in Example 1. In addition, we have added what should happen when a user hovers over one of the images. In this case we want the image to NOT be transparent when the user hovers over it. The CSS for this is opacity:1;.\n" +
            "\n" +
            "When the mouse pointer moves away from the image, the image will be transparent again.";
    String CSSImageSprites = "Image Sprites\n" +
            "\n" +
            "An image sprite is a collection of images put into a single image.\n" +
            "\n" +
            "A web page with many images can take a long time to load and generates multiple server requests.\n" +
            "\n" +
            "Using image sprites will reduce the number of server requests and save bandwidth.\n" +
            "Image Sprites - Simple Example\n" +
            "\n"
            ;
    String CSSMediaTypes = "CSS2 Introduced Media Types\n" +
            "\n" +
            "The @media rule, introduced in CSS2, made it possible to define different style rules for different media types.\n" +
            "\n" +
            "Examples: You could have one set of style rules for computer screens, one for printers, one for handheld devices, one for television-type devices, and so on.\n" +
            "\n" +
            "Unfortunately these media types never got a lot of support by devices, other than the print media type.\n" +
            "CSS3 Introduced Media Queries\n" +
            "\n" +
            "Media queries in CSS3 extended the CSS2 media types idea: Instead of looking for a type of device, they look at the capability of the device.\n" +
            "\n" +
            "Media queries can be used to check many things, such as:\n" +
            "\n" +
            "    width and height of the viewport\n" +
            "    width and height of the device\n" +
            "    orientation (is the tablet/phone in landscape or portrait mode?)\n" +
            "    resolution\n" +
            "\n" +
            "Using media queries are a popular technique for delivering a tailored style sheet to desktops, laptops, tablets, and mobile phones (such as iPhone and Android phones).\n" +
            "Browser Support\n" +
            "\n" +
            "The numbers in the table specifies the first browser version that fully supports the @media rule." +
            "CSS3 Media Types\n" +
            "Value \tDescription\n" +
            "all \tUsed for all media type devices\n" +
            "print \tUsed for printers\n" +
            "screen \tUsed for computer screens, tablets, smart-phones etc.\n" +
            "speech \tUsed for screenreaders that \"reads\" the page out loud";
    String CSSAttrSelectors = "Style HTML Elements With Specific Attributes\n" +
            "\n" +
            "It is possible to style HTML elements that have specific attributes or attribute values.\n" +
            "CSS [attribute] Selector\n" +
            "\n" +
            "The [attribute] selector is used to select elements with a specified attribute." +
            "CSS [attribute=\"value\"] Selector\n" +
            "\n" +
            "The [attribute=\"value\"] selector is used to select elements with a specified attribute and value." +
            "CSS [attribute~=\"value\"] Selector\n" +
            "\n" +
            "The [attribute~=\"value\"] selector is used to select elements with an attribute value containing a specified word." +
            "CSS [attribute|=\"value\"] Selector\n" +
            "\n" +
            "The [attribute|=\"value\"] selector is used to select elements with the specified attribute, whose value can be exactly the specified value, or the specified value followed by a hyphen (-).\n" +
            "\n" +
            "Note: The value has to be a whole word, either alone, like class=\"top\", or followed by a hyphen( - ), like class=\"top-text\". " +
            "CSS [attribute^=\"value\"] Selector\n" +
            "\n" +
            "The [attribute^=\"value\"] selector is used to select elements with the specified attribute, whose value starts with the specified value.\n" +
            "\n" +
            "The following example selects all elements with a class attribute value that starts with \"top\":\n" +
            "\n" +
            "Note: The value does not have to be a whole word!" +
            "CSS [attribute$=\"value\"] Selector\n" +
            "\n" +
            "The [attribute$=\"value\"] selector is used to select elements whose attribute value ends with a specified value.\n" +
            "\n" +
            "The following example selects all elements with a class attribute value that ends with \"test\":\n" +
            "\n" +
            "Note: The value does not have to be a whole word!  " +
            "CSS [attribute*=\"value\"] Selector\n" +
            "\n" +
            "The [attribute*=\"value\"] selector is used to select elements whose attribute value contains a specified value.\n" +
            "\n" +
            "The following example selects all elements with a class attribute value that contains \"te\":\n" +
            "\n" +
            "Note: The value does not have to be a whole word!  ";
    String CSS3Introduction = "CSS3 Modules\n" +
            "\n" +
            "CSS3 has been split into \"modules\". It contains the \"old CSS specification\" (which has been split into smaller pieces). In addition, new modules are added.\n" +
            "\n" +
            "Some of the most important CSS3 modules are:\n" +
            "\n" +
            "    Selectors\n" +
            "    Box Model\n" +
            "    Backgrounds and Borders\n" +
            "    Image Values and Replaced Content\n" +
            "    Text Effects\n" +
            "    2D/3D Transformations\n" +
            "    Animations\n" +
            "    Multiple Column Layout\n" +
            "    User Interface\n" +
            "\n" +
            "Most of the new CSS3 properties are implemented in modern browsers.";
    String CSS3Borders = "What is css3 borders?\n" +
            "The border shorthand CSS property sets an element's border. It sets the values of border-width , border-style , and border-color .";
    String CSS3Backgrounds = "\n" +
            "CSS3 Backgrounds\n" +
            "\n" +
            "CSS3 contains a few new background properties, which allow greater control of the background element.\n" +
            "\n" +
            "In this chapter you will learn how to add multiple background images to one element.\n" +
            "\n" +
            "You will also learn about the following new CSS3 properties:\n" +
            "\n" +
            "    background-size\n" +
            "    background-origin\n" +
            "    background-clip\n" +
            "\n" +
            "CSS3 Multiple Backgrounds\n" +
            "\n" +
            "CSS3 allows you to add multiple background images for an element, through the background-image property.\n" +
            "\n" +
            "The different background images are separated by commas, and the images are stacked on top of each other, where the first image is closest to the viewer.\n" +
            "\n" +
            "The following example has two background images, the first image is a flower (aligned to the bottom and right) and the second image is a paper background (aligned to the top-left corner):Multiple background images can be specified using either the individual background properties (as above) or the background shorthand property." +
            "CSS3 Background Size\n" +
            "\n" +
            "The CSS3 background-size property allows you to specify the size of background images.\n" +
            "\n" +
            "Before CSS3, the size of a background image was the actual size of the image. CSS3 allows us to re-use background images in different contexts.\n" +
            "\n" +
            "The size can be specified in lengths, percentages, or by using one of the two keywords: contain or cover.\n" +
            "\n" +
            "The following example resizes a background image to much smaller than the original image (using pixels):";

    //React topics
    String ReactJSTutorial = "ReactJS tutorial provides basic and advanced concepts of ReactJS. Currently, ReactJS is one of the most popular JavaScript front-end libraries which has a strong foundation and a large community.\n" +
            "\n" +
            "ReactJS is a declarative, efficient, and flexible JavaScript library for building reusable UI components. It is an open-source, component-based front end library which is responsible only for the view layer of the application. It was initially developed and maintained by Facebook and later used in its products like WhatsApp & Instagram.\n" +
            "\n" +
            "Our ReactJS tutorial includes all the topics which help to learn ReactJS. These are ReactJS Introduction, ReactJS Features, ReactJS Installation, Pros and Cons of ReactJS, ReactJS JSX, ReactJS Components, ReactJS State, ReactJS Props, ReactJS Forms, ReactJS Events, ReactJS Animation and many more." +
            "Why we use ReactJS?\n" +
            "\n" +
            "The main objective of ReactJS is to develop User Interfaces (UI) that improves the speed of the apps. It uses virtual DOM (JavaScript object), which improves the performance of the app. The JavaScript virtual DOM is faster than the regular DOM. We can use ReactJS on the client and server-side as well as with other frameworks. It uses component and data patterns that improve readability and helps to maintain larger apps.";
    String ReactVersion = "React Version\n" +
            "\n" +
            "A complete release history for React is given below. You can also see the full documentation for recent releases on GitHub.\n" +
            "SN \tVersion \tRelease Date \tSignificant Changes\n" +
            "1. \t0.3.0 \t29/05/2013 \tInitial Public Release\n" +
            "2. \t0.4.0 \t20/07/2013 \tSupport for comment nodes <div>{/* */}</div>, Improved server-side rendering APIs, Removed React.autoBind, Support for the key prop, Improvements to forms, Fixed bugs.\n" +
            "3. \t0.5.0 \t20/10/2013 \tImprove Memory usage, Support for Selection and Composition events, Support for getInitialState and getDefaultProps in mixins, Added React.version and React.isValidClass, Improved compatibility for Windows.\n" +
            "4. \t0.8.0 \t20/12/2013 \tAdded support for rows & cols, defer & async, loop for <audio> & <video>, autoCorrect attributes. Added onContextMenu events, Upgraded jstransform and esprima-fb tools, Upgraded browserify.\n" +
            "5. \t0.9.0 \t20/02/2014 \tAdded support for crossOrigin, download and hrefLang, mediaGroup and muted, sandbox, seamless, and srcDoc, scope attributes, Added any, arrayOf, component, oneOfType, renderable, shape to React.PropTypes, Added support for onMouseOver and onMouseOut event, Added support for onLoad and onError on <img> elements.\n" +
            "6. \t0.10.0 \t21-03-2014 \tAdded support for srcSet and textAnchor attributes, add update function for immutable data, Ensure all void elements don't insert a closing tag.\n" +
            "7. \t0.11.0 \t17/07/2014 \tImproved SVG support, Normalized e.view event, Update $apply command, Added support for namespaces, Added new transformWithDetails API, includes pre-built packages under dist/, MyComponent() now returns a descriptor, not an instance.\n" +
            "8. \t0.12.0 \t21/11/2014 \tAdded new features Spread operator ({...}) introduced to deprecate this.transferPropsTo, Added support for acceptCharset, classID, manifest HTML attributes, React.addons.batchedUpdates added to API, @jsx React.DOM no longer required, Fixed issues with CSS Transitions.\n" +
            "9. \t0.13.0 \t10/03/2015 \tDeprecated patterns that warned in 0.12 no longer work, ref resolution order has changed, Removed properties this._pendingState and this._rootNodeID, Support ES6 classes, Added API React.findDOMNode(component), Support for iterators and immutable-js sequences, Added new features React.addons.createFragment, deprecated React.addons.classSet.\n" +
            "10. \t0.14.1 \t29/10/2015 \tAdded support for srcLang, default, kind attributes, and color attribute, Ensured legacy .props access on DOM nodes, Fixed scryRenderedDOMComponentsWithClass, Added react-dom.js.\n" +
            "11. \t15.0.0 \t07/04/2016 \tInitial render now uses document.createElement instead of generating HTML, No more extra <span>s, Improved SVG support, ReactPerf.getLastMeasurements() is opaque, New deprecations introduced with a warning, Fixed multiple small memory leaks, React DOM now supports the cite and profile HTML attributes and cssFloat, gridRow and gridColumn CSS properties.\n" +
            "12. \t15.1.0 \t20/05/2016 \tFix a batching bug, Ensure use of the latest object-assign, Fix regression, Remove use of merge utility, Renamed some modules.\n" +
            "13. \t15.2.0 \t01/07/2016 \tInclude component stack information, Stop validating props at mount time, Add React.PropTypes.symbol, Add onLoad handling to <link> and onError handling to <source> element, Add isRunning() API, Fix performance regression.\n" +
            "14. \t15.3.0 \t30/07/2016 \tAdd React.PureComponent, Fix issue with nested server rendering, Add xmlns, xmlnsXlink to support SVG attributes and referrerPolicy to HTML attributes, updates React Perf Add-on, Fixed issue with ref.\n" +
            "15. \t15.3.1 \t19/08/2016 \tImprove performance of development builds, Cleanup internal hooks, Upgrade fbjs, Improve startup time of React, Fix memory leak in server rendering, fix React Test Renderer, Change trackedTouchCount invariant into a console.error.\n" +
            "16. \t15.4.0 \t16/11/2016 \tReact package and browser build no longer includes React DOM, Improved development performance, Fixed occasional test failures, update batchedUpdates API, React Perf, and ReactTestRenderer.create().\n" +
            "17. \t15.4.1 \t23/11/2016 \tRestructure variable assignment, Fixed event handling, Fixed compatibility of browser build with AMD environments.\n" +
            "18. \t15.4.2 \t06/01/2017 \tFixed build issues, Added missing package dependencies, Improved error messages.\n" +
            "19. \t15.5.0 \t07/04/2017 \tAdded react-dom/test-utils, Removed peerDependencies, Fixed issue with Closure Compiler, Added a deprecation warning for React.createClass and React.PropTypes, Fixed Chrome bug.\n" +
            "20. \t15.5.4 \t11/04/2017 \tFix compatibility with Enzyme by exposing batchedUpdates on shallow renderer, Update version of prop-types, Fix react-addons-create-fragment package to include loose-envify transform.\n" +
            "21. \t15.6.0 \t13/06/2017 \tAdd support for CSS variables in style attribute and Grid style properties, Fix AMD support for addons depending on react, Remove unnecessary dependency, Add a deprecation warning for React.createClass and React.DOM factory helpers.\n" +
            "22. \t16.0.0 \t26/09/2017 \tImprovd error handling with introduction of \"error boundaries\", React DOM allows passing non-standard attributes, Minor changes to setState behavior, remove react-with-addons.js build, Add React.createClass as create-react-class, React.PropTypes as prop-types, React.DOM as react-dom-factories, changes to the behavior of scheduling and lifecycle methods.\n" +
            "23. \t16.1.0 \t9/11/2017 \tDiscontinuing Bower Releases, Fix an accidental extra global variable in the UMD builds, Fix onMouseEnter and onMouseLeave firing, Fix <textarea> placeholder, Remove unused code, Add a missing package.json dependency, Add support for React DevTools.\n" +
            "24. \t16.3.0 \t29/03/2018 \tAdd a new officially supported context API, Add new packagePrevent an infinite loop when attempting to render portals with SSR, Fix an issue with this.state, Fix an IE/Edge issue.\n" +
            "25. \t16.3.1 \t03/04/2018 \tPrefix private API, Fix performance regression and error handling bugs in development mode, Add peer dependency, Fix a false positive warning in IE11 when using Fragment.\n" +
            "26. \t16.3.2 \t16/04/2018 \tFix an IE crash, Fix labels in User Timing measurements, Add a UMD build, Improve performance of unstable_observedBits API with nesting.\n" +
            "27. \t16.4.0 \t24/05/2018 \tAdd support for Pointer Events specification, Add the ability to specify propTypes, Fix reading context, Fix the getDerivedStateFromProps() support, Fix a testInstance.parent crash, Add React.unstable_Profiler component for measuring performance, Change internal event names.\n" +
            "28. \t16.5.0 \t05/09/2018 \tAdd support for React DevTools Profiler, Handle errors in more edge cases gracefully, Add react-dom/profiling, Add onAuxClick event for browsers, Add movementX and movementY fields to mouse events, Add tangentialPressure and twist fields to pointer event.\n" +
            "29. \t16.6.0 \t23/10/2018 \tAdd support for contextType, Support priority levels, continuations, and wrapped callbacks, Improve the fallback mechanism, Fix gray overlay on iOS Safari, Add React.lazy() for code splitting components.\n" +
            "30. \t16.7.0 \t20/12/2018 \tFix performance of React.lazy for lazily-loaded components, Clear fields on unmount to avoid memory leaks, Fix bug with SSR, Fix a performance regression.\n" +
            "31. \t16.8.0 \t06/02/2019 \tAdd Hooks, Add ReactTestRenderer.act() and ReactTestUtils.act() for batching updates, Support synchronous thenables passed to React.lazy(), Improve useReducer Hook lazy initialization API.\n" +
            "32. \t16.8.6 \t27/03/2019 \tFix an incorrect bailout in useReducer(), Fix iframe warnings in Safari DevTools, Warn if contextType is set to Context.Consumer instead of Context, Warn if contextType is set to invalid values.";
    String ReactInstallation = "React Environment Setup\n" +
            "\n" +
            "In this section, we will learn how to set up an environment for the successful development of ReactJS application.\n" +
            "Pre-requisite for ReactJS\n" +
            "\n" +
            "    NodeJS and NPM\n" +
            "    React and React DOM\n" +
            "    Webpack\n" +
            "    Babel\n" +
            "\n" +
            "Ways to install ReactJS\n" +
            "\n" +
            "There are two ways to set up an environment for successful ReactJS application. They are given below.\n" +
            "\n" +
            "    Using the npm command\n" +
            "    Using the create-react-app command\n" +
            "\n" +
            "1. Using the npm command\n" +
            "\n" +
            "Install NodeJS and NPM\n" +
            "\n" +
            "NodeJS and NPM are the platforms need to develop any ReactJS application." +
            "Install React and React DOM\n" +
            "\n" +
            "Create a root folder with the name reactApp on the desktop or where you want. Here, we create it on the desktop." +
            "Now, you need to create a package.json file. To create any module, it is required to generate a package.json file in the project folder." +
            "After creating a package.json file, you need to install react and its DOM packages using the following npm command in the terminal window as shown in the below image.\n" +
            "\n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install react react-dom --save  " +
            "Install Webpack\n" +
            "\n" +
            "Webpack is used for module packaging, development, and production pipeline automation. We will use webpack-dev-server during development, webpack to create production builds, and webpack CLI provides a set of commands. Webpack compiles these into a single file(bundle). " +
            "You can also use the above command separately which can be shown as below.\n" +
            "\n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install webpack --save  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install webpack-dev-server --save  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install webpack-cli --save  \n" +
            "\n" +
            "Install Babel\n" +
            "\n" +
            "Babel is a JavaScript compiler and transpiler used to convert one source code to others. It compiles React JSX and ES6 to ES5 JavaScript which can be run on all browsers. We need babel-loader for JSX file types, babel-preset-react makes your browser update automatically when any changes occur to your code without losing the current state of the app. ES6 support requires babel-preset-env Babel preset. " +
            "You can also use the above command separately which can be shown as below.\n" +
            "\n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install babel-core --save-dev  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install babel-loader --save-dev  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install babel-preset-env --save-dev  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install babel-preset-react --save-dev  \n" +
            "    javatpoint@root:~/Desktop/reactApp>npm install babel-webpack-plugin --save-dev  ";
    String Reactcreatereactapp = "React create-react-app\n" +
            "\n" +
            "Starting a new React project is very complicated, with so many build tools. It uses many dependencies, configuration files, and other requirements such as Babel, Webpack, ESLint before writing a single line of React code. Create React App CLI tool removes all that complexities and makes React app simple. For this, you need to install the package using NPM, and then run a few simple commands to get a new React project.\n" +
            "\n" +
            "The create-react-app is an excellent tool for beginners, which allows you to create and run React project very quickly. It does not take any configuration manually. This tool is wrapping all of the required dependencies like Webpack, Babel for React project itself and then you need to focus on writing React code only. This tool sets up the development environment, provides an excellent developer experience, and optimizes the app for production.\n" +
            "Requirements\n" +
            "\n" +
            "The Create React App is maintained by Facebook and can works on any platform, for example, macOS, Windows, Linux, etc. To create a React Project using create-react-app, you need to have installed the following things in your system.\n" +
            "\n" +
            "    Node version >= 8.10\n" +
            "    NPM version >= 5.6\n" +
            "\n" +
            "Let us check the current version of Node and NPM in the system.";
    String ReactFeatures ="React Features\n" +
            "React Features\n" +
            "\n" +
            "Currently, ReactJS gaining quick popularity as the best JavaScript framework among web developers. It is playing an essential role in the front-end ecosystem. The important features of ReactJS are as following.\n" +
            "\n" +
            "    JSX\n" +
            "    Components\n" +
            "    One-way Data Binding\n" +
            "    Virtual DOM\n" +
            "    Simplicity\n" +
            "    Performance\n" +
            "\n" +
            "JSX\n" +
            "\n" +
            "JSX stands for JavaScript XML. It is a JavaScript syntax extension. Its an XML or HTML like syntax used by ReactJS. This syntax is processed into JavaScript calls of React Framework. It extends the ES6 so that HTML like text can co-exist with JavaScript react code. It is not necessary to use JSX, but it is recommended to use in ReactJS.\n" +
            "Components\n" +
            "\n" +
            "ReactJS is all about components. ReactJS application is made up of multiple components, and each component has its own logic and controls. These components can be reusable which help you to maintain the code when working on larger scale projects.\n" +
            "One-way Data Binding\n" +
            "\n" +
            "ReactJS is designed in such a manner that follows unidirectional data flow or one-way data binding. The benefits of one-way data binding give you better control throughout the application. If the data flow is in another direction, then it requires additional features. It is because components are supposed to be immutable and the data within them cannot be changed. Flux is a pattern that helps to keep your data unidirectional. This makes the application more flexible that leads to increase efficiency.\n" +
            "\n" +
            "Virtual DOM\n" +
            "\n" +
            "A virtual DOM object is a representation of the original DOM object. It works like a one-way data binding. Whenever any modifications happen in the web application, the entire UI is re-rendered in virtual DOM representation. Then it checks the difference between the previous DOM representation and new DOM. Once it has done, the real DOM will update only the things that have actually changed. This makes the application faster, and there is no wastage of memory.\n" +
            "Simplicity\n" +
            "\n" +
            "ReactJS uses JSX file which makes the application simple and to code as well as understand. We know that ReactJS is a component-based approach which makes the code reusable as your need. This makes it simple to use and learn.\n" +
            "Performance\n" +
            "\n" +
            "ReactJS is known to be a great performer. This feature makes it much better than other frameworks out there today. The reason behind this is that it manages a virtual DOM. The DOM is a cross-platform and programming API which deals with HTML, XML or XHTML. The DOM exists entirely in memory. Due to this, when we create a component, we did not write directly to the DOM. Instead, we are writing virtual components that will turn into the DOM leading to smoother and faster performance.";
    String ProsandCons = "Pros and Cons of ReactJS\n" +
            "\n" +
            "Today, ReactJS is the highly used open-source JavaScript Library. It helps in creating impressive web apps that require minimal effort and coding. The main objective of ReactJS is to develop User Interfaces (UI) that improves the speed of the apps. There are important pros and cons of ReactJS given as following:\n" +
            "Advantage of ReactJS\n" +
            "\n" +
            "1. Easy to Learn and USe\n" +
            "\n" +
            "ReactJS is much easier to learn and use. It comes with a good supply of documentation, tutorials, and training resources. Any developer who comes from a JavaScript background can easily understand and start creating web apps using React in a few days. It is the V(view part) in the MVC (Model-View-Controller) model, and referred to as ?one of the JavaScript frameworks.? It is not fully featured but has the advantage of open-source JavaScript User Interface(UI) library, which helps to execute the task in a better manner.\n" +
            "\n" +
            "2. Creating Dynamic Web Applications Becomes Easier\n" +
            "\n" +
            "To create a dynamic web application specifically with HTML strings was tricky because it requires a complex coding, but React JS solved that issue and makes it easier. It provides less coding and gives more functionality. It makes use of the JSX(JavaScript Extension), which is a particular syntax letting HTML quotes and HTML tag syntax to render particular subcomponents. It also supports the building of machine-readable codes.\n" +
            "\n" +
            "3. Reusable Components\n" +
            "\n" +
            "A ReactJS web application is made up of multiple components, and each component has its own logic and controls. These components are responsible for outputting a small, reusable piece of HTML code which can be reused wherever you need them. The reusable code helps to make your apps easier to develop and maintain. These Components can be nested with other components to allow complex applications to be built of simple building blocks. ReactJS uses virtual DOM based mechanism to fill data in HTML DOM. The virtual DOM works fast as it only changes individual DOM elements instead of reloading complete DOM every time.\n" +
            "\n" +
            "4. Performance Enhancement\n" +
            "\n" +
            "ReactJS improves performance due to virtual DOM. The DOM is a cross-platform and programming API which deals with HTML, XML or XHTML. Most of the developers faced the problem when the DOM was updated, which slowed down the performance of the application. ReactJS solved this problem by introducing virtual DOM. The React Virtual DOM exists entirely in memory and is a representation of the web browser's DOM. Due to this, when we write a React component, we did not write directly to the DOM. Instead, we are writing virtual components that react will turn into the DOM, leading to smoother and faster performance.\n" +
            "\n" +
            "5. The Support of Handy Tools\n" +
            "\n" +
            "React JS has also gained popularity due to the presence of a handy set of tools. These tools make the task of the developers understandable and easier. The React Developer Tools have been designed as Chrome and Firefox dev extension and allow you to inspect the React component hierarchies in the virtual DOM. It also allows you to select particular components and examine and edit their current props and state.\n" +
            "\n" +
            "6. Known to be SEO Friendly\n" +
            "\n" +
            "Traditional JavaScript frameworks have an issue in dealing with SEO. The search engines generally having trouble in reading JavaScript-heavy applications. Many web developers have often complained about this problem. ReactJS overcomes this problem that helps developers to be easily navigated on various search engines. It is because React.js applications can run on the server, and the virtual DOM will be rendering and returning to the browser as a regular web page.\n" +
            "\n" +
            "7. The Benefit of Having JavaScript Library\n" +
            "\n" +
            "Today, ReactJS is choosing by most of the web developers. It is because it is offering a very rich JavaScript library. The JavaScript library provides more flexibility to the web developers to choose the way they want.\n" +
            "\n" +
            "8. Scope for Testing the Codes\n" +
            "\n" +
            "ReactJS applications are extremely easy to test. It offers a scope where the developer can test and debug their codes with the help of native tools.";
    String ReactJSX = "React JSX\n" +
            "\n" +
            "As we have already seen that, all of the React components have a render function. The render function specifies the HTML output of a React component. JSX(JavaScript Extension), is a React extension which allows writing JavaScript code that looks like HTML. In other words, JSX is an HTML-like syntax used by React that extends ECMAScript so that HTML-like syntax can co-exist with JavaScript/React code. The syntax is used by preprocessors (i.e., transpilers like babel) to transform HTML-like syntax into standard JavaScript objects that a JavaScript engine will parse.\n" +
            "\n" +
            "JSX provides you to write HTML/XML-like structures (e.g., DOM-like tree structures) in the same file where you write JavaScript code, then preprocessor will transform these expressions into actual JavaScript code. Just like XML/HTML, JSX tags have a tag name, attributes, and children." +
            "Why use JSX?\n" +
            "\n" +
            "    It is faster than regular JavaScript because it performs optimization while translating the code to JavaScript.\n" +
            "    Instead of separating technologies by putting markup and logic in separate files, React uses components that contain both. We will learn components in a further section.\n" +
            "    It is type-safe, and most of the errors can be found at compilation time.\n" +
            "    It makes easier to create templates.\n";
    String ReactComponents = "React Components\n" +
            "\n" +
            "Earlier, the developers write more than thousands of lines of code for developing a single page application. These applications follow the traditional DOM structure, and making changes in them was a very challenging task. If any mistake found, it manually searches the entire application and update accordingly. The component-based approach was introduced to overcome an issue. In this approach, the entire application is divided into a small logical group of code, which is known as components.\n" +
            "\n" +
            "A Component is considered as the core building blocks of a React application. It makes the task of building UIs much easier. Each component exists in the same space, but they work independently from one another and merge all in a parent component, which will be the final UI of your application.\n" +
            "\n" +
            "Every React component have their own structure, methods as well as APIs. They can be reusable as per your need. For better understanding, consider the entire UI as a tree. Here, the root is the starting component, and each of the other pieces becomes branches, which are further divided into sub-branches.";
    String ReactState = "React State\n" +
            "\n" +
            "The state is an updatable structure that is used to contain data or information about the component. The state in a component can change over time. The change in state over time can happen as a response to user action or system event. A component with the state is known as stateful components. It is the heart of the react component which determines the behavior of the component and how it will render. They are also responsible for making a component dynamic and interactive.\n" +
            "\n" +
            "A state must be kept as simple as possible. It can be set by using the setState() method and calling setState() method triggers UI updates. A state represents the component's local state or information. It can only be accessed or modified inside the component or by the component directly. To set an initial state before any interaction occurs, we need to use the getInitialState() method." +
            "Defining State\n" +
            "\n" +
            "To define a state, you have to first declare a default set of values for defining the component's initial state. To do this, add a class constructor which assigns an initial state using this.state. The 'this.state' property can be rendered inside render() method.";
    String ReactProps = "React Props\n" +
            "\n" +
            "Props stand for \"Properties.\" They are read-only components. It is an object which stores the value of attributes of a tag and work similar to the HTML attributes. It gives a way to pass data from one component to other components. It is similar to function arguments. Props are passed to the component in the same way as arguments passed in a function.\n" +
            "\n" +
            "Props are immutable so we cannot modify the props from inside the component. Inside the components, we can add attributes called props. These attributes are available in the component as this.props and can be used to render dynamic data in our render method.\n" +
            "\n" +
            "When you need immutable data in the component, you have to add props to reactDom.render() method in the main.js file of your ReactJS project and used it inside the component in which you need. " +
            "Default Props\n" +
            "\n" +
            "It is not necessary to always add props in the reactDom.render() element. You can also set default props directly on the component constructor." ;
    String StateProps = "State Vs. Props\n" +
            "State\n" +
            "\n" +
            "The state is an updatable structure that is used to contain data or information about the component and can change over time. The change in state can happen as a response to user action or system event. It is the heart of the react component which determines the behavior of the component and how it will render. A state must be kept as simple as possible. It represents the component's local state or information. It can only be accessed or modified inside the component or by the component directly.\n" +
            "Props\n" +
            "\n" +
            "Props are read-only components. It is an object which stores the value of attributes of a tag and work similar to the HTML attributes. It allows passing data from one component to other components. It is similar to function arguments and can be passed to the component the same way as arguments passed in a function. Props are immutable so we cannot modify the props from inside the component.";
    String Constructor = "What is Constructor?\n" +
            "\n" +
            "The constructor is a method used to initialize an object's state in a class. It automatically called during the creation of an object in a class.\n" +
            "\n" +
            "The concept of a constructor is the same in React. The constructor in a React component is called before the component is mounted. When you implement the constructor for a React component, you need to call super(props) method before any other statement. If you do not call super(props) method, this.props will be undefined in the constructor and can lead to bugs.";
    String ReactRouter = "React Router\n" +
            "\n" +
            "Routing is a process in which a user is directed to different pages based on their action or request. ReactJS Router is mainly used for developing Single Page Web Applications. React Router is used to define multiple routes in the application. When a user types a specific URL into the browser, and if this URL path matches any 'route' inside the router file, the user will be redirected to that particular route.\n" +
            "\n" +
            "React Router is a standard library system built on top of the React and used to create routing in the React application using React Router Package. It provides the synchronous URL on the browser with data that will be displayed on the web page. It maintains the standard structure and behavior of the application and mainly used for developing single page web applications.\n" +
            "Need of React Router\n" +
            "\n" +
            "React Router plays an important role to display multiple views in a single page application. Without React Router, it is not possible to display multiple views in React applications. Most of the social media websites like Facebook, Instagram uses React Router for rendering multiple views.";
    String ReactBootstrap = "React Bootstrap\n" +
            "\n" +
            "Single-page applications gaining popularity over the last few years, so many front-end frameworks have introduced such as Angular, React, Vue.js, Ember, etc. As a result, jQuery is not a necessary requirement for building web apps. Today, React has the most used JavaScript framework for building web applications, and Bootstrap become the most popular CSS framework. So, it is necessary to learn various ways in which Bootstrap can be used in React apps, which is the main aim of this section.\n" +
            "Adding Bootstrap for React\n" +
            "\n" +
            "We can add Bootstrap to the React app in several ways. The three most common ways are given below:\n" +
            "\n" +
            "    Using the Bootstrap CDN\n" +
            "    Bootstrap as Dependency\n" +
            "    React Bootstrap Package\n" +
            "\n" +
            "React Bootstrap\n" +
            "Using the Bootstrap CDN\n" +
            "\n" +
            "It is the easiest way of adding Bootstrap to the React app. There is no need to install or download Bootstrap. We can simply put an <link> into the <head> section of the index.html file of the React appIf there is a need to use Bootstrap components which depend on JavaScript/jQuery in the React application, we need to include jQuery, Popper.js, and Bootstrap.js in the document. Add the following imports in the <script> tags near the end of the closing </body> tag of the index.html file.";
    String ReactHooks = "React Hooks\n" +
            "\n" +
            "Hooks are the new feature introduced in the React 16.8 version. It allows you to use state and other React features without writing a class. Hooks are the functions which \"hook into\" React state and lifecycle features from function components. It does not work inside classes.\n" +
            "\n" +
            "Hooks are backward-compatible, which means it does not contain any breaking changes. Also, it does not replace your knowledge of React concepts.\n" +
            "When to use a Hooks\n" +
            "\n" +
            "If you write a function component, and then you want to add some state to it, previously you do this by converting it to a class. But, now you can do it by using a Hook inside the existing function component.\n" +
            "Rules of Hooks\n" +
            "\n" +
            "Hooks are similar to JavaScript functions, but you need to follow these two rules when using them. Hooks rule ensures that all the stateful logic in a component is visible in its source code. These rules are:\n" +
            "\n" +
            "1. Only call Hooks at the top level\n" +
            "\n" +
            "Do not call Hooks inside loops, conditions, or nested functions. Hooks should always be used at the top level of the React functions. This rule ensures that Hooks are called in the same order each time a components renders.\n" +
            "2. Only call Hooks from React functions\n" +
            "\n" +
            "You cannot call Hooks from regular JavaScript functions. Instead, you can call Hooks from React function components. Hooks can also be called from custom Hooks.\n" +
            "Pre-requisites for React Hooks\n" +
            "\n" +
            "    Node version 6 or above\n" +
            "    NPM version 5.2 or above\n" +
            "    Create-react-app tool for running the React App\n" +
            "\n" +
            "React Hooks Installation\n" +
            "\n" +
            "To use React Hooks, we need to run the following commands:\n" +
            "\n" +
            "    $ npm install react@16.8.0-alpha.1 --save  \n" +
            "    $ npm install react-dom@16.8.0-alpha.1 --save  \n" +
            "\n" +
            "The above command will install the latest React and React-DOM alpha versions which support React Hooks. Make sure the package.json file lists the React and React-DOM dependencies as given below.\n" +
            "\n" +
            "    \"react\": \"^16.8.0-alpha.1\",  \n" +
            "    \"react-dom\": \"^16.8.0-alpha.1\",  \n" +
            "\n" +
            "Hooks State\n" +
            "\n" +
            "Hook state is the new way of declaring a state in React app. Hook uses useState() functional component for setting and retrieving state. Let us understand Hook state with the following example.\n" +
            "\n" +
            "App.js\n" +
            "\n" +
            "    import React, { useState } from 'react';  \n" +
            "      \n" +
            "    function CountApp() {  \n" +
            "      // Declare a new state variable, which we'll call \"count\"  \n" +
            "      const [count, setCount] = useState(0);  \n" +
            "      \n" +
            "      return (  \n" +
            "        <div>  \n" +
            "          <p>You clicked {count} times</p>  \n" +
            "          <button onClick={() => setCount(count + 1)}>  \n" +
            "            Click me  \n" +
            "          </button>  \n" +
            "        </div>  \n" +
            "      );  \n" +
            "    }  \n" +
            "    export default CountApp;  " +
            "Hooks Effect\n" +
            "\n" +
            "The Effect Hook allows us to perform side effects (an action) in the function components. It does not use components lifecycle methods which are available in class components. In other words, Effects Hooks are equivalent to componentDidMount(), componentDidUpdate(), and componentWillUnmount() lifecycle methods.\n" +
            "\n" +
            "Side effects have common features which the most web applications need to perform, such as:\n" +
            "\n" +
            "    Updating the DOM,\n" +
            "    Fetching and consuming data from a server API,\n" +
            "    Setting up a subscription, etc.\n" +
            "\n" +
            "Let us understand Hook Effect with the following example.\n" +
            "\n" +
            "    import React, { useState, useEffect } from 'react';  \n" +
            "      \n" +
            "    function CounterExample() {  \n" +
            "      const [count, setCount] = useState(0);  \n" +
            "      \n" +
            "      // Similar to componentDidMount and componentDidUpdate:  \n" +
            "      useEffect(() => {  \n" +
            "        // Update the document title using the browser API  \n" +
            "        document.title = `You clicked ${count} times`;  \n" +
            "      });  \n" +
            "      \n" +
            "      return (  \n" +
            "        <div>  \n" +
            "          <p>You clicked {count} times</p>  \n" +
            "          <button onClick={() => setCount(count + 1)}>  \n" +
            "            Click me  \n" +
            "          </button>  \n" +
            "        </div>  \n" +
            "      );  \n" +
            "    }  " +
            "Custom Hooks\n" +
            "\n" +
            "A custom Hook is a JavaScript function. The name of custom Hook starts with \"use\" which can call other Hooks. A custom Hook is just like a regular function, and the word \"use\" in the beginning tells that this function follows the rules of Hooks. Building custom Hooks allows you to extract component logic into reusable functions.\n" +
            "\n" +
            "Let us understand how custom Hooks works in the following example.\n" +
            "\n" +
            "    import React, { useState, useEffect } from 'react';  \n" +
            "      \n" +
            "    const useDocumentTitle = title => {  \n" +
            "      useEffect(() => {  \n" +
            "        document.title = title;  \n" +
            "      }, [title])  \n" +
            "    }  \n" +
            "      \n" +
            "    function CustomCounter() {  \n" +
            "      const [count, setCount] = useState(0);  \n" +
            "      const incrementCount = () => setCount(count + 1);  \n" +
            "      useDocumentTitle(`You clicked ${count} times`);  \n" +
            "      // useEffect(() => {  \n" +
            "      //   document.title = `You clicked ${count} times`  \n" +
            "      // });  \n" +
            "      \n" +
            "      return (  \n" +
            "        <div>  \n" +
            "          <p>You clicked {count} times</p>  \n" +
            "          <button onClick={incrementCount}>Click me</button>  \n" +
            "        </div>  \n" +
            "      )  \n" +
            "    }  \n" +
            "    export default CustomCounter;  " +
            "Built-in Hooks\n" +
            "\n" +
            "Here, we describe the APIs for the built-in Hooks in React. The built-in Hooks can be divided into two parts, which are given below.\n" +
            "\n" +
            "Basic Hooks\n" +
            "\n" +
            "    useState\n" +
            "    useEffect\n" +
            "    useContext\n" +
            "\n" +
            "Additional Hooks\n" +
            "\n" +
            "    useReducer\n" +
            "    useCallback\n" +
            "    useMemo\n" +
            "    useRef\n" +
            "    useImperativeHandle\n" +
            "    useLayoutEffect\n" +
            "    useDebugValue\n";

    //PHP topics
    String home ="The PHP Hypertext Preprocessor (PHP) is a programming language that allows web developers to create dynamic content that interacts with databases. PHP is basically used for developing web based software applications. This tutorial helps you to build your base with PHP.\n" +
            "Why to Learn PHP?\n" +
            "\n" +
            "PHP started out as a small open source project that evolved as more and more people found out how useful it was. Rasmus Lerdorf unleashed the first version of PHP way back in 1994.\n" +
            "\n" +
            "PHP is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Web Development Domain. I will list down some of the key advantages of learning PHP:\n" +
            "\n" +
            "    PHP is a recursive acronym for \"PHP: Hypertext Preprocessor\".\n" +
            "\n" +
            "    PHP is a server side scripting language that is embedded in HTML. It is used to manage dynamic content, databases, session tracking, even build entire e-commerce sites.\n" +
            "\n" +
            "    It is integrated with a number of popular databases, including MySQL, PostgreSQL, Oracle, Sybase, Informix, and Microsoft SQL Server.\n" +
            "\n" +
            "    PHP is pleasingly zippy in its execution, especially when compiled as an Apache module on the Unix side. The MySQL server, once started, executes even very complex queries with huge result sets in record-setting time.\n" +
            "\n" +
            "    PHP supports a large number of major protocols such as POP3, IMAP, and LDAP. PHP4 added support for Java and distributed object architectures (COM and CORBA), making n-tier development a possibility for the first time.\n" +
            "\n" +
            "    PHP is forgiving: PHP language tries to be as forgiving as possible.\n" +
            "\n" +
            "    PHP Syntax is C-Like.\n" +
            "\n" +
            "Characteristics of PHP\n" +
            "\n" +
            "Five important characteristics make PHP's practical nature possible −\n" +
            "\n" +
            "    Simplicity\n" +
            "    Efficiency\n" +
            "    Security\n" +
            "    Flexibility\n" +
            "    Familiarity\n" +
            "\n" +
            "Hello World using PHP.\n" +
            "\n" +
            "Just to give you a little excitement about PHP, I'm going to give you a small conventional PHP Hello World program, You can try it using Demo link.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Hello World</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      <?php echo \"Hello, World!\";?>\n" +
            "   </body>\n" +
            "\n" +
            "</html>\n" +
            "\n" +
            "Applications of PHP\n" +
            "\n" +
            "As mentioned before, PHP is one of the most widely used language over the web. I'm going to list few of them here:\n" +
            "\n" +
            "    PHP performs system functions, i.e. from files on a system it can create, open, read, write, and close them.\n" +
            "\n" +
            "    PHP can handle forms, i.e. gather data from files, save data to a file, through email you can send data, return data to the user.\n" +
            "\n" +
            "    You add, delete, modify elements within your database through PHP.\n" +
            "\n" +
            "    Access cookies variables and set cookies.\n" +
            "\n" +
            "    Using PHP, you can restrict users to access some pages of your website.\n" +
            "\n" +
            "    It can encrypt data.\n" +
            "\n" +
            "Audience\n" +
            "\n" +
            "This PHP tutorial is designed for PHP programmers who are completely unaware of PHP concepts but they have basic understanding on computer programming.\n" +
            "Prerequisites\n" +
            "\n" +
            "Before proceeding with this tutorial you should have at least basic understanding of computer programming, Internet, Database, and MySQL etc is very helpful.";
    String  introPHP = "\n" +
            "\n" +
            "PHP started out as a small open source project that evolved as more and more people found out how useful it was. Rasmus Lerdorf unleashed the first version of PHP way back in 1994.\n" +
            "\n" +
            "    PHP is a recursive acronym for \"PHP: Hypertext Preprocessor\".\n" +
            "\n" +
            "    PHP is a server side scripting language that is embedded in HTML. It is used to manage dynamic content, databases, session tracking, even build entire e-commerce sites.\n" +
            "\n" +
            "    It is integrated with a number of popular databases, including MySQL, PostgreSQL, Oracle, Sybase, Informix, and Microsoft SQL Server.\n" +
            "\n" +
            "    PHP is pleasingly zippy in its execution, especially when compiled as an Apache module on the Unix side. The MySQL server, once started, executes even very complex queries with huge result sets in record-setting time.\n" +
            "\n" +
            "    PHP supports a large number of major protocols such as POP3, IMAP, and LDAP. PHP4 added support for Java and distributed object architectures (COM and CORBA), making n-tier development a possibility for the first time.\n" +
            "\n" +
            "    PHP is forgiving: PHP language tries to be as forgiving as possible.\n" +
            "\n" +
            "    PHP Syntax is C-Like.\n" +
            "\n" +
            "Common uses of PHP\n" +
            "\n" +
            "    PHP performs system functions, i.e. from files on a system it can create, open, read, write, and close them.\n" +
            "\n" +
            "    PHP can handle forms, i.e. gather data from files, save data to a file, through email you can send data, return data to the user.\n" +
            "\n" +
            "    You add, delete, modify elements within your database through PHP.\n" +
            "\n" +
            "    Access cookies variables and set cookies.\n" +
            "\n" +
            "    Using PHP, you can restrict users to access some pages of your website.\n" +
            "\n" +
            "    It can encrypt data.\n" +
            "\n" +
            "Characteristics of PHP\n" +
            "\n" +
            "Five important characteristics make PHP's practical nature possible −\n" +
            "\n" +
            "    Simplicity\n" +
            "    Efficiency\n" +
            "    Security\n" +
            "    Flexibility\n" +
            "    Familiarity\n" +
            "\n" +
            "\"Hello World\" Script in PHP\n" +
            "\n" +
            "To get a feel for PHP, first start with simple PHP scripts. Since \"Hello, World!\" is an essential example, first we will create a friendly little \"Hello, World!\" script.\n" +
            "\n" +
            "As mentioned earlier, PHP is embedded in HTML. That means that in amongst your normal HTML (or XHTML if you're cutting-edge) you'll have PHP statements like this −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Hello World</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      <?php echo \"Hello, World!\";?>\n" +
            "   </body>\n" +
            "\n" +
            "</html>\n" +
            "\n" +
            "It will produce following result −\n" +
            "\n" +
            "Hello, World!\n" +
            "\n" +
            "If you examine the HTML output of the above example, you'll notice that the PHP code is not present in the file sent from the server to your Web browser. All of the PHP present in the Web page is processed and stripped from the page; the only thing returned to the client from the Web server is pure HTML output.\n" +
            "\n" +
            "All PHP code must be included inside one of the three special markup tags ATE are recognised by the PHP Parser.\n" +
            "\n" +
            "<?php PHP code goes here ?>\n" +
            "\n" +
            "<?    PHP code goes here ?>\n" +
            "\n" +
            "<script language = \"php\"> PHP code goes here </script>\n" +
            "\n" +
            "A most common tag is the <?php...?> and we will also use the same tag in our tutorial.\n" +
            "\n" +
            "From the next chapter we will start with PHP Environment Setup on your machine and then we will dig out almost all concepts related to PHP to make you comfortable with the PHP language.\n";
    String environment = "\n" +
            "\n" +
            "In order to develop and run PHP Web pages three vital components need to be installed on your computer system.\n" +
            "\n" +
            "    Web Server − PHP will work with virtually all Web Server software, including Microsoft's Internet Information Server (IIS) but then most often used is freely available Apache Server. Download Apache for free here − https://httpd.apache.org/download.cgi\n" +
            "\n" +
            "    Database − PHP will work with virtually all database software, including Oracle and Sybase but most commonly used is freely available MySQL database. Download MySQL for free here − https://www.mysql.com/downloads/\n" +
            "\n" +
            "    PHP Parser − In order to process PHP script instructions a parser must be installed to generate HTML output that can be sent to the Web Browser. This tutorial will guide you how to install PHP parser on your computer.\n" +
            "\n" +
            "PHP Parser Installation\n" +
            "\n" +
            "Before you proceed it is important to make sure that you have proper environment setup on your machine to develop your web programs using PHP.\n" +
            "\n" +
            "Type the following address into your browser's address box.\n" +
            "\n" +
            "http://127.0.0.1/info.php\n" +
            "\n" +
            "If this displays a page showing your PHP installation related information then it means you have PHP and Webserver installed properly. Otherwise you have to follow given procedure to install PHP on your computer.\n" +
            "\n" +
            "This section will guide you to install and configure PHP over the following four platforms −\n" +
            "\n" +
            "    PHP Installation on Linux or Unix with Apache\n" +
            "\n" +
            "    PHP Installation on Mac OS X with Apache\n" +
            "\n" +
            "    PHP Installation on Windows NT/2000/XP with IIS\n" +
            "\n" +
            "    PHP Installation on Windows NT/2000/XP with Apache\n" +
            "\n" +
            "Apache Configuration\n" +
            "\n" +
            "If you are using Apache as a Web Server then this section will guide you to edit Apache Configuration Files.\n" +
            "\n" +
            "Just Check it here − PHP Configuration in Apache Server\n" +
            "PHP.INI File Configuration\n" +
            "\n" +
            "The PHP configuration file, php.ini, is the final and most immediate way to affect PHP's functionality.\n" +
            "\n" +
            "Just Check it here − PHP.INI File Configuration\n" +
            "Windows IIS Configuration\n" +
            "\n" +
            "To configure IIS on your Windows machine you can refer your IIS Reference Manual shipped along with IIS.\n";
    String syntax = "\n" +
            "\n" +
            "This chapter will give you an idea of very basic syntax of PHP and very important to make your PHP foundation strong.\n" +
            "Escaping to PHP\n" +
            "\n" +
            "The PHP parsing engine needs a way to differentiate PHP code from other elements in the page. The mechanism for doing so is known as 'escaping to PHP'. There are four ways to do this −\n" +
            "Canonical PHP tags\n" +
            "\n" +
            "The most universally effective PHP tag style is −\n" +
            "\n" +
            "<?php...?>\n" +
            "\n" +
            "If you use this style, you can be positive that your tags will always be correctly interpreted.\n" +
            "Short-open (SGML-style) tags\n" +
            "\n" +
            "Short or short-open tags look like this −\n" +
            "\n" +
            "<?...?>\n" +
            "\n" +
            "Short tags are, as one might expect, the shortest option You must do one of two things to enable PHP to recognize the tags −\n" +
            "\n" +
            "    Choose the --enable-short-tags configuration option when you're building PHP.\n" +
            "\n" +
            "    Set the short_open_tag setting in your php.ini file to on. This option must be disabled to parse XML with PHP because the same syntax is used for XML tags.\n" +
            "\n" +
            "ASP-style tags\n" +
            "\n" +
            "ASP-style tags mimic the tags used by Active Server Pages to delineate code blocks. ASP-style tags look like this −\n" +
            "\n" +
            "<%...%>\n" +
            "\n" +
            "To use ASP-style tags, you will need to set the configuration option in your php.ini file.\n" +
            "HTML script tags\n" +
            "\n" +
            "HTML script tags look like this −\n" +
            "\n" +
            "<script language = \"PHP\">...</script>\n" +
            "\n" +
            "Commenting PHP Code\n" +
            "\n" +
            "A comment is the portion of a program that exists only for the human reader and stripped out before displaying the programs result. There are two commenting formats in PHP −\n" +
            "\n" +
            "Single-line comments − They are generally used for short explanations or notes relevant to the local code. Here are the examples of single line comments.\n" +
            "\n" +
            "<?\n" +
            "   # This is a comment, and\n" +
            "   # This is the second line of the comment\n" +
            "   \n" +
            "   // This is a comment too. Each style comments only\n" +
            "   print \"An example with single line comments\";\n" +
            "?>\n" +
            "\n" +
            "Multi-lines printing − Here are the examples to print multiple lines in a single print statement −\n" +
            "\n" +
            "<?\n" +
            "   # First Example\n" +
            "   print <<<END\n" +
            "   This uses the \"here document\" syntax to output\n" +
            "   multiple lines with $variable interpolation. Note\n" +
            "   that the here document terminator must appear on a\n" +
            "   line with just a semicolon no extra whitespace!\n" +
            "   END;\n" +
            "   \n" +
            "   # Second Example\n" +
            "   print \"This spans\n" +
            "   multiple lines. The newlines will be\n" +
            "   output as well\";\n" +
            "?>\n" +
            "\n" +
            "Multi-lines comments − They are generally used to provide pseudocode algorithms and more detailed explanations when necessary. The multiline style of commenting is the same as in C. Here are the example of multi lines comments.\n" +
            "\n" +
            "<?\n" +
            "   /* This is a comment with multiline\n" +
            "      Author : Mohammad Mohtashim\n" +
            "      Purpose: Multiline Comments Demo\n" +
            "      Subject: PHP\n" +
            "   */\n" +
            "   \n" +
            "   print \"An example with multi line comments\";\n" +
            "?>\n" +
            "\n" +
            "PHP is whitespace insensitive\n" +
            "\n" +
            "Whitespace is the stuff you type that is typically invisible on the screen, including spaces, tabs, and carriage returns (end-of-line characters).\n" +
            "\n" +
            "PHP whitespace insensitive means that it almost never matters how many whitespace characters you have in a row.one whitespace character is the same as many such characters.\n" +
            "\n" +
            "For example, each of the following PHP statements that assigns the sum of 2 + 2 to the variable $four is equivalent −\n" +
            "\n" +
            "$four = 2 + 2; // single spaces\n" +
            "$four <tab>=<tab2<tab>+<tab>2 ; // spaces and tabs\n" +
            "$four =\n" +
            "2+\n" +
            "2; // multiple lines\n" +
            "\n" +
            "PHP is case sensitive\n" +
            "\n" +
            "Yeah it is true that PHP is a case sensitive language. Try out following example −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $capital = 67;\n" +
            "         print(\"Variable capital is $capital<br>\");\n" +
            "         print(\"Variable CaPiTaL is $CaPiTaL<br>\");\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Variable capital is 67\n" +
            "Variable CaPiTaL is\n" +
            "\n" +
            "Statements are expressions terminated by semicolons\n" +
            "\n" +
            "A statement in PHP is any expression that is followed by a semicolon (;).Any sequence of valid PHP statements that is enclosed by the PHP tags is a valid PHP program. Here is a typical statement in PHP, which in this case assigns a string of characters to a variable called $greeting −\n" +
            "\n" +
            "$greeting = \"Welcome to PHP!\";\n" +
            "\n" +
            "Expressions are combinations of tokens\n" +
            "\n" +
            "The smallest building blocks of PHP are the indivisible tokens, such as numbers (3.14159), strings (.two.), variables ($two), constants (TRUE), and the special words that make up the syntax of PHP itself like if, else, while, for and so forth\n" +
            "Braces make blocks\n" +
            "\n" +
            "Although statements cannot be combined like expressions, you can always put a sequence of statements anywhere a statement can go by enclosing them in a set of curly braces.\n" +
            "\n" +
            "Here both statements are equivalent −\n" +
            "\n" +
            "if (3 == 2 + 1)\n" +
            "   print(\"Good - I haven't totally lost my mind.<br>\");\n" +
            "   \n" +
            "if (3 == 2 + 1) {\n" +
            "   print(\"Good - I haven't totally\");\n" +
            "   print(\"lost my mind.<br>\");\n" +
            "}\n" +
            "\n" +
            "Running PHP Script from Command Prompt\n" +
            "\n" +
            "Yes you can run your PHP script on your command prompt. Assuming you have following content in test.php file\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   echo \"Hello PHP!!!!!\";\n" +
            "?>\n" +
            "\n" +
            "Now run this script as command prompt as follows −\n" +
            "\n" +
            "$ php test.php\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "Hello PHP!!!!!\n" +
            "\n" +
            "Hope now you have basic knowledge of PHP Syntax.\n";
    String veriable = "\n" +
            "\n" +
            "The main way to store information in the middle of a PHP program is by using a variable.\n" +
            "\n" +
            "Here are the most important things to know about variables in PHP.\n" +
            "\n" +
            "    All variables in PHP are denoted with a leading dollar sign ($).\n" +
            "\n" +
            "    The value of a variable is the value of its most recent assignment.\n" +
            "\n" +
            "    Variables are assigned with the = operator, with the variable on the left-hand side and the expression to be evaluated on the right.\n" +
            "\n" +
            "    Variables can, but do not need, to be declared before assignment.\n" +
            "\n" +
            "    Variables in PHP do not have intrinsic types - a variable does not know in advance whether it will be used to store a number or a string of characters.\n" +
            "\n" +
            "    Variables used before they are assigned have default values.\n" +
            "\n" +
            "    PHP does a good job of automatically converting types from one to another when necessary.\n" +
            "\n" +
            "    PHP variables are Perl-like.\n" +
            "\n" +
            "PHP has a total of eight data types which we use to construct our variables −\n" +
            "\n" +
            "    Integers − are whole numbers, without a decimal point, like 4195.\n" +
            "\n" +
            "    Doubles − are floating-point numbers, like 3.14159 or 49.1.\n" +
            "\n" +
            "    Booleans − have only two possible values either true or false.\n" +
            "\n" +
            "    NULL − is a special type that only has one value: NULL.\n" +
            "\n" +
            "    Strings − are sequences of characters, like 'PHP supports string operations.'\n" +
            "\n" +
            "    Arrays − are named and indexed collections of other values.\n" +
            "\n" +
            "    Objects − are instances of programmer-defined classes, which can package up both other kinds of values and functions that are specific to the class.\n" +
            "\n" +
            "    Resources − are special variables that hold references to resources external to PHP (such as database connections).\n" +
            "\n" +
            "The first five are simple types, and the next two (arrays and objects) are compound - the compound types can package up other arbitrary values of arbitrary type, whereas the simple types cannot.\n" +
            "\n" +
            "We will explain only simple data type in this chapters. Array and Objects will be explained separately.\n" +
            "Integers\n" +
            "\n" +
            "They are whole numbers, without a decimal point, like 4195. They are the simplest type .they correspond to simple whole numbers, both positive and negative. Integers can be assigned to variables, or they can be used in expressions, like so −\n" +
            "\n" +
            "$int_var = 12345;\n" +
            "$another_int = -12345 + 12345;\n" +
            "\n" +
            "Integer can be in decimal (base 10), octal (base 8), and hexadecimal (base 16) format. Decimal format is the default, octal integers are specified with a leading 0, and hexadecimals have a leading 0x.\n" +
            "\n" +
            "For most common platforms, the largest integer is (2**31 . 1) (or 2,147,483,647), and the smallest (most negative) integer is . (2**31 . 1) (or .2,147,483,647).\n" +
            "Doubles\n" +
            "\n" +
            "They like 3.14159 or 49.1. By default, doubles print with the minimum number of decimal places needed. For example, the code −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   $many = 2.2888800;\n" +
            "   $many_2 = 2.2111200;\n" +
            "   $few = $many + $many_2;\n" +
            "   \n" +
            "   print(\"$many + $many_2 = $few <br>\");\n" +
            "?>\n" +
            "\n" +
            "It produces the following browser output −\n" +
            "\n" +
            "2.28888 + 2.21112 = 4.5\n" +
            "\n" +
            "Boolean\n" +
            "\n" +
            "They have only two possible values either true or false. PHP provides a couple of constants especially for use as Booleans: TRUE and FALSE, which can be used like so −\n" +
            "\n" +
            "if (TRUE)\n" +
            "   print(\"This will always print<br>\");\n" +
            "\n" +
            "else\n" +
            "   print(\"This will never print<br>\");\n" +
            "\n" +
            "Interpreting other types as Booleans\n" +
            "\n" +
            "Here are the rules for determine the \"truth\" of any value not already of the Boolean type −\n" +
            "\n" +
            "    If the value is a number, it is false if exactly equal to zero and true otherwise.\n" +
            "\n" +
            "    If the value is a string, it is false if the string is empty (has zero characters) or is the string \"0\", and is true otherwise.\n" +
            "\n" +
            "    Values of type NULL are always false.\n" +
            "\n" +
            "    If the value is an array, it is false if it contains no other values, and it is true otherwise. For an object, containing a value means having a member variable that has been assigned a value.\n" +
            "\n" +
            "    Valid resources are true (although some functions that return resources when they are successful will return FALSE when unsuccessful).\n" +
            "\n" +
            "    Don't use double as Booleans.\n" +
            "\n" +
            "Each of the following variables has the truth value embedded in its name when it is used in a Boolean context.\n" +
            "\n" +
            "$true_num = 3 + 0.14159;\n" +
            "$true_str = \"Tried and true\"\n" +
            "$true_array[49] = \"An array element\";\n" +
            "$false_array = array();\n" +
            "$false_null = NULL;\n" +
            "$false_num = 999 - 999;\n" +
            "$false_str = \"\";\n" +
            "\n" +
            "NULL\n" +
            "\n" +
            "NULL is a special type that only has one value: NULL. To give a variable the NULL value, simply assign it like this −\n" +
            "\n" +
            "$my_var = NULL;\n" +
            "\n" +
            "The special constant NULL is capitalized by convention, but actually it is case insensitive; you could just as well have typed −\n" +
            "\n" +
            "$my_var = null;\n" +
            "\n" +
            "A variable that has been assigned NULL has the following properties −\n" +
            "\n" +
            "    It evaluates to FALSE in a Boolean context.\n" +
            "\n" +
            "    It returns FALSE when tested with IsSet() function.\n" +
            "\n" +
            "Strings\n" +
            "\n" +
            "They are sequences of characters, like \"PHP supports string operations\". Following are valid examples of string\n" +
            "\n" +
            "$string_1 = \"This is a string in double quotes\";\n" +
            "$string_2 = 'This is a somewhat longer, singly quoted string';\n" +
            "$string_39 = \"This string has thirty-nine characters\";\n" +
            "$string_0 = \"\"; // a string with zero characters\n" +
            "\n" +
            "Singly quoted strings are treated almost literally, whereas doubly quoted strings replace variables with their values as well as specially interpreting certain character sequences.\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   $variable = \"name\";\n" +
            "   $literally = 'My $variable will not print!';\n" +
            "   \n" +
            "   print($literally);\n" +
            "   print \"<br>\";\n" +
            "   \n" +
            "   $literally = \"My $variable will print!\";\n" +
            "   print($literally);\n" +
            "?>\n" +
            "\n" +
            "This will produce following result −\n" +
            "\n" +
            "My $variable will not print!\n" +
            "My name will print\n" +
            "\n" +
            "There are no artificial limits on string length - within the bounds of available memory, you ought to be able to make arbitrarily long strings.\n" +
            "\n" +
            "Strings that are delimited by double quotes (as in \"this\") are preprocessed in both the following two ways by PHP −\n" +
            "\n" +
            "    Certain character sequences beginning with backslash (\\) are replaced with special characters\n" +
            "\n" +
            "    Variable names (starting with $) are replaced with string representations of their values.\n" +
            "\n" +
            "The escape-sequence replacements are −\n" +
            "\n" +
            "    \\n is replaced by the newline character\n" +
            "    \\r is replaced by the carriage-return character\n" +
            "    \\t is replaced by the tab character\n" +
            "    \\$ is replaced by the dollar sign itself ($)\n" +
            "    \\\" is replaced by a single double-quote (\")\n" +
            "    \\\\ is replaced by a single backslash (\\)\n" +
            "\n" +
            "Here Document\n" +
            "\n" +
            "You can assign multiple lines to a single string variable using here document −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   $channel =<<<_XML_\n" +
            "   \n" +
            "   <channel>\n" +
            "      <title>What's For Dinner</title>\n" +
            "      <link>http://menu.example.com/ </link>\n" +
            "      <description>Choose what to eat tonight.</description>\n" +
            "   </channel>\n" +
            "   _XML_;\n" +
            "   \n" +
            "   echo <<<END\n" +
            "   This uses the \"here document\" syntax to output multiple lines with variable \n" +
            "   interpolation. Note that the here document terminator must appear on a line with \n" +
            "   just a semicolon. no extra whitespace!\n" +
            "   \n" +
            "\n" +
            "   END;\n" +
            "   \n" +
            "   print $channel;\n" +
            "?>\n" +
            "\n" +
            "This will produce following result −\n" +
            "\n" +
            "This uses the \"here document\" syntax to output\n" +
            "multiple lines with variable interpolation. Note\n" +
            "that the here document terminator must appear on a\n" +
            "line with just a semicolon. no extra whitespace!\n" +
            "\n" +
            "<channel>\n" +
            "<title>What's For Dinner<title>\n" +
            "<link>http://menu.example.com/<link>\n" +
            "<description>Choose what to eat tonight.</description>\n" +
            "\n" +
            "Variable Scope\n" +
            "\n" +
            "Scope can be defined as the range of availability a variable has to the program in which it is declared. PHP variables can be one of four scope types −\n" +
            "\n" +
            "    Local variables\n" +
            "\n" +
            "    Function parameters\n" +
            "\n" +
            "    Global variables\n" +
            "\n" +
            "    Static variables\n" +
            "\n" +
            "Variable Naming\n" +
            "\n" +
            "Rules for naming a variable is −\n" +
            "\n" +
            "    Variable names must begin with a letter or underscore character.\n" +
            "\n" +
            "    A variable name can consist of numbers, letters, underscores but you cannot use characters like + , - , % , ( , ) . & , etc\n" +
            "\n" +
            "There is no size limit for variables.\n";
    String constants = "\n" +
            "\n" +
            "A constant is a name or an identifier for a simple value. A constant value cannot change during the execution of the script. By default, a constant is case-sensitive. By convention, constant identifiers are always uppercase. A constant name starts with a letter or underscore, followed by any number of letters, numbers, or underscores. If you have defined a constant, it can never be changed or undefined.\n" +
            "\n" +
            "To define a constant you have to use define() function and to retrieve the value of a constant, you have to simply specifying its name. Unlike with variables, you do not need to have a constant with a $. You can also use the function constant() to read a constant's value if you wish to obtain the constant's name dynamically.\n" +
            "constant() function\n" +
            "\n" +
            "As indicated by the name, this function will return the value of the constant.\n" +
            "\n" +
            "This is useful when you want to retrieve value of a constant, but you do not know its name, i.e. It is stored in a variable or returned by a function.\n" +
            "constant() example\n" +
            "\n" +
            "<?php\n" +
            "   define(\"MINSIZE\", 50);\n" +
            "   \n" +
            "   echo MINSIZE;\n" +
            "   echo constant(\"MINSIZE\"); // same thing as the previous line\n" +
            "?>\n" +
            "\n" +
            "Only scalar data (boolean, integer, float and string) can be contained in constants.\n" +
            "Differences between constants and variables are\n" +
            "\n" +
            "    There is no need to write a dollar sign ($) before a constant, where as in Variable one has to write a dollar sign.\n" +
            "\n" +
            "    Constants cannot be defined by simple assignment, they may only be defined using the define() function.\n" +
            "\n" +
            "    Constants may be defined and accessed anywhere without regard to variable scoping rules.\n" +
            "\n" +
            "    Once the Constants have been set, may not be redefined or undefined.\n" +
            "\n" +
            "Valid and invalid constant names\n" +
            "\n" +
            "// Valid constant names\n" +
            "define(\"ONE\",     \"first thing\");\n" +
            "define(\"TWO2\",    \"second thing\");\n" +
            "define(\"THREE_3\", \"third thing\");\n" +
            "define(\"__THREE__\", \"third value\");\n" +
            "\n" +
            "// Invalid constant names\n" +
            "define(\"2TWO\",    \"second thing\");\n" +
            " \n" +
            "\n" +
            "PHP Magic constants\n" +
            "\n" +
            "PHP provides a large number of predefined constants to any script which it runs.\n" +
            "\n" +
            "There are five magical constants that change depending on where they are used. For example, the value of __LINE__ depends on the line that it's used on in your script. These special constants are case-insensitive and are as follows −\n" +
            "\n" +
            "A few \"magical\" PHP constants are given below −\n" +
            "Sr.No \tName & Description\n" +
            "1 \t\n" +
            "\n" +
            "__LINE__\n" +
            "\n" +
            "The current line number of the file.\n" +
            "2 \t\n" +
            "\n" +
            "__FILE__\n" +
            "\n" +
            "The full path and filename of the file. If used inside an include,the name of the included file is returned. Since PHP 4.0.2, __FILE__ always contains an absolute path whereas in older versions it contained relative path under some circumstances.\n" +
            "3 \t\n" +
            "\n" +
            "__FUNCTION__\n" +
            "\n" +
            "The function name. (Added in PHP 4.3.0) As of PHP 5 this constant returns the function name as it was declared (case-sensitive). In PHP 4 its value is always lowercased.\n" +
            "4 \t\n" +
            "\n" +
            "__CLASS__\n" +
            "\n" +
            "The class name. (Added in PHP 4.3.0) As of PHP 5 this constant returns the class name as it was declared (case-sensitive). In PHP 4 its value is always lowercased.\n" +
            "5 \t\n" +
            "\n" +
            "__METHOD__\n" +
            "\n" +
            "The class method name. (Added in PHP 5.0.0) The method name is returned as it was declared (case-sensitive).\n";
    String operator = "\n" +
            "\n" +
            "What is Operator? Simple answer can be given using expression 4 + 5 is equal to 9. Here 4 and 5 are called operands and + is called operator. PHP language supports following type of operators.\n" +
            "\n" +
            "    Arithmetic Operators\n" +
            "    Comparison Operators\n" +
            "    Logical (or Relational) Operators\n" +
            "    Assignment Operators\n" +
            "    Conditional (or ternary) Operators\n" +
            "\n" +
            "Lets have a look on all operators one by one.\n" +
            "Arithmetic Operators\n" +
            "\n" +
            "There are following arithmetic operators supported by PHP language −\n" +
            "\n" +
            "Assume variable A holds 10 and variable B holds 20 then −\n" +
            "\n" +
            "Show Examples\n" +
            "Operator \tDescription \tExample\n" +
            "+ \tAdds two operands \tA + B will give 30\n" +
            "- \tSubtracts second operand from the first \tA - B will give -10\n" +
            "* \tMultiply both operands \tA * B will give 200\n" +
            "/ \tDivide numerator by de-numerator \tB / A will give 2\n" +
            "% \tModulus Operator and remainder of after an integer division \tB % A will give 0\n" +
            "++ \tIncrement operator, increases integer value by one \tA++ will give 11\n" +
            "-- \tDecrement operator, decreases integer value by one \tA-- will give 9\n" +
            "Comparison Operators\n" +
            "\n" +
            "There are following comparison operators supported by PHP language\n" +
            "\n" +
            "Assume variable A holds 10 and variable B holds 20 then −\n" +
            "\n" +
            "Show Examples\n" +
            "Operator \tDescription \tExample\n" +
            "== \tChecks if the value of two operands are equal or not, if yes then condition becomes true. \t(A == B) is not true.\n" +
            "!= \tChecks if the value of two operands are equal or not, if values are not equal then condition becomes true. \t(A != B) is true.\n" +
            "> \tChecks if the value of left operand is greater than the value of right operand, if yes then condition becomes true. \t(A > B) is not true.\n" +
            "< \tChecks if the value of left operand is less than the value of right operand, if yes then condition becomes true. \t(A < B) is true.\n" +
            ">= \tChecks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true. \t(A >= B) is not true.\n" +
            "<= \tChecks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true. \t(A <= B) is true.\n" +
            "Logical Operators\n" +
            "\n" +
            "There are following logical operators supported by PHP language\n" +
            "\n" +
            "Assume variable A holds 10 and variable B holds 20 then −\n" +
            "\n" +
            "Show Examples\n" +
            "Operator \tDescription \tExample\n" +
            "and \tCalled Logical AND operator. If both the operands are true then condition becomes true. \t(A and B) is true.\n" +
            "or \tCalled Logical OR Operator. If any of the two operands are non zero then condition becomes true. \t(A or B) is true.\n" +
            "&& \tCalled Logical AND operator. If both the operands are non zero then condition becomes true. \t(A && B) is true.\n" +
            "|| \tCalled Logical OR Operator. If any of the two operands are non zero then condition becomes true. \t(A || B) is true.\n" +
            "! \tCalled Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false. \t!(A && B) is false.\n" +
            "Assignment Operators\n" +
            "\n" +
            "There are following assignment operators supported by PHP language −\n" +
            "\n" +
            "Show Examples\n" +
            "Operator \tDescription \tExample\n" +
            "= \tSimple assignment operator, Assigns values from right side operands to left side operand \tC = A + B will assign value of A + B into C\n" +
            "+= \tAdd AND assignment operator, It adds right operand to the left operand and assign the result to left operand \tC += A is equivalent to C = C + A\n" +
            "-= \tSubtract AND assignment operator, It subtracts right operand from the left operand and assign the result to left operand \tC -= A is equivalent to C = C - A\n" +
            "*= \tMultiply AND assignment operator, It multiplies right operand with the left operand and assign the result to left operand \tC *= A is equivalent to C = C * A\n" +
            "/= \tDivide AND assignment operator, It divides left operand with the right operand and assign the result to left operand \tC /= A is equivalent to C = C / A\n" +
            "%= \tModulus AND assignment operator, It takes modulus using two operands and assign the result to left operand \tC %= A is equivalent to C = C % A\n" +
            "Conditional Operator\n" +
            "\n" +
            "There is one more operator called conditional operator. This first evaluates an expression for a true or false value and then execute one of the two given statements depending upon the result of the evaluation. The conditional operator has this syntax −\n" +
            "\n" +
            "Show Examples\n" +
            "Operator \tDescription \tExample\n" +
            "? : \tConditional Expression \tIf Condition is true ? Then value X : Otherwise value Y\n" +
            "Operators Categories\n" +
            "\n" +
            "All the operators we have discussed above can be categorised into following categories −\n" +
            "\n" +
            "    Unary prefix operators, which precede a single operand.\n" +
            "\n" +
            "    Binary operators, which take two operands and perform a variety of arithmetic and logical operations.\n" +
            "\n" +
            "    The conditional operator (a ternary operator), which takes three operands and evaluates either the second or third expression, depending on the evaluation of the first expression.\n" +
            "\n" +
            "    Assignment operators, which assign a value to a variable.\n" +
            "\n" +
            "Precedence of PHP Operators\n" +
            "\n" +
            "Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated. Certain operators have higher precedence than others; for example, the multiplication operator has higher precedence than the addition operator −\n" +
            "\n" +
            "For example x = 7 + 3 * 2; Here x is assigned 13, not 20 because operator * has higher precedence than + so it first get multiplied with 3*2 and then adds into 7.\n" +
            "\n" +
            "Here operators with the highest precedence appear at the top of the table, those with the lowest appear at the bottom. Within an expression, higher precedence operators will be evaluated first.\n" +
            "Category \tOperator \tAssociativity\n" +
            "Unary \t! ++ -- \tRight to left\n" +
            "Multiplicative \t* / % \tLeft to right\n" +
            "Additive \t+ - \tLeft to right\n" +
            "Relational \t< <= > >= \tLeft to right\n" +
            "Equality \t== != \tLeft to right\n" +
            "Logical AND \t&& \tLeft to right\n" +
            "Logical OR \t|| \tLeft to right\n" +
            "Conditional \t?: \tRight to left\n" +
            "Assignment \t= += -= *= /= %= \tRight to left\n";
    String decision = "\n" +
            "\n" +
            "The if, elseif ...else and switch statements are used to take decision based on the different condition.\n" +
            "\n" +
            "You can use conditional statements in your code to make your decisions. PHP supports following three decision making statements −\n" +
            "Decision making statements in PHP\n" +
            "\n" +
            "    if...else statement − use this statement if you want to execute a set of code when a condition is true and another if the condition is not true\n" +
            "\n" +
            "    elseif statement − is used with the if...else statement to execute a set of code if one of the several condition is true\n" +
            "\n" +
            "    switch statement − is used if you want to select one of many blocks of code to be executed, use the Switch statement. The switch statement is used to avoid long blocks of if..elseif..else code.\n" +
            "\n" +
            "The If...Else Statement\n" +
            "\n" +
            "If you want to execute some code if a condition is true and another code if a condition is false, use the if....else statement.\n" +
            "Syntax\n" +
            "\n" +
            "if (condition)\n" +
            "   code to be executed if condition is true;\n" +
            "else\n" +
            "   code to be executed if condition is false;\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "The following example will output \"Have a nice weekend!\" if the current day is Friday, Otherwise, it will output \"Have a nice day!\":\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $d = date(\"D\");\n" +
            "         \n" +
            "         if ($d == \"Fri\")\n" +
            "            echo \"Have a nice weekend!\"; \n" +
            "         \n" +
            "         else\n" +
            "            echo \"Have a nice day!\"; \n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "Have a nice weekend!\n" +
            "\n" +
            "The ElseIf Statement\n" +
            "\n" +
            "If you want to execute some code if one of the several conditions are true use the elseif statement\n" +
            "Syntax\n" +
            "\n" +
            "if (condition)\n" +
            "   code to be executed if condition is true;\n" +
            "elseif (condition)\n" +
            "   code to be executed if condition is true;\n" +
            "else\n" +
            "   code to be executed if condition is false;\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "The following example will output \"Have a nice weekend!\" if the current day is Friday, and \"Have a nice Sunday!\" if the current day is Sunday. Otherwise, it will output \"Have a nice day!\" −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $d = date(\"D\");\n" +
            "         \n" +
            "         if ($d == \"Fri\")\n" +
            "            echo \"Have a nice weekend!\";\n" +
            "         \n" +
            "         elseif ($d == \"Sun\")\n" +
            "            echo \"Have a nice Sunday!\"; \n" +
            "         \n" +
            "         else\n" +
            "            echo \"Have a nice day!\"; \n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "Have a nice Weekend!\n" +
            "\n" +
            "The Switch Statement\n" +
            "\n" +
            "If you want to select one of many blocks of code to be executed, use the Switch statement.\n" +
            "\n" +
            "The switch statement is used to avoid long blocks of if..elseif..else code.\n" +
            "Syntax\n" +
            "\n" +
            "switch (expression){\n" +
            "   case label1:\n" +
            "      code to be executed if expression = label1;\n" +
            "      break;  \n" +
            "   \n" +
            "   case label2:\n" +
            "      code to be executed if expression = label2;\n" +
            "      break;\n" +
            "      default:\n" +
            "   \n" +
            "   code to be executed\n" +
            "   if expression is different \n" +
            "   from both label1 and label2;\n" +
            "}\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "The switch statement works in an unusual way. First it evaluates given expression then seeks a lable to match the resulting value. If a matching value is found then the code associated with the matching label will be executed or if none of the lable matches then statement will execute any specified default code.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $d = date(\"D\");\n" +
            "         \n" +
            "         switch ($d){\n" +
            "            case \"Mon\":\n" +
            "               echo \"Today is Monday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Tue\":\n" +
            "               echo \"Today is Tuesday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Wed\":\n" +
            "               echo \"Today is Wednesday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Thu\":\n" +
            "               echo \"Today is Thursday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Fri\":\n" +
            "               echo \"Today is Friday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Sat\":\n" +
            "               echo \"Today is Saturday\";\n" +
            "               break;\n" +
            "            \n" +
            "            case \"Sun\":\n" +
            "               echo \"Today is Sunday\";\n" +
            "               break;\n" +
            "            \n" +
            "            default:\n" +
            "               echo \"Wonder which day is this ?\";\n" +
            "         }\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "Today is Monday\n" +
            "\n";
    String loop = "\n" +
            "\n" +
            "Loops in PHP are used to execute the same block of code a specified number of times. PHP supports following four loop types.\n" +
            "\n" +
            "    for − loops through a block of code a specified number of times.\n" +
            "\n" +
            "    while − loops through a block of code if and as long as a specified condition is true.\n" +
            "\n" +
            "    do...while − loops through a block of code once, and then repeats the loop as long as a special condition is true.\n" +
            "\n" +
            "    foreach − loops through a block of code for each element in an array.\n" +
            "\n" +
            "We will discuss about continue and break keywords used to control the loops execution.\n" +
            "The for loop statement\n" +
            "\n" +
            "The for statement is used when you know how many times you want to execute a statement or a block of statements.\n" +
            "for loop in Php\n" +
            "Syntax\n" +
            "\n" +
            "for (initialization; condition; increment){\n" +
            "   code to be executed;\n" +
            "}\n" +
            "\n" +
            "The initializer is used to set the start value for the counter of the number of loop iterations. A variable may be declared here for this purpose and it is traditional to name it $i.\n" +
            "Example\n" +
            "\n" +
            "The following example makes five iterations and changes the assigned value of two variables on each pass of the loop −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $a = 0;\n" +
            "         $b = 0;\n" +
            "         \n" +
            "         for( $i = 0; $i<5; $i++ ) {\n" +
            "            $a += 10;\n" +
            "            $b += 5;\n" +
            "         }\n" +
            "         \n" +
            "         echo (\"At the end of the loop a = $a and b = $b\" );\n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "At the end of the loop a = 50 and b = 25\n" +
            "\n" +
            "The while loop statement\n" +
            "\n" +
            "The while statement will execute a block of code if and as long as a test expression is true.\n" +
            "\n" +
            "If the test expression is true then the code block will be executed. After the code has executed the test expression will again be evaluated and the loop will continue until the test expression is found to be false.\n" +
            "for loop in PHP\n" +
            "Syntax\n" +
            "\n" +
            "while (condition) {\n" +
            "   code to be executed;\n" +
            "}\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "This example decrements a variable value on each iteration of the loop and the counter increments until it reaches 10 when the evaluation is false and the loop ends.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $i = 0;\n" +
            "         $num = 50;\n" +
            "         \n" +
            "         while( $i < 10) {\n" +
            "            $num--;\n" +
            "            $i++;\n" +
            "         }\n" +
            "         \n" +
            "         echo (\"Loop stopped at i = $i and num = $num\" );\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Loop stopped at i = 10 and num = 40 \n" +
            "\n" +
            "The do...while loop statement\n" +
            "\n" +
            "The do...while statement will execute a block of code at least once - it then will repeat the loop as long as a condition is true.\n" +
            "Syntax\n" +
            "\n" +
            "do {\n" +
            "   code to be executed;\n" +
            "}\n" +
            "while (condition);\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "The following example will increment the value of i at least once, and it will continue incrementing the variable i as long as it has a value of less than 10 −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $i = 0;\n" +
            "         $num = 0;\n" +
            "         \n" +
            "         do {\n" +
            "            $i++;\n" +
            "         }\n" +
            "         \n" +
            "         while( $i < 10 );\n" +
            "         echo (\"Loop stopped at i = $i\" );\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Loop stopped at i = 10\n" +
            "\n" +
            "The foreach loop statement\n" +
            "\n" +
            "The foreach statement is used to loop through arrays. For each pass the value of the current array element is assigned to $value and the array pointer is moved by one and in the next pass next element will be processed.\n" +
            "Syntax\n" +
            "\n" +
            "foreach (array as value) {\n" +
            "   code to be executed;\n" +
            "}\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "Try out following example to list out the values of an array.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $array = array( 1, 2, 3, 4, 5);\n" +
            "         \n" +
            "         foreach( $array as $value ) {\n" +
            "            echo \"Value is $value <br />\";\n" +
            "         }\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Value is 1\n" +
            "Value is 2\n" +
            "Value is 3\n" +
            "Value is 4\n" +
            "Value is 5\n" +
            "\n" +
            "The break statement\n" +
            "\n" +
            "The PHP break keyword is used to terminate the execution of a loop prematurely.\n" +
            "\n" +
            "The break statement is situated inside the statement block. It gives you full control and whenever you want to exit from the loop you can come out. After coming out of a loop immediate statement to the loop will be executed.\n" +
            "PHP Break Statement\n" +
            "Example\n" +
            "\n" +
            "In the following example condition test becomes true when the counter value reaches 3 and loop terminates.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $i = 0;\n" +
            "         \n" +
            "         while( $i < 10) {\n" +
            "            $i++;\n" +
            "            if( $i == 3 )break;\n" +
            "         }\n" +
            "         echo (\"Loop stopped at i = $i\" );\n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Loop stopped at i = 3\n" +
            "\n" +
            "The continue statement\n" +
            "\n" +
            "The PHP continue keyword is used to halt the current iteration of a loop but it does not terminate the loop.\n" +
            "\n" +
            "Just like the break statement the continue statement is situated inside the statement block containing the code that the loop executes, preceded by a conditional test. For the pass encountering continue statement, rest of the loop code is skipped and next pass starts.\n" +
            "PHP Continue Statement\n" +
            "Example\n" +
            "\n" +
            "In the following example loop prints the value of array but for which condition becomes true it just skip the code and next value is printed.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         $array = array( 1, 2, 3, 4, 5);\n" +
            "         \n" +
            "         foreach( $array as $value ) {\n" +
            "            if( $value == 3 )continue;\n" +
            "            echo \"Value is $value <br />\";\n" +
            "         }\n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Value is 1\n" +
            "Value is 2\n" +
            "Value is 4\n" +
            "Value is 5\n" +
            "\n";
    String arrayss = "\n" +
            "\n" +
            "An array is a data structure that stores one or more similar type of values in a single value. For example if you want to store 100 numbers then instead of defining 100 variables its easy to define an array of 100 length.\n" +
            "\n" +
            "There are three different kind of arrays and each array value is accessed using an ID c which is called array index.\n" +
            "\n" +
            "    Numeric array − An array with a numeric index. Values are stored and accessed in linear fashion.\n" +
            "\n" +
            "    Associative array − An array with strings as index. This stores element values in association with key values rather than in a strict linear index order.\n" +
            "\n" +
            "    Multidimensional array − An array containing one or more arrays and values are accessed using multiple indices\n" +
            "\n" +
            "NOTE − Built-in array functions is given in function reference PHP Array Functions\n" +
            "Numeric Array\n" +
            "\n" +
            "These arrays can store numbers, strings and any object but their index will be represented by numbers. By default array index starts from zero.\n" +
            "Example\n" +
            "\n" +
            "Following is the example showing how to create and access numeric arrays.\n" +
            "\n" +
            "Here we have used array() function to create array. This function is explained in function reference.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         /* First method to create array. */\n" +
            "         $numbers = array( 1, 2, 3, 4, 5);\n" +
            "         \n" +
            "         foreach( $numbers as $value ) {\n" +
            "            echo \"Value is $value <br />\";\n" +
            "         }\n" +
            "         \n" +
            "         /* Second method to create array. */\n" +
            "         $numbers[0] = \"one\";\n" +
            "         $numbers[1] = \"two\";\n" +
            "         $numbers[2] = \"three\";\n" +
            "         $numbers[3] = \"four\";\n" +
            "         $numbers[4] = \"five\";\n" +
            "         \n" +
            "         foreach( $numbers as $value ) {\n" +
            "            echo \"Value is $value <br />\";\n" +
            "         }\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Value is 1 \n" +
            "Value is 2 \n" +
            "Value is 3 \n" +
            "Value is 4 \n" +
            "Value is 5 \n" +
            "Value is one \n" +
            "Value is two \n" +
            "Value is three \n" +
            "Value is four \n" +
            "Value is five \n" +
            "\n" +
            "Associative Arrays\n" +
            "\n" +
            "The associative arrays are very similar to numeric arrays in term of functionality but they are different in terms of their index. Associative array will have their index as string so that you can establish a strong association between key and values.\n" +
            "\n" +
            "To store the salaries of employees in an array, a numerically indexed array would not be the best choice. Instead, we could use the employees names as the keys in our associative array, and the value would be their respective salary.\n" +
            "\n" +
            "NOTE − Don't keep associative array inside double quote while printing otherwise it would not return any value.\n" +
            "Example\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         /* First method to associate create array. */\n" +
            "         $salaries = array(\"mohammad\" => 2000, \"qadir\" => 1000, \"zara\" => 500);\n" +
            "         \n" +
            "         echo \"Salary of mohammad is \". $salaries['mohammad'] . \"<br />\";\n" +
            "         echo \"Salary of qadir is \".  $salaries['qadir']. \"<br />\";\n" +
            "         echo \"Salary of zara is \".  $salaries['zara']. \"<br />\";\n" +
            "         \n" +
            "         /* Second method to create array. */\n" +
            "         $salaries['mohammad'] = \"high\";\n" +
            "         $salaries['qadir'] = \"medium\";\n" +
            "         $salaries['zara'] = \"low\";\n" +
            "         \n" +
            "         echo \"Salary of mohammad is \". $salaries['mohammad'] . \"<br />\";\n" +
            "         echo \"Salary of qadir is \".  $salaries['qadir']. \"<br />\";\n" +
            "         echo \"Salary of zara is \".  $salaries['zara']. \"<br />\";\n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Salary of mohammad is 2000\n" +
            "Salary of qadir is 1000\n" +
            "Salary of zara is 500\n" +
            "Salary of mohammad is high\n" +
            "Salary of qadir is medium\n" +
            "Salary of zara is low\n" +
            "\n" +
            "Multidimensional Arrays\n" +
            "\n" +
            "A multi-dimensional array each element in the main array can also be an array. And each element in the sub-array can be an array, and so on. Values in the multi-dimensional array are accessed using multiple index.\n" +
            "Example\n" +
            "\n" +
            "In this example we create a two dimensional array to store marks of three students in three subjects −\n" +
            "\n" +
            "This example is an associative array, you can create numeric array in the same fashion.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $marks = array( \n" +
            "            \"mohammad\" => array (\n" +
            "               \"physics\" => 35,\n" +
            "               \"maths\" => 30,\t\n" +
            "               \"chemistry\" => 39\n" +
            "            ),\n" +
            "            \n" +
            "            \"qadir\" => array (\n" +
            "               \"physics\" => 30,\n" +
            "               \"maths\" => 32,\n" +
            "               \"chemistry\" => 29\n" +
            "            ),\n" +
            "            \n" +
            "            \"zara\" => array (\n" +
            "               \"physics\" => 31,\n" +
            "               \"maths\" => 22,\n" +
            "               \"chemistry\" => 39\n" +
            "            )\n" +
            "         );\n" +
            "         \n" +
            "         /* Accessing multi-dimensional array values */\n" +
            "         echo \"Marks for mohammad in physics : \" ;\n" +
            "         echo $marks['mohammad']['physics'] . \"<br />\"; \n" +
            "         \n" +
            "         echo \"Marks for qadir in maths : \";\n" +
            "         echo $marks['qadir']['maths'] . \"<br />\"; \n" +
            "         \n" +
            "         echo \"Marks for zara in chemistry : \" ;\n" +
            "         echo $marks['zara']['chemistry'] . \"<br />\"; \n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Marks for mohammad in physics : 35\n" +
            "Marks for qadir in maths : 32\n" +
            "Marks for zara in chemistry : 39\n" +
            "\n";
    String string = "\n" +
            "\n" +
            "They are sequences of characters, like \"PHP supports string operations\".\n" +
            "\n" +
            "NOTE − Built-in string functions is given in function reference PHP String Functions\n" +
            "\n" +
            "Following are valid examples of string\n" +
            "\n" +
            "$string_1 = \"This is a string in double quotes\";\n" +
            "$string_2 = \"This is a somewhat longer, singly quoted string\";\n" +
            "$string_39 = \"This string has thirty-nine characters\";\n" +
            "$string_0 = \"\"; // a string with zero characters\n" +
            "\n" +
            "Singly quoted strings are treated almost literally, whereas doubly quoted strings replace variables with their values as well as specially interpreting certain character sequences.\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   $variable = \"name\";\n" +
            "   $literally = 'My $variable will not print!\\\\n';\n" +
            "   \n" +
            "   print($literally);\n" +
            "   print \"<br />\";\n" +
            "   \n" +
            "   $literally = \"My $variable will print!\\\\n\";\n" +
            "   \n" +
            "   print($literally);\n" +
            "?>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "My $variable will not print!\\n\n" +
            "My name will print!\\n\n" +
            "\n" +
            "There are no artificial limits on string length - within the bounds of available memory, you ought to be able to make arbitrarily long strings.\n" +
            "\n" +
            "Strings that are delimited by double quotes (as in \"this\") are preprocessed in both the following two ways by PHP −\n" +
            "\n" +
            "    Certain character sequences beginning with backslash (\\) are replaced with special characters\n" +
            "\n" +
            "    Variable names (starting with $) are replaced with string representations of their values.\n" +
            "\n" +
            "The escape-sequence replacements are −\n" +
            "\n" +
            "    \\n is replaced by the newline character\n" +
            "    \\r is replaced by the carriage-return character\n" +
            "    \\t is replaced by the tab character\n" +
            "    \\$ is replaced by the dollar sign itself ($)\n" +
            "    \\\" is replaced by a single double-quote (\")\n" +
            "    \\\\ is replaced by a single backslash (\\)\n" +
            "\n" +
            "String Concatenation Operator\n" +
            "\n" +
            "To concatenate two string variables together, use the dot (.) operator −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   $string1=\"Hello World\";\n" +
            "   $string2=\"1234\";\n" +
            "   \n" +
            "   echo $string1 . \" \" . $string2;\n" +
            "?>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "Hello World 1234\n" +
            "\n" +
            "If we look at the code above you see that we used the concatenation operator two times. This is because we had to insert a third string.\n" +
            "\n" +
            "Between the two string variables we added a string with a single character, an empty space, to separate the two variables.\n" +
            "Using the strlen() function\n" +
            "\n" +
            "The strlen() function is used to find the length of a string.\n" +
            "\n" +
            "Let's find the length of our string \"Hello world!\" −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   echo strlen(\"Hello world!\");\n" +
            "?>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "12\n" +
            "\n" +
            "The length of a string is often used in loops or other functions, when it is important to know when the string ends. (i.e. in a loop, we would want to stop the loop after the last character in the string)\n" +
            "Using the strpos() function\n" +
            "\n" +
            "The strpos() function is used to search for a string or character within a string.\n" +
            "\n" +
            "If a match is found in the string, this function will return the position of the first match. If no match is found, it will return FALSE.\n" +
            "\n" +
            "Let's see if we can find the string \"world\" in our string −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   echo strpos(\"Hello world!\",\"world\");\n" +
            "?>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            " 6\n" +
            "\n" +
            "As you see the position of the string \"world\" in our string is position 6. The reason that it is 6, and not 7, is that the first position in the string is 0, and not 1.\n";
    String web = "\n" +
            "\n" +
            "This session demonstrates how PHP can provide dynamic content according to browser type, randomly generated numbers or User Input. It also demonstrated how the client browser can be redirected.\n" +
            "Identifying Browser & Platform\n" +
            "\n" +
            "PHP creates some useful environment variables that can be seen in the phpinfo.php page that was used to setup the PHP environment.\n" +
            "\n" +
            "One of the environment variables set by PHP is HTTP_USER_AGENT which identifies the user's browser and operating system.\n" +
            "\n" +
            "PHP provides a function getenv() to access the value of all the environment variables. The information contained in the HTTP_USER_AGENT environment variable can be used to create dynamic content appropriate to the browser.\n" +
            "\n" +
            "Following example demonstrates how you can identify a client browser and operating system.\n" +
            "\n" +
            "NOTE − The function preg_match()is discussed in PHP Regular expression session.\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         function getBrowser() { \n" +
            "            $u_agent = $_SERVER['HTTP_USER_AGENT']; \n" +
            "            $bname = 'Unknown';\n" +
            "            $platform = 'Unknown';\n" +
            "            $version = \"\";\n" +
            "            \n" +
            "            //First get the platform?\n" +
            "            if (preg_match('/linux/i', $u_agent)) {\n" +
            "               $platform = 'linux';\n" +
            "            }elseif (preg_match('/macintosh|mac os x/i', $u_agent)) {\n" +
            "               $platform = 'mac';\n" +
            "            }elseif (preg_match('/windows|win32/i', $u_agent)) {\n" +
            "               $platform = 'windows';\n" +
            "            }\n" +
            "            \n" +
            "            // Next get the name of the useragent yes seperately and for good reason\n" +
            "            if(preg_match('/MSIE/i',$u_agent) && !preg_match('/Opera/i',$u_agent)) {\n" +
            "               $bname = 'Internet Explorer';\n" +
            "               $ub = \"MSIE\";\n" +
            "            } elseif(preg_match('/Firefox/i',$u_agent)) {\n" +
            "               $bname = 'Mozilla Firefox';\n" +
            "               $ub = \"Firefox\";\n" +
            "            } elseif(preg_match('/Chrome/i',$u_agent)) {\n" +
            "               $bname = 'Google Chrome';\n" +
            "               $ub = \"Chrome\";\n" +
            "            }elseif(preg_match('/Safari/i',$u_agent)) {\n" +
            "               $bname = 'Apple Safari';\n" +
            "               $ub = \"Safari\";\n" +
            "            }elseif(preg_match('/Opera/i',$u_agent)) {\n" +
            "               $bname = 'Opera';\n" +
            "               $ub = \"Opera\";\n" +
            "            }elseif(preg_match('/Netscape/i',$u_agent)) {\n" +
            "               $bname = 'Netscape';\n" +
            "               $ub = \"Netscape\";\n" +
            "            }\n" +
            "            \n" +
            "            // finally get the correct version number\n" +
            "            $known = array('Version', $ub, 'other');\n" +
            "            $pattern = '#(?<browser>' . join('|', $known) . ')[/ ]+(?<version>[0-9.|a-zA-Z.]*)#';\n" +
            "            \n" +
            "            if (!preg_match_all($pattern, $u_agent, $matches)) {\n" +
            "               // we have no matching number just continue\n" +
            "            }\n" +
            "            \n" +
            "            // see how many we have\n" +
            "            $i = count($matches['browser']);\n" +
            "            \n" +
            "            if ($i != 1) {\n" +
            "               //we will have two since we are not using 'other' argument yet\n" +
            "               \n" +
            "               //see if version is before or after the name\n" +
            "               if (strripos($u_agent,\"Version\") < strripos($u_agent,$ub)){\n" +
            "                  $version= $matches['version'][0];\n" +
            "               }else {\n" +
            "                  $version= $matches['version'][1];\n" +
            "               }\n" +
            "            }else {\n" +
            "               $version= $matches['version'][0];\n" +
            "            }\n" +
            "            \n" +
            "            // check if we have a number\n" +
            "            if ($version == null || $version == \"\") {$version = \"?\";}\n" +
            "            return array(\n" +
            "               'userAgent' => $u_agent,\n" +
            "               'name'      => $bname,\n" +
            "               'version'   => $version,\n" +
            "               'platform'  => $platform,\n" +
            "               'pattern'   => $pattern\n" +
            "            );\n" +
            "         }\n" +
            "         \n" +
            "         // now try it\n" +
            "         $ua = getBrowser();\n" +
            "         $yourbrowser = \"Your browser: \" . $ua['name'] . \" \" . $ua['version'] .\n" +
            "            \" on \" .$ua['platform'] . \" reports: <br >\" . $ua['userAgent'];\n" +
            "         \n" +
            "         print_r($yourbrowser);\n" +
            "      ?>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This is producing following result on my machine. This result may be different for your computer depending on what you are using.\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "Your browser: Google Chrome 54.0.2840.99 on windows reports: \n" +
            "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) \n" +
            "   Chrome/54.0.2840.99 Safari/537.36\n" +
            "\n" +
            "Display Images Randomly\n" +
            "\n" +
            "The PHP rand() function is used to generate a random number.i This function can generate numbers with-in a given range. The random number generator should be seeded to prevent a regular pattern of numbers being generated. This is achieved using the srand() function that specifies the seed number as its argument.\n" +
            "\n" +
            "Following example demonstrates how you can display different image each time out of four images −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         srand( microtime() * 1000000 );\n" +
            "         $num = rand( 1, 4 );\n" +
            "         \n" +
            "         switch( $num ) {\n" +
            "            case 1: $image_file = \"/php/images/logo.png\";\n" +
            "               break;\n" +
            "            \n" +
            "            case 2: $image_file = \"/php/images/php.jpg\";\n" +
            "               break;\n" +
            "            \n" +
            "            case 3: $image_file = \"/php/images/logo.png\";\n" +
            "               break;\n" +
            "            \n" +
            "            case 4: $image_file = \"/php/images/php.jpg\";\n" +
            "               break;\n" +
            "         }\n" +
            "         echo \"Random Image : <img src=$image_file />\";\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Display Image Randomly\n" +
            "Using HTML Forms\n" +
            "\n" +
            "The most important thing to notice when dealing with HTML forms and PHP is that any form element in an HTML page will automatically be available to your PHP scripts.\n" +
            "\n" +
            "Try out following example by putting the source code in test.php script.\n" +
            "\n" +
            "<?php\n" +
            "   if( $_POST[\"name\"] || $_POST[\"age\"] ) {\n" +
            "      if (preg_match(\"/[^A-Za-z'-]/\",$_POST['name'] )) {\n" +
            "         die (\"invalid name and name should be alpha\");\n" +
            "      }\n" +
            "      \n" +
            "      echo \"Welcome \". $_POST['name']. \"<br />\";\n" +
            "      echo \"You are \". $_POST['age']. \" years old.\";\n" +
            "      \n" +
            "      exit();\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <form action = \"<?php $_PHP_SELF ?>\" method = \"POST\">\n" +
            "         Name: <input type = \"text\" name = \"name\" />\n" +
            "         Age: <input type = \"text\" name = \"age\" />\n" +
            "         <input type = \"submit\" />\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Forms\n" +
            "\n" +
            "    The PHP default variable $_PHP_SELF is used for the PHP script name and when you click \"submit\" button then same PHP script will be called and will produce following result −\n" +
            "\n" +
            "    The method = \"POST\" is used to post user data to the server script. There are two methods of posting data to the server script which are discussed in PHP GET & POST chapter.\n" +
            "\n" +
            "Browser Redirection\n" +
            "\n" +
            "The PHP header() function supplies raw HTTP headers to the browser and can be used to redirect it to another location. The redirection script should be at the very top of the page to prevent any other part of the page from loading.\n" +
            "\n" +
            "The target is specified by the Location: header as the argument to the header() function. After calling this function the exit() function can be used to halt parsing of rest of the code.\n" +
            "\n" +
            "Following example demonstrates how you can redirect a browser request to another web page. Try out this example by putting the source code in test.php script.\n" +
            "\n" +
            "<?php\n" +
            "   if( $_POST[\"location\"] ) {\n" +
            "      $location = $_POST[\"location\"];\n" +
            "      header( \"Location:$location\" );\n" +
            "      \n" +
            "      exit();\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <p>Choose a site to visit :</p>\n" +
            "      \n" +
            "      <form action = \"<?php $_SERVER['PHP_SELF'] ?>\" method =\"POST\">\n" +
            "         <select name = \"location\">.\n" +
            "         \n" +
            "            <option value = \"http://www.tutorialspoint.com\">\n" +
            "               Tutorialspoint.com\n" +
            "            </option>\n" +
            "         \n" +
            "            <option value = \"http://www.google.com\">\n" +
            "               Google Search Page\n" +
            "            </option>\n" +
            "         \n" +
            "         </select>\n" +
            "         <input type = \"submit\" />\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Browser Redirection ";
    String get_post = "\n" +
            "\n" +
            "There are two ways the browser client can send information to the web server.\n" +
            "\n" +
            "    The GET Method\n" +
            "    The POST Method\n" +
            "\n" +
            "Before the browser sends the information, it encodes it using a scheme called URL encoding. In this scheme, name/value pairs are joined with equal signs and different pairs are separated by the ampersand.\n" +
            "\n" +
            "name1=value1&name2=value2&name3=value3\n" +
            "\n" +
            "Spaces are removed and replaced with the + character and any other nonalphanumeric characters are replaced with a hexadecimal values. After the information is encoded it is sent to the server.\n" +
            "The GET Method\n" +
            "\n" +
            "The GET method sends the encoded user information appended to the page request. The page and the encoded information are separated by the ? character.\n" +
            "\n" +
            "http://www.test.com/index.htm?name1=value1&name2=value2\n" +
            "\n" +
            "    The GET method produces a long string that appears in your server logs, in the browser's Location: box.\n" +
            "\n" +
            "    The GET method is restricted to send upto 1024 characters only.\n" +
            "\n" +
            "    Never use GET method if you have password or other sensitive information to be sent to the server.\n" +
            "\n" +
            "    GET can't be used to send binary data, like images or word documents, to the server.\n" +
            "\n" +
            "    The data sent by GET method can be accessed using QUERY_STRING environment variable.\n" +
            "\n" +
            "    The PHP provides $_GET associative array to access all the sent information using GET method.\n" +
            "\n" +
            "Try out following example by putting the source code in test.php script.\n" +
            "\n" +
            "<?php\n" +
            "   if( $_GET[\"name\"] || $_GET[\"age\"] ) {\n" +
            "      echo \"Welcome \". $_GET['name']. \"<br />\";\n" +
            "      echo \"You are \". $_GET['age']. \" years old.\";\n" +
            "      \n" +
            "      exit();\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <form action = \"<?php $_PHP_SELF ?>\" method = \"GET\">\n" +
            "         Name: <input type = \"text\" name = \"name\" />\n" +
            "         Age: <input type = \"text\" name = \"age\" />\n" +
            "         <input type = \"submit\" />\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Forms\n" +
            "The POST Method\n" +
            "\n" +
            "The POST method transfers information via HTTP headers. The information is encoded as described in case of GET method and put into a header called QUERY_STRING.\n" +
            "\n" +
            "    The POST method does not have any restriction on data size to be sent.\n" +
            "\n" +
            "    The POST method can be used to send ASCII as well as binary data.\n" +
            "\n" +
            "    The data sent by POST method goes through HTTP header so security depends on HTTP protocol. By using Secure HTTP you can make sure that your information is secure.\n" +
            "\n" +
            "    The PHP provides $_POST associative array to access all the sent information using POST method.\n" +
            "\n" +
            "Try out following example by putting the source code in test.php script.\n" +
            "\n" +
            "<?php\n" +
            "   if( $_POST[\"name\"] || $_POST[\"age\"] ) {\n" +
            "      if (preg_match(\"/[^A-Za-z'-]/\",$_POST['name'] )) {\n" +
            "         die (\"invalid name and name should be alpha\");\n" +
            "      }\n" +
            "      echo \"Welcome \". $_POST['name']. \"<br />\";\n" +
            "      echo \"You are \". $_POST['age']. \" years old.\";\n" +
            "      \n" +
            "      exit();\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <form action = \"<?php $_PHP_SELF ?>\" method = \"POST\">\n" +
            "         Name: <input type = \"text\" name = \"name\" />\n" +
            "         Age: <input type = \"text\" name = \"age\" />\n" +
            "         <input type = \"submit\" />\n" +
            "      </form>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Forms\n" +
            "The $_REQUEST variable\n" +
            "\n" +
            "The PHP $_REQUEST variable contains the contents of both $_GET, $_POST, and $_COOKIE. We will discuss $_COOKIE variable when we will explain about cookies.\n" +
            "\n" +
            "The PHP $_REQUEST variable can be used to get the result from form data sent with both the GET and POST methods.\n" +
            "\n" +
            "Try out following example by putting the source code in test.php script.\n" +
            "\n" +
            "<?php\n" +
            "   if( $_REQUEST[\"name\"] || $_REQUEST[\"age\"] ) {\n" +
            "      echo \"Welcome \". $_REQUEST['name']. \"<br />\";\n" +
            "      echo \"You are \". $_REQUEST['age']. \" years old.\";\n" +
            "      exit();\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <form action = \"<?php $_PHP_SELF ?>\" method = \"POST\">\n" +
            "         Name: <input type = \"text\" name = \"name\" />\n" +
            "         Age: <input type = \"text\" name = \"age\" />\n" +
            "         <input type = \"submit\" />\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "Here $_PHP_SELF variable contains the name of self script in which it is being called.\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Forms\n";
    String fileinclusion = "\n" +
            "\n" +
            "You can include the content of a PHP file into another PHP file before the server executes it. There are two PHP functions which can be used to included one PHP file into another PHP file.\n" +
            "\n" +
            "    The include() Function\n" +
            "    The require() Function\n" +
            "\n" +
            "This is a strong point of PHP which helps in creating functions, headers, footers, or elements that can be reused on multiple pages. This will help developers to make it easy to change the layout of complete website with minimal effort. If there is any change required then instead of changing thousand of files just change included file.\n" +
            "The include() Function\n" +
            "\n" +
            "The include() function takes all the text in a specified file and copies it into the file that uses the include function. If there is any problem in loading a file then the include() function generates a warning but the script will continue execution.\n" +
            "\n" +
            "Assume you want to create a common menu for your website. Then create a file menu.php with the following content.\n" +
            "\n" +
            "<a href=\"http://www.tutorialspoint.com/index.htm\">Home</a> - \n" +
            "<a href=\"http://www.tutorialspoint.com/ebxml\">ebXML</a> - \n" +
            "<a href=\"http://www.tutorialspoint.com/ajax\">AJAX</a> - \n" +
            "<a href=\"http://www.tutorialspoint.com/perl\">PERL</a> <br />\n" +
            "\n" +
            "Now create as many pages as you like and include this file to create header. For example now your test.php file can have following content.\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php include(\"menu.php\"); ?>\n" +
            "      <p>This is an example to show how to include PHP file!</p>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Include\n" +
            "The require() Function\n" +
            "\n" +
            "The require() function takes all the text in a specified file and copies it into the file that uses the include function. If there is any problem in loading a file then the require() function generates a fatal error and halt the execution of the script.\n" +
            "\n" +
            "So there is no difference in require() and include() except they handle error conditions. It is recommended to use the require() function instead of include(), because scripts should not continue executing if files are missing or misnamed.\n" +
            "\n" +
            "You can try using above example with require() function and it will generate same result. But if you will try following two examples where file does not exist then you will get different results.\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "   \n" +
            "      <?php include(\"xxmenu.php\"); ?>\n" +
            "      <p>This is an example to show how to include wrong PHP file!</p>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce the following result −\n" +
            "\n" +
            "This is an example to show how to include wrong PHP file!\n" +
            "\n" +
            "Now lets try same example with require() function.\n" +
            "\n" +
            "<html>\n" +
            "   <body>\n" +
            "       \n" +
            "       <?php require(\"xxmenu.php\"); ?>\n" +
            "       <p>This is an example to show how to include wrong PHP file!</p>\n" +
            "   \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This time file execution halts and nothing is displayed.\n" +
            "\n" +
            "NOTE − You may get plain warning messages or fatal error messages or nothing at all. This depends on your PHP Server configuration.\n";
    String filesio = "\n" +
            "\n" +
            "This chapter will explain following functions related to files −\n" +
            "\n" +
            "    Opening a file\n" +
            "    Reading a file\n" +
            "    Writing a file\n" +
            "    Closing a file\n" +
            "\n" +
            "Opening and Closing Files\n" +
            "\n" +
            "The PHP fopen() function is used to open a file. It requires two arguments stating first the file name and then mode in which to operate.\n" +
            "\n" +
            "Files modes can be specified as one of the six options in this table.\n" +
            "Sr.No \tMode & Purpose\n" +
            "1 \t\n" +
            "\n" +
            "r\n" +
            "\n" +
            "Opens the file for reading only.\n" +
            "\n" +
            "Places the file pointer at the beginning of the file.\n" +
            "2 \t\n" +
            "\n" +
            "r+\n" +
            "\n" +
            "Opens the file for reading and writing.\n" +
            "\n" +
            "Places the file pointer at the beginning of the file.\n" +
            "3 \t\n" +
            "\n" +
            "w\n" +
            "\n" +
            "Opens the file for writing only.\n" +
            "\n" +
            "Places the file pointer at the beginning of the file.\n" +
            "\n" +
            "and truncates the file to zero length. If files does not\n" +
            "\n" +
            "exist then it attempts to create a file.\n" +
            "4 \t\n" +
            "\n" +
            "w+\n" +
            "\n" +
            "Opens the file for reading and writing only.\n" +
            "\n" +
            "Places the file pointer at the beginning of the file.\n" +
            "\n" +
            "and truncates the file to zero length. If files does not\n" +
            "\n" +
            "exist then it attempts to create a file.\n" +
            "5 \t\n" +
            "\n" +
            "a\n" +
            "\n" +
            "Opens the file for writing only.\n" +
            "\n" +
            "Places the file pointer at the end of the file.\n" +
            "\n" +
            "If files does not exist then it attempts to create a file.\n" +
            "6 \t\n" +
            "\n" +
            "a+\n" +
            "\n" +
            "Opens the file for reading and writing only.\n" +
            "\n" +
            "Places the file pointer at the end of the file.\n" +
            "\n" +
            "If files does not exist then it attempts to create a file.\n" +
            "\n" +
            "If an attempt to open a file fails then fopen returns a value of false otherwise it returns a file pointer which is used for further reading or writing to that file.\n" +
            "\n" +
            "After making a changes to the opened file it is important to close it with the fclose() function. The fclose() function requires a file pointer as its argument and then returns true when the closure succeeds or false if it fails.\n" +
            "Reading a file\n" +
            "\n" +
            "Once a file is opened using fopen() function it can be read with a function called fread(). This function requires two arguments. These must be the file pointer and the length of the file expressed in bytes.\n" +
            "\n" +
            "The files length can be found using the filesize() function which takes the file name as its argument and returns the size of the file expressed in bytes.\n" +
            "\n" +
            "So here are the steps required to read a file with PHP.\n" +
            "\n" +
            "    Open a file using fopen() function.\n" +
            "\n" +
            "    Get the file's length using filesize() function.\n" +
            "\n" +
            "    Read the file's content using fread() function.\n" +
            "\n" +
            "    Close the file with fclose() function.\n" +
            "\n" +
            "The following example assigns the content of a text file to a variable then displays those contents on the web page.\n" +
            "\n" +
            "<html>\n" +
            "\n" +
            "   <head>\n" +
            "      <title>Reading a file using PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $filename = \"tmp.txt\";\n" +
            "         $file = fopen( $filename, \"r\" );\n" +
            "         \n" +
            "         if( $file == false ) {\n" +
            "            echo ( \"Error in opening file\" );\n" +
            "            exit();\n" +
            "         }\n" +
            "         \n" +
            "         $filesize = filesize( $filename );\n" +
            "         $filetext = fread( $file, $filesize );\n" +
            "         fclose( $file );\n" +
            "         \n" +
            "         echo ( \"File size : $filesize bytes\" );\n" +
            "         echo ( \"<pre>$filetext</pre>\" );\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Reading File\n" +
            "Writing a file\n" +
            "\n" +
            "A new file can be written or text can be appended to an existing file using the PHP fwrite() function. This function requires two arguments specifying a file pointer and the string of data that is to be written. Optionally a third integer argument can be included to specify the length of the data to write. If the third argument is included, writing would will stop after the specified length has been reached.\n" +
            "\n" +
            "The following example creates a new text file then writes a short text heading inside it. After closing this file its existence is confirmed using file_exist() function which takes file name as an argument\n" +
            "\n" +
            "<?php\n" +
            "   $filename = \"/home/user/guest/newfile.txt\";\n" +
            "   $file = fopen( $filename, \"w\" );\n" +
            "   \n" +
            "   if( $file == false ) {\n" +
            "      echo ( \"Error in opening new file\" );\n" +
            "      exit();\n" +
            "   }\n" +
            "   fwrite( $file, \"This is  a simple test\\n\" );\n" +
            "   fclose( $file );\n" +
            "?>\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Writing a file using PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $filename = \"newfile.txt\";\n" +
            "         $file = fopen( $filename, \"r\" );\n" +
            "         \n" +
            "         if( $file == false ) {\n" +
            "            echo ( \"Error in opening file\" );\n" +
            "            exit();\n" +
            "         }\n" +
            "         \n" +
            "         $filesize = filesize( $filename );\n" +
            "         $filetext = fread( $file, $filesize );\n" +
            "         \n" +
            "         fclose( $file );\n" +
            "         \n" +
            "         echo ( \"File size : $filesize bytes\" );\n" +
            "         echo ( \"$filetext\" );\n" +
            "         echo(\"file name: $filename\");\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Writing File ";
    String functions ="\n" +
            "\n" +
            "PHP functions are similar to other programming languages. A function is a piece of code which takes one more input in the form of parameter and does some processing and returns a value.\n" +
            "\n" +
            "You already have seen many functions like fopen() and fread() etc. They are built-in functions but PHP gives you option to create your own functions as well.\n" +
            "\n" +
            "There are two parts which should be clear to you −\n" +
            "\n" +
            "    Creating a PHP Function\n" +
            "    Calling a PHP Function\n" +
            "\n" +
            "In fact you hardly need to create your own PHP function because there are already more than 1000 of built-in library functions created for different area and you just need to call them according to your requirement.\n" +
            "\n" +
            "Please refer to PHP Function Reference for a complete set of useful functions.\n" +
            "Creating PHP Function\n" +
            "\n" +
            "Its very easy to create your own PHP function. Suppose you want to create a PHP function which will simply write a simple message on your browser when you will call it. Following example creates a function called writeMessage() and then calls it just after creating it.\n" +
            "\n" +
            "Note that while creating a function its name should start with keyword function and all the PHP code should be put inside { and } braces as shown in the following example below −\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Writing PHP Function</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         /* Defining a PHP Function */\n" +
            "         function writeMessage() {\n" +
            "            echo \"You are really a nice person, Have a nice time!\";\n" +
            "         }\n" +
            "         \n" +
            "         /* Calling a PHP Function */\n" +
            "         writeMessage();\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will display following result −\n" +
            "\n" +
            "You are really a nice person, Have a nice time!\n" +
            "\n" +
            "PHP Functions with Parameters\n" +
            "\n" +
            "PHP gives you option to pass your parameters inside a function. You can pass as many as parameters your like. These parameters work like variables inside your function. Following example takes two integer parameters and add them together and then print them.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Writing PHP Function with Parameters</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         function addFunction($num1, $num2) {\n" +
            "            $sum = $num1 + $num2;\n" +
            "            echo \"Sum of the two numbers is : $sum\";\n" +
            "         }\n" +
            "         \n" +
            "         addFunction(10, 20);\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will display following result −\n" +
            "\n" +
            "Sum of the two numbers is : 30\n" +
            "\n" +
            "Passing Arguments by Reference\n" +
            "\n" +
            "It is possible to pass arguments to functions by reference. This means that a reference to the variable is manipulated by the function rather than a copy of the variable's value.\n" +
            "\n" +
            "Any changes made to an argument in these cases will change the value of the original variable. You can pass an argument by reference by adding an ampersand to the variable name in either the function call or the function definition.\n" +
            "\n" +
            "Following example depicts both the cases.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Passing Argument by Reference</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         function addFive($num) {\n" +
            "            $num += 5;\n" +
            "         }\n" +
            "         \n" +
            "         function addSix(&$num) {\n" +
            "            $num += 6;\n" +
            "         }\n" +
            "         \n" +
            "         $orignum = 10;\n" +
            "         addFive( $orignum );\n" +
            "         \n" +
            "         echo \"Original Value is $orignum<br />\";\n" +
            "         \n" +
            "         addSix( $orignum );\n" +
            "         echo \"Original Value is $orignum<br />\";\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will display following result −\n" +
            "\n" +
            "Original Value is 10\n" +
            "Original Value is 16 \n" +
            "\n" +
            "PHP Functions returning value\n" +
            "\n" +
            "A function can return a value using the return statement in conjunction with a value or object. return stops the execution of the function and sends the value back to the calling code.\n" +
            "\n" +
            "You can return more than one value from a function using return array(1,2,3,4).\n" +
            "\n" +
            "Following example takes two integer parameters and add them together and then returns their sum to the calling program. Note that return keyword is used to return a value from a function.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Writing PHP Function which returns value</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "   \n" +
            "      <?php\n" +
            "         function addFunction($num1, $num2) {\n" +
            "            $sum = $num1 + $num2;\n" +
            "            return $sum;\n" +
            "         }\n" +
            "         $return_value = addFunction(10, 20);\n" +
            "         \n" +
            "         echo \"Returned value from the function : $return_value\";\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will display following result −\n" +
            "\n" +
            "Returned value from the function : 30\n" +
            "\n" +
            "Setting Default Values for Function Parameters\n" +
            "\n" +
            "You can set a parameter to have a default value if the function's caller doesn't pass it.\n" +
            "\n" +
            "Following function prints NULL in case use does not pass any value to this function.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Writing PHP Function which returns value</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         function printMe($param = NULL) {\n" +
            "            print $param;\n" +
            "         }\n" +
            "         \n" +
            "         printMe(\"This is test\");\n" +
            "         printMe();\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will produce following result −\n" +
            "\n" +
            "This is test\n" +
            "\n" +
            "Dynamic Function Calls\n" +
            "\n" +
            "It is possible to assign function names as strings to variables and then treat these variables exactly as you would the function name itself. Following example depicts this behaviour.\n" +
            "Live Demo\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Dynamic Function Calls</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         function sayHello() {\n" +
            "            echo \"Hello<br />\";\n" +
            "         }\n" +
            "         \n" +
            "         $function_holder = \"sayHello\";\n" +
            "         $function_holder();\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "This will display following result −\n" +
            "\n" +
            "Hello\n" +
            "\n";
    String cookies = "Cookies are text files stored on the client computer and they are kept of use tracking purpose. PHP transparently supports HTTP cookies.\n" +
            "\n" +
            "There are three steps involved in identifying returning users −\n" +
            "\n" +
            "    Server script sends a set of cookies to the browser. For example name, age, or identification number etc.\n" +
            "\n" +
            "    Browser stores this information on local machine for future use.\n" +
            "\n" +
            "    When next time browser sends any request to web server then it sends those cookies information to the server and server uses that information to identify the user.\n" +
            "\n" +
            "This chapter will teach you how to set cookies, how to access them and how to delete them.\n" +
            "The Anatomy of a Cookie\n" +
            "\n" +
            "Cookies are usually set in an HTTP header (although JavaScript can also set a cookie directly on a browser). A PHP script that sets a cookie might send headers that look something like this −\n" +
            "\n" +
            "HTTP/1.1 200 OK\n" +
            "Date: Fri, 04 Feb 2000 21:03:38 GMT\n" +
            "Server: Apache/1.3.9 (UNIX) PHP/4.0b3\n" +
            "Set-Cookie: name=xyz; expires=Friday, 04-Feb-07 22:03:38 GMT; \n" +
            "                 path=/; domain=tutorialspoint.com\n" +
            "Connection: close\n" +
            "Content-Type: text/html\n" +
            "\n" +
            "As you can see, the Set-Cookie header contains a name value pair, a GMT date, a path and a domain. The name and value will be URL encoded. The expires field is an instruction to the browser to \"forget\" the cookie after the given time and date.\n" +
            "\n" +
            "If the browser is configured to store cookies, it will then keep this information until the expiry date. If the user points the browser at any page that matches the path and domain of the cookie, it will resend the cookie to the server.The browser's headers might look something like this −\n" +
            "\n" +
            "GET / HTTP/1.0\n" +
            "Connection: Keep-Alive\n" +
            "User-Agent: Mozilla/4.6 (X11; I; Linux 2.2.6-15apmac ppc)\n" +
            "Host: zink.demon.co.uk:1126\n" +
            "Accept: image/gif, */*\n" +
            "Accept-Encoding: gzip\n" +
            "Accept-Language: en\n" +
            "Accept-Charset: iso-8859-1,*,utf-8\n" +
            "Cookie: name=xyz\n" +
            "\n" +
            "A PHP script will then have access to the cookie in the environmental variables $_COOKIE or $HTTP_COOKIE_VARS[] which holds all cookie names and values. Above cookie can be accessed using $HTTP_COOKIE_VARS[\"name\"].\n" +
            "Setting Cookies with PHP\n" +
            "\n" +
            "PHP provided setcookie() function to set a cookie. This function requires upto six arguments and should be called before <html> tag. For each cookie this function has to be called separately.\n" +
            "\n" +
            "setcookie(name, value, expire, path, domain, security);\n" +
            "\n" +
            "Here is the detail of all the arguments −\n" +
            "\n" +
            "    Name − This sets the name of the cookie and is stored in an environment variable called HTTP_COOKIE_VARS. This variable is used while accessing cookies.\n" +
            "\n" +
            "    Value − This sets the value of the named variable and is the content that you actually want to store.\n" +
            "\n" +
            "    Expiry − This specify a future time in seconds since 00:00:00 GMT on 1st Jan 1970. After this time cookie will become inaccessible. If this parameter is not set then cookie will automatically expire when the Web Browser is closed.\n" +
            "\n" +
            "    Path − This specifies the directories for which the cookie is valid. A single forward slash character permits the cookie to be valid for all directories.\n" +
            "\n" +
            "    Domain − This can be used to specify the domain name in very large domains and must contain at least two periods to be valid. All cookies are only valid for the host and domain which created them.\n" +
            "\n" +
            "    Security − This can be set to 1 to specify that the cookie should only be sent by secure transmission using HTTPS otherwise set to 0 which mean cookie can be sent by regular HTTP.\n" +
            "\n" +
            "Following example will create two cookies name and age these cookies will be expired after one hour.\n" +
            "\n" +
            "<?php\n" +
            "   setcookie(\"name\", \"John Watkin\", time()+3600, \"/\",\"\", 0);\n" +
            "   setcookie(\"age\", \"36\", time()+3600, \"/\", \"\",  0);\n" +
            "?>\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Setting Cookies with PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      <?php echo \"Set Cookies\"?>\n" +
            "   </body>\n" +
            "   \n" +
            "</html>\n" +
            "\n" +
            "Accessing Cookies with PHP\n" +
            "\n" +
            "PHP provides many ways to access cookies. Simplest way is to use either $_COOKIE or $HTTP_COOKIE_VARS variables. Following example will access all the cookies set in above example.\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Accessing Cookies with PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         echo $_COOKIE[\"name\"]. \"<br />\";\n" +
            "         \n" +
            "         /* is equivalent to */\n" +
            "         echo $HTTP_COOKIE_VARS[\"name\"]. \"<br />\";\n" +
            "         \n" +
            "         echo $_COOKIE[\"age\"] . \"<br />\";\n" +
            "         \n" +
            "         /* is equivalent to */\n" +
            "         echo $HTTP_COOKIE_VARS[\"age\"] . \"<br />\";\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "You can use isset() function to check if a cookie is set or not.\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Accessing Cookies with PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         if( isset($_COOKIE[\"name\"]))\n" +
            "            echo \"Welcome \" . $_COOKIE[\"name\"] . \"<br />\";\n" +
            "         \n" +
            "         else\n" +
            "            echo \"Sorry... Not recognized\" . \"<br />\";\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "Deleting Cookie with PHP\n" +
            "\n" +
            "Officially, to delete a cookie you should call setcookie() with the name argument only but this does not always work well, however, and should not be relied on.\n" +
            "\n" +
            "It is safest to set the cookie with a date that has already expired −\n" +
            "\n" +
            "<?php\n" +
            "   setcookie( \"name\", \"\", time()- 60, \"/\",\"\", 0);\n" +
            "   setcookie( \"age\", \"\", time()- 60, \"/\",\"\", 0);\n" +
            "?>\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Deleting Cookies with PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      <?php echo \"Deleted Cookies\" ?>\n" +
            "   </body>\n" +
            "   \n" +
            "</html>";
    String session = "An alternative way to make data accessible across the various pages of an entire website is to use a PHP Session.\n" +
            "\n" +
            "A session creates a file in a temporary directory on the server where registered session variables and their values are stored. This data will be available to all pages on the site during that visit.\n" +
            "\n" +
            "The location of the temporary file is determined by a setting in the php.ini file called session.save_path. Before using any session variable make sure you have setup this path.\n" +
            "\n" +
            "When a session is started following things happen −\n" +
            "\n" +
            "    PHP first creates a unique identifier for that particular session which is a random string of 32 hexadecimal numbers such as 3c7foj34c3jj973hjkop2fc937e3443.\n" +
            "\n" +
            "    A cookie called PHPSESSID is automatically sent to the user's computer to store unique session identification string.\n" +
            "\n" +
            "    A file is automatically created on the server in the designated temporary directory and bears the name of the unique identifier prefixed by sess_ ie sess_3c7foj34c3jj973hjkop2fc937e3443.\n" +
            "\n" +
            "When a PHP script wants to retrieve the value from a session variable, PHP automatically gets the unique session identifier string from the PHPSESSID cookie and then looks in its temporary directory for the file bearing that name and a validation can be done by comparing both values.\n" +
            "\n" +
            "A session ends when the user loses the browser or after leaving the site, the server will terminate the session after a predetermined period of time, commonly 30 minutes duration.\n" +
            "Starting a PHP Session\n" +
            "\n" +
            "A PHP session is easily started by making a call to the session_start() function.This function first checks if a session is already started and if none is started then it starts one. It is recommended to put the call to session_start() at the beginning of the page.\n" +
            "\n" +
            "Session variables are stored in associative array called $_SESSION[]. These variables can be accessed during lifetime of a session.\n" +
            "\n" +
            "The following example starts a session then register a variable called counter that is incremented each time the page is visited during the session.\n" +
            "\n" +
            "Make use of isset() function to check if session variable is already set or not.\n" +
            "\n" +
            "Put this code in a test.php file and load this file many times to see the result −\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   session_start();\n" +
            "   \n" +
            "   if( isset( $_SESSION['counter'] ) ) {\n" +
            "      $_SESSION['counter'] += 1;\n" +
            "   }else {\n" +
            "      $_SESSION['counter'] = 1;\n" +
            "   }\n" +
            "\t\n" +
            "   $msg = \"You have visited this page \".  $_SESSION['counter'];\n" +
            "   $msg .= \"in this session.\";\n" +
            "?>\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Setting up a PHP session</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      <?php  echo ( $msg ); ?>\n" +
            "   </body>\n" +
            "   \n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "\n" +
            "You have visited this page 1in this session.\n" +
            "\n" +
            "Destroying a PHP Session\n" +
            "\n" +
            "A PHP session can be destroyed by session_destroy() function. This function does not need any argument and a single call can destroy all the session variables. If you want to destroy a single session variable then you can use unset() function to unset a session variable.\n" +
            "\n" +
            "Here is the example to unset a single variable −\n" +
            "\n" +
            "<?php\n" +
            "   unset($_SESSION['counter']);\n" +
            "?>\n" +
            "\n" +
            "Here is the call which will destroy all the session variables −\n" +
            "\n" +
            "<?php\n" +
            "   session_destroy();\n" +
            "?>\n" +
            "\n" +
            "Turning on Auto Session\n" +
            "\n" +
            "You don't need to call start_session() function to start a session when a user visits your site if you can set session.auto_start variable to 1 in php.ini file.\n" +
            "Sessions without cookies\n" +
            "\n" +
            "There may be a case when a user does not allow to store cookies on their machine. So there is another method to send session ID to the browser.\n" +
            "\n" +
            "Alternatively, you can use the constant SID which is defined if the session started. If the client did not send an appropriate session cookie, it has the form session_name=session_id. Otherwise, it expands to an empty string. Thus, you can embed it unconditionally into URLs.\n" +
            "\n" +
            "The following example demonstrates how to register a variable, and how to link correctly to another page using SID.\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   session_start();\n" +
            "   \n" +
            "   if (isset($_SESSION['counter'])) {\n" +
            "      $_SESSION['counter'] = 1;\n" +
            "   }else {\n" +
            "      $_SESSION['counter']++;\n" +
            "   }\n" +
            "   \n" +
            "   $msg = \"You have visited this page \".  $_SESSION['counter'];\n" +
            "   $msg .= \"in this session.\";\n" +
            "   \n" +
            "   echo ( $msg );\n" +
            "?>\n" +
            "\n" +
            "<p>\n" +
            "   To continue  click following link <br />\n" +
            "   \n" +
            "   <a  href = \"nextpage.php?<?php echo htmlspecialchars(SID); ?>\">\n" +
            "</p>";
    String sendingemail = "PHP must be configured correctly in the php.ini file with the details of how your system sends email. Open php.ini file available in /etc/ directory and find the section headed [mail function].\n" +
            "\n" +
            "Windows users should ensure that two directives are supplied. The first is called SMTP that defines your email server address. The second is called sendmail_from which defines your own email address.\n" +
            "\n" +
            "The configuration for Windows should look something like this −\n" +
            "\n" +
            "[mail function]\n" +
            "; For Win32 only.\n" +
            "SMTP = smtp.secureserver.net\n" +
            "\n" +
            "; For win32 only\n" +
            "sendmail_from = webmaster@tutorialspoint.com\n" +
            "\n" +
            "Linux users simply need to let PHP know the location of their sendmail application. The path and any desired switches should be specified to the sendmail_path directive.\n" +
            "\n" +
            "The configuration for Linux should look something like this −\n" +
            "\n" +
            "[mail function]\n" +
            "; For Win32 only.\n" +
            "SMTP = \n" +
            "\n" +
            "; For win32 only\n" +
            "sendmail_from = \n" +
            "\n" +
            "; For Unix only\n" +
            "sendmail_path = /usr/sbin/sendmail -t -i\n" +
            "\n" +
            "Now you are ready to go −\n" +
            "Sending plain text email\n" +
            "\n" +
            "PHP makes use of mail() function to send an email. This function requires three mandatory arguments that specify the recipient's email address, the subject of the the message and the actual message additionally there are other two optional parameters.\n" +
            "\n" +
            "mail( to, subject, message, headers, parameters );\n" +
            "\n" +
            "Here is the description for each parameters.\n" +
            "Sr.No \tParameter & Description\n" +
            "1 \t\n" +
            "\n" +
            "to\n" +
            "\n" +
            "Required. Specifies the receiver / receivers of the email\n" +
            "2 \t\n" +
            "\n" +
            "subject\n" +
            "\n" +
            "Required. Specifies the subject of the email. This parameter cannot contain any newline characters\n" +
            "3 \t\n" +
            "\n" +
            "message\n" +
            "\n" +
            "Required. Defines the message to be sent. Each line should be separated with a LF (\\n). Lines should not exceed 70 characters\n" +
            "4 \t\n" +
            "\n" +
            "headers\n" +
            "\n" +
            "Optional. Specifies additional headers, like From, Cc, and Bcc. The additional headers should be separated with a CRLF (\\r\\n)\n" +
            "5 \t\n" +
            "\n" +
            "parameters\n" +
            "\n" +
            "Optional. Specifies an additional parameter to the send mail program\n" +
            "\n" +
            "As soon as the mail function is called PHP will attempt to send the email then it will return true if successful or false if it is failed.\n" +
            "\n" +
            "Multiple recipients can be specified as the first argument to the mail() function in a comma separated list.\n" +
            "Sending HTML email\n" +
            "\n" +
            "When you send a text message using PHP then all the content will be treated as simple text. Even if you will include HTML tags in a text message, it will be displayed as simple text and HTML tags will not be formatted according to HTML syntax. But PHP provides option to send an HTML message as actual HTML message.\n" +
            "\n" +
            "While sending an email message you can specify a Mime version, content type and character set to send an HTML email.\n" +
            "Example\n" +
            "\n" +
            "Following example will send an HTML email message to xyz@somedomain.com copying it to afgh@somedomain.com. You can code this program in such a way that it should receive all content from the user and then it should send an email.\n" +
            "\n" +
            "<html>\n" +
            "   \n" +
            "   <head>\n" +
            "      <title>Sending HTML email using PHP</title>\n" +
            "   </head>\n" +
            "   \n" +
            "   <body>\n" +
            "      \n" +
            "      <?php\n" +
            "         $to = \"xyz@somedomain.com\";\n" +
            "         $subject = \"This is subject\";\n" +
            "         \n" +
            "         $message = \"<b>This is HTML message.</b>\";\n" +
            "         $message .= \"<h1>This is headline.</h1>\";\n" +
            "         \n" +
            "         $header = \"From:abc@somedomain.com \\r\\n\";\n" +
            "         $header .= \"Cc:afgh@somedomain.com \\r\\n\";\n" +
            "         $header .= \"MIME-Version: 1.0\\r\\n\";\n" +
            "         $header .= \"Content-type: text/html\\r\\n\";\n" +
            "         \n" +
            "         $retval = mail ($to,$subject,$message,$header);\n" +
            "         \n" +
            "         if( $retval == true ) {\n" +
            "            echo \"Message sent successfully...\";\n" +
            "         }else {\n" +
            "            echo \"Message could not be sent...\";\n" +
            "         }\n" +
            "      ?>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "Sending attachments with email\n" +
            "\n" +
            "To send an email with mixed content requires to set Content-type header to multipart/mixed. Then text and attachment sections can be specified within boundaries.\n" +
            "\n" +
            "A boundary is started with two hyphens followed by a unique number which can not appear in the message part of the email. A PHP function md5() is used to create a 32 digit hexadecimal number to create unique number. A final boundary denoting the email's final section must also end with two hyphens.\n" +
            "\n" +
            "<?php\n" +
            "   // request variables // important\n" +
            "   $from = $_REQUEST[\"from\"];\n" +
            "   $emaila = $_REQUEST[\"emaila\"];\n" +
            "   $filea = $_REQUEST[\"filea\"];\n" +
            "   \n" +
            "   if ($filea) {\n" +
            "      function mail_attachment ($from , $to, $subject, $message, $attachment){\n" +
            "         $fileatt = $attachment; // Path to the file\n" +
            "         $fileatt_type = \"application/octet-stream\"; // File Type \n" +
            "         \n" +
            "         $start = strrpos($attachment, '/') == -1 ? \n" +
            "            strrpos($attachment, '//') : strrpos($attachment, '/')+1;\n" +
            "\t\t\t\t\n" +
            "         $fileatt_name = substr($attachment, $start, \n" +
            "            strlen($attachment)); // Filename that will be used for the \n" +
            "            file as the attachment \n" +
            "         \n" +
            "         $email_from = $from; // Who the email is from\n" +
            "         $subject = \"New Attachment Message\";\n" +
            "         \n" +
            "         $email_subject =  $subject; // The Subject of the email \n" +
            "         $email_txt = $message; // Message that the email has in it \n" +
            "         $email_to = $to; // Who the email is to\n" +
            "         \n" +
            "         $headers = \"From: \".$email_from;\n" +
            "         $file = fopen($fileatt,'rb'); \n" +
            "         $data = fread($file,filesize($fileatt)); \n" +
            "         fclose($file); \n" +
            "         \n" +
            "         $msg_txt=\"\\n\\n You have recieved a new attachment message from $from\";\n" +
            "         $semi_rand = md5(time()); \n" +
            "         $mime_boundary = \"==Multipart_Boundary_x{$semi_rand}x\"; \n" +
            "         $headers .= \"\\nMIME-Version: 1.0\\n\" . \"Content-Type: multipart/mixed;\\n\" . \"\n" +
            "            boundary=\\\"{$mime_boundary}\\\"\";\n" +
            "         \n" +
            "         $email_txt .= $msg_txt;\n" +
            "\t\t\t\n" +
            "         $email_message .= \"This is a multi-part message in MIME format.\\n\\n\" . \n" +
            "            \"--{$mime_boundary}\\n\" . \"Content-Type:text/html; \n" +
            "            charset = \\\"iso-8859-1\\\"\\n\" . \"Content-Transfer-Encoding: 7bit\\n\\n\" . \n" +
            "            $email_txt . \"\\n\\n\";\n" +
            "\t\t\t\t\n" +
            "         $data = chunk_split(base64_encode($data));\n" +
            "         \n" +
            "         $email_message .= \"--{$mime_boundary}\\n\" . \"Content-Type: {$fileatt_type};\\n\" .\n" +
            "            \" name = \\\"{$fileatt_name}\\\"\\n\" . //\"Content-Disposition: attachment;\\n\" . \n" +
            "            //\" filename = \\\"{$fileatt_name}\\\"\\n\" . \"Content-Transfer-Encoding: \n" +
            "            base64\\n\\n\" . $data . \"\\n\\n\" . \"--{$mime_boundary}--\\n\";\n" +
            "\t\t\t\t\n" +
            "         $ok = mail($email_to, $email_subject, $email_message, $headers);\n" +
            "         \n" +
            "         if($ok) {\n" +
            "            echo \"File Sent Successfully.\";\n" +
            "            unlink($attachment); // delete a file after attachment sent.\n" +
            "         }else {\n" +
            "            die(\"Sorry but the email could not be sent. Please go back and try again!\");\n" +
            "         }\n" +
            "      }\n" +
            "      move_uploaded_file($_FILES[\"filea\"][\"tmp_name\"],\n" +
            "         'temp/'.basename($_FILES['filea']['name']));\n" +
            "\t\t\t\n" +
            "      mail_attachment(\"$from\", \"youremailaddress@gmail.com\", \n" +
            "         \"subject\", \"message\", (\"temp/\".$_FILES[\"filea\"][\"name\"]));\n" +
            "   }\n" +
            "?>\n" +
            "\n" +
            "<html>\n" +
            "   <head>\n" +
            "      \n" +
            "      <script language = \"javascript\" type = \"text/javascript\">\n" +
            "         function CheckData45() {\n" +
            "            with(document.filepost) {\n" +
            "               if(filea.value ! = \"\") {\n" +
            "                  document.getElementById('one').innerText = \n" +
            "                     \"Attaching File ... Please Wait\";\n" +
            "               }\n" +
            "            }\n" +
            "         }\n" +
            "      </script>\n" +
            "      \n" +
            "   </head>\n" +
            "   <body>\n" +
            "      \n" +
            "      <table width = \"100%\" height = \"100%\" border = \"0\" \n" +
            "         cellpadding = \"0\" cellspacing = \"0\">\n" +
            "         <tr>\n" +
            "            <td align = \"center\">\n" +
            "               <form name = \"filepost\" method = \"post\" \n" +
            "                  action = \"file.php\" enctype = \"multipart/form-data\" id = \"file\">\n" +
            "                  \n" +
            "                  <table width = \"300\" border = \"0\" cellspacing = \"0\" \n" +
            "                     cellpadding = \"0\">\n" +
            "\t\t\t\t\t\t\t\n" +
            "                     <tr valign = \"bottom\">\n" +
            "                        <td height = \"20\">Your Name:</td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr>\n" +
            "                        <td><input name = \"from\" type = \"text\" \n" +
            "                           id = \"from\" size = \"30\"></td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr valign = \"bottom\">\n" +
            "                        <td height = \"20\">Your Email Address:</td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr>\n" +
            "                        <td class = \"frmtxt2\"><input name = \"emaila\"\n" +
            "                           type = \"text\" id = \"emaila\" size = \"30\"></td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr>\n" +
            "                        <td height = \"20\" valign = \"bottom\">Attach File:</td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr valign = \"bottom\">\n" +
            "                        <td valign = \"bottom\"><input name = \"filea\" \n" +
            "                           type = \"file\" id = \"filea\" size = \"16\"></td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                     <tr>\n" +
            "                        <td height = \"40\" valign = \"middle\"><input \n" +
            "                           name = \"Reset2\" type = \"reset\" id = \"Reset2\" value = \"Reset\">\n" +
            "                        <input name = \"Submit2\" type = \"submit\" \n" +
            "                           value = \"Submit\" onClick = \"return CheckData45()\"></td>\n" +
            "                     </tr>\n" +
            "                  </table>\n" +
            "                  \n" +
            "               </form>\n" +
            "               \n" +
            "               <center>\n" +
            "                  <table width = \"400\">\n" +
            "                     \n" +
            "                     <tr>\n" +
            "                        <td id = \"one\">\n" +
            "                        </td>\n" +
            "                     </tr>\n" +
            "                     \n" +
            "                  </table>\n" +
            "               </center>\n" +
            "               \n" +
            "            </td>\n" +
            "         </tr>\n" +
            "      </table>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>";
    String fileupload = "A PHP script can be used with a HTML form to allow users to upload files to the server. Initially files are uploaded into a temporary directory and then relocated to a target destination by a PHP script.\n" +
            "\n" +
            "Information in the phpinfo.php page describes the temporary directory that is used for file uploads as upload_tmp_dir and the maximum permitted size of files that can be uploaded is stated as upload_max_filesize. These parameters are set into PHP configuration file php.ini\n" +
            "\n" +
            "The process of uploading a file follows these steps −\n" +
            "\n" +
            "    The user opens the page containing a HTML form featuring a text files, a browse button and a submit button.\n" +
            "\n" +
            "    The user clicks the browse button and selects a file to upload from the local PC.\n" +
            "\n" +
            "    The full path to the selected file appears in the text filed then the user clicks the submit button.\n" +
            "\n" +
            "    The selected file is sent to the temporary directory on the server.\n" +
            "\n" +
            "    The PHP script that was specified as the form handler in the form's action attribute checks that the file has arrived and then copies the file into an intended directory.\n" +
            "\n" +
            "    The PHP script confirms the success to the user.\n" +
            "\n" +
            "As usual when writing files it is necessary for both temporary and final locations to have permissions set that enable file writing. If either is set to be read-only then process will fail.\n" +
            "\n" +
            "An uploaded file could be a text file or image file or any document.\n" +
            "Creating an upload form\n" +
            "\n" +
            "The following HTM code below creates an uploader form. This form is having method attribute set to post and enctype attribute is set to multipart/form-data\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   if(isset($_FILES['image'])){\n" +
            "      $errors= array();\n" +
            "      $file_name = $_FILES['image']['name'];\n" +
            "      $file_size =$_FILES['image']['size'];\n" +
            "      $file_tmp =$_FILES['image']['tmp_name'];\n" +
            "      $file_type=$_FILES['image']['type'];\n" +
            "      $file_ext=strtolower(end(explode('.',$_FILES['image']['name'])));\n" +
            "      \n" +
            "      $extensions= array(\"jpeg\",\"jpg\",\"png\");\n" +
            "      \n" +
            "      if(in_array($file_ext,$extensions)=== false){\n" +
            "         $errors[]=\"extension not allowed, please choose a JPEG or PNG file.\";\n" +
            "      }\n" +
            "      \n" +
            "      if($file_size > 2097152){\n" +
            "         $errors[]='File size must be excately 2 MB';\n" +
            "      }\n" +
            "      \n" +
            "      if(empty($errors)==true){\n" +
            "         move_uploaded_file($file_tmp,\"images/\".$file_name);\n" +
            "         echo \"Success\";\n" +
            "      }else{\n" +
            "         print_r($errors);\n" +
            "      }\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <form action=\"\" method=\"POST\" enctype=\"multipart/form-data\">\n" +
            "         <input type=\"file\" name=\"image\" />\n" +
            "         <input type=\"submit\"/>\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Upload Form\n" +
            "Creating an upload script\n" +
            "\n" +
            "There is one global PHP variable called $_FILES. This variable is an associate double dimension array and keeps all the information related to uploaded file. So if the value assigned to the input's name attribute in uploading form was file, then PHP would create following five variables −\n" +
            "\n" +
            "    $_FILES['file']['tmp_name'] − the uploaded file in the temporary directory on the web server.\n" +
            "\n" +
            "    $_FILES['file']['name'] − the actual name of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['size'] − the size in bytes of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['type'] − the MIME type of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['error'] − the error code associated with this file upload.\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "Below example should allow upload images and gives back result as uploaded file information.\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   if(isset($_FILES['image'])){\n" +
            "      $errors= array();\n" +
            "      $file_name = $_FILES['image']['name'];\n" +
            "      $file_size = $_FILES['image']['size'];\n" +
            "      $file_tmp = $_FILES['image']['tmp_name'];\n" +
            "      $file_type = $_FILES['image']['type'];\n" +
            "      $file_ext=strtolower(end(explode('.',$_FILES['image']['name'])));\n" +
            "      \n" +
            "      $extensions= array(\"jpeg\",\"jpg\",\"png\");\n" +
            "      \n" +
            "      if(in_array($file_ext,$extensions)=== false){\n" +
            "         $errors[]=\"extension not allowed, please choose a JPEG or PNG file.\";\n" +
            "      }\n" +
            "      \n" +
            "      if($file_size > 2097152) {\n" +
            "         $errors[]='File size must be excately 2 MB';\n" +
            "      }\n" +
            "      \n" +
            "      if(empty($errors)==true) {\n" +
            "         move_uploaded_file($file_tmp,\"images/\".$file_name);\n" +
            "         echo \"Success\";\n" +
            "      }else{\n" +
            "         print_r($errors);\n" +
            "      }\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <form action = \"\" method = \"POST\" enctype = \"multipart/form-data\">\n" +
            "         <input type = \"file\" name = \"image\" />\n" +
            "         <input type = \"submit\"/>\n" +
            "\t\t\t\n" +
            "         <ul>\n" +
            "            <li>Sent file: <?php echo $_FILES['image']['name'];  ?>\n" +
            "            <li>File size: <?php echo $_FILES['image']['size'];  ?>\n" +
            "            <li>File type: <?php echo $_FILES['image']['type'] ?>\n" +
            "         </ul>\n" +
            "\t\t\t\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>";
    String coding = "A PHP script can be used with a HTML form to allow users to upload files to the server. Initially files are uploaded into a temporary directory and then relocated to a target destination by a PHP script.\n" +
            "\n" +
            "Information in the phpinfo.php page describes the temporary directory that is used for file uploads as upload_tmp_dir and the maximum permitted size of files that can be uploaded is stated as upload_max_filesize. These parameters are set into PHP configuration file php.ini\n" +
            "\n" +
            "The process of uploading a file follows these steps −\n" +
            "\n" +
            "    The user opens the page containing a HTML form featuring a text files, a browse button and a submit button.\n" +
            "\n" +
            "    The user clicks the browse button and selects a file to upload from the local PC.\n" +
            "\n" +
            "    The full path to the selected file appears in the text filed then the user clicks the submit button.\n" +
            "\n" +
            "    The selected file is sent to the temporary directory on the server.\n" +
            "\n" +
            "    The PHP script that was specified as the form handler in the form's action attribute checks that the file has arrived and then copies the file into an intended directory.\n" +
            "\n" +
            "    The PHP script confirms the success to the user.\n" +
            "\n" +
            "As usual when writing files it is necessary for both temporary and final locations to have permissions set that enable file writing. If either is set to be read-only then process will fail.\n" +
            "\n" +
            "An uploaded file could be a text file or image file or any document.\n" +
            "Creating an upload form\n" +
            "\n" +
            "The following HTM code below creates an uploader form. This form is having method attribute set to post and enctype attribute is set to multipart/form-data\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   if(isset($_FILES['image'])){\n" +
            "      $errors= array();\n" +
            "      $file_name = $_FILES['image']['name'];\n" +
            "      $file_size =$_FILES['image']['size'];\n" +
            "      $file_tmp =$_FILES['image']['tmp_name'];\n" +
            "      $file_type=$_FILES['image']['type'];\n" +
            "      $file_ext=strtolower(end(explode('.',$_FILES['image']['name'])));\n" +
            "      \n" +
            "      $extensions= array(\"jpeg\",\"jpg\",\"png\");\n" +
            "      \n" +
            "      if(in_array($file_ext,$extensions)=== false){\n" +
            "         $errors[]=\"extension not allowed, please choose a JPEG or PNG file.\";\n" +
            "      }\n" +
            "      \n" +
            "      if($file_size > 2097152){\n" +
            "         $errors[]='File size must be excately 2 MB';\n" +
            "      }\n" +
            "      \n" +
            "      if(empty($errors)==true){\n" +
            "         move_uploaded_file($file_tmp,\"images/\".$file_name);\n" +
            "         echo \"Success\";\n" +
            "      }else{\n" +
            "         print_r($errors);\n" +
            "      }\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <form action=\"\" method=\"POST\" enctype=\"multipart/form-data\">\n" +
            "         <input type=\"file\" name=\"image\" />\n" +
            "         <input type=\"submit\"/>\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>\n" +
            "\n" +
            "It will produce the following result −\n" +
            "Upload Form\n" +
            "Creating an upload script\n" +
            "\n" +
            "There is one global PHP variable called $_FILES. This variable is an associate double dimension array and keeps all the information related to uploaded file. So if the value assigned to the input's name attribute in uploading form was file, then PHP would create following five variables −\n" +
            "\n" +
            "    $_FILES['file']['tmp_name'] − the uploaded file in the temporary directory on the web server.\n" +
            "\n" +
            "    $_FILES['file']['name'] − the actual name of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['size'] − the size in bytes of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['type'] − the MIME type of the uploaded file.\n" +
            "\n" +
            "    $_FILES['file']['error'] − the error code associated with this file upload.\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "Below example should allow upload images and gives back result as uploaded file information.\n" +
            "Live Demo\n" +
            "\n" +
            "<?php\n" +
            "   if(isset($_FILES['image'])){\n" +
            "      $errors= array();\n" +
            "      $file_name = $_FILES['image']['name'];\n" +
            "      $file_size = $_FILES['image']['size'];\n" +
            "      $file_tmp = $_FILES['image']['tmp_name'];\n" +
            "      $file_type = $_FILES['image']['type'];\n" +
            "      $file_ext=strtolower(end(explode('.',$_FILES['image']['name'])));\n" +
            "      \n" +
            "      $extensions= array(\"jpeg\",\"jpg\",\"png\");\n" +
            "      \n" +
            "      if(in_array($file_ext,$extensions)=== false){\n" +
            "         $errors[]=\"extension not allowed, please choose a JPEG or PNG file.\";\n" +
            "      }\n" +
            "      \n" +
            "      if($file_size > 2097152) {\n" +
            "         $errors[]='File size must be excately 2 MB';\n" +
            "      }\n" +
            "      \n" +
            "      if(empty($errors)==true) {\n" +
            "         move_uploaded_file($file_tmp,\"images/\".$file_name);\n" +
            "         echo \"Success\";\n" +
            "      }else{\n" +
            "         print_r($errors);\n" +
            "      }\n" +
            "   }\n" +
            "?>\n" +
            "<html>\n" +
            "   <body>\n" +
            "      \n" +
            "      <form action = \"\" method = \"POST\" enctype = \"multipart/form-data\">\n" +
            "         <input type = \"file\" name = \"image\" />\n" +
            "         <input type = \"submit\"/>\n" +
            "\t\t\t\n" +
            "         <ul>\n" +
            "            <li>Sent file: <?php echo $_FILES['image']['name'];  ?>\n" +
            "            <li>File size: <?php echo $_FILES['image']['size'];  ?>\n" +
            "            <li>File type: <?php echo $_FILES['image']['type'] ?>\n" +
            "         </ul>\n" +
            "\t\t\t\n" +
            "      </form>\n" +
            "      \n" +
            "   </body>\n" +
            "</html>";

    //Topics Arrays
    String [] php_array = {home,introPHP,environment,syntax,veriable,constants,operator,decision,loop,arrayss,string,web,get_post,fileinclusion,filesio,functions,cookies,session,sendingemail,fileupload,coding};
    String[] react_array = {ReactJSTutorial,ReactVersion,ReactInstallation,Reactcreatereactapp,
            ReactFeatures,ProsandCons,ReactJSX,ReactComponents,ReactState,ReactProps,StateProps,Constructor,ReactRouter,ReactBootstrap,
            ReactHooks};
    String [] Css_array = {CSSBasic,CSSHOME,CSSIntroduction,CSSSyntax, CSSIdClass , CSSHowTo ,CSSBackgrounds,CSSText ,CSSFonts,CSSLinks , CSSLists
            ,CSSTables,CSSBoxModel,CSSBorder,CSSOutline,CSSMargin ,CSSPadding,CSSGroupingNesting,CSSDimension,CSSDisplay,CSSPositioning,CSSFloating,CSSAlign,
            CSSPseudoclass,CSSPseudoelement,CSSNavigationBar,CSSImageGallery,CSSImageOpacity,CSSImageOpacity,CSSImageSprites,CSSMediaTypes, CSSAttrSelectors ,CSS3Introduction,
            CSS3Borders,CSS3Backgrounds};
    String[] html_array = {HTMLIntroduction,HTMLEditors,HTMLBasic,HTMLElements,HTMLAttributes,HTMLHeadings,HTMLParagraphs,HTMLFormatting,HTMLLinks,HTMLHead,HTMLCSS,HTMLImages,HTMLTables,HTMLLayout,HTMLForms,HTMLIframes,HTMLList,HTMLBlock,HTMLColors,HTMLColornames,HTMLColorvalues,HTMLJavaScript,HTMLEntities,HTMLURLEncode,HTMLQuickList,HTMLSummary};
    String[] js_topic = {WhatisJavaScript,UnderstandingEvents,JavaScriptExample,ExternalJavaScript,Comment,Variable,GlobalVariable,DataTypes, JSoperators,IfStatement,Switch,Loopforandwhile,Function,JavaScriptobjects,JavaScriptArray};
    String[] python_topic = {PythonIntroduction,PythonPrint,PythonBasics,PythonVariables,PythonDataTypes,PythonInput,PythonOperators,PythonIfandElse,PythonWhileLoop,PythonForLoop,PythonBreakandContinue,PythonLists ,PythonListComprehension,PythonStrings ,PythonTuples,PythonDictionary,PythonDictionaryComprehension,PythonSets,PythonFunctions,PythonFixedVariableArgument,PythonOOP,PythonClassesandObjects,PythonInstanceClassandtaticMethod,PythonSubclassofaClass,PythonMultipleInheritance,PythonMethodOverridingandMRO,PythonErrorsandExceptions,PythonExceptionHandling,PythonRaisingExceptions,PythonAssert,PythonFilesHandling,PythonIterators,PythonStringFormatting,PythonLambdaFunctions,PythonNestedFunctions,PythonScopeofVariables,PythonClosures,PythonDecorators,PythonDocstrings};
    String [] javaContentArray = {intro,print,basic,variables,data_Types,input,operators,javaIfandElse,javaSwitch,javaLoops,javaBreakandContinue,javaMethods,javaMethodOverloading,javaArray,javaStrings,javaStringMethodsandOperations,javaObjectOrientedProgramming,javaClassesandObjects,javaArrayofObjects,javaConstructorOverloading,javaAccessModifiers,javaInheritance,javasuperKeyword,javaAbstraction,javaAbstractclass,javaInterface,javaEncapsulation,javastaticKeyword,javathisKeyword,javafinalKeyword,javaErrorsandExceptions,javaExceptionHandling,javaThrowandThrows,javaAssertion,javaFileHandling,javaWrapperClasses,javaCollectionFramework,javaArrayList,javaIterator,javaNestedClasses,javaLambdaExpressions,javaAnnotations};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics_detailed);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getColor(R.color.white));
        }

        boolean isDarkThemeOn = (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if(isDarkThemeOn){
                getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(0, APPEARANCE_LIGHT_STATUS_BARS);
            }else{
                getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        TextView header = findViewById(R.id.title);
        TextView content = findViewById(R.id.content);
        Bundle bundle = getIntent().getExtras();
        int pos = Integer.parseInt(bundle.getString("topic"));
        String course = codingActivity.getCourseName();

        switch (course){
            case "java" :
                content.setText(javaContentArray[pos]);
                header.setText(getResources().getStringArray(R.array.java_topics)[pos]);
                break;
            case "python" :
                content.setText(python_topic[pos]);
                header.setText(getResources().getStringArray(R.array.python_topics)[pos]);
                break;
            case "html" :
                content.setText(html_array[pos]);
                header.setText(getResources().getStringArray(R.array.html_topics)[pos]);
                break;
            case "css" :
                content.setText(Css_array[pos]);
                header.setText(getResources().getStringArray(R.array.css_topics)[pos]);
                break;
            case "js" :
                content.setText(js_topic[pos]);
                header.setText(getResources().getStringArray(R.array.js_topics)[pos]);
                break;
            case "react" :
                content.setText(react_array[pos]);
                header.setText(getResources().getStringArray(R.array.react_topics)[pos]);
                break;
            case "php" :
                content.setText(php_array[pos]);
                header.setText(getResources().getStringArray(R.array.php_topics)[pos]);
                break;
            default:
                Log.d("topic", "No Course found");
        }

    }
}