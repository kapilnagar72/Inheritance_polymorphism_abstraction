# Inheritance_polymorphism_abstraction

                  **  Inheritance polymorphism abstraction  **  

1. What is Inheritance in Java?
 Ans : Inheritance in Java is the method to create a hierarchy between classes by inheriting from other classes.
 Java Inheritance is transitive - so if Sedan extends Car and Car extends Vehicle, then Sedan is also inherited from the Vehicle class

2. What is superclass and subclass?
 Ans:  A class that is derived from another class is called a subclass (also a derived class, extended class, or child class).
 The class from which the subclass is derived is called a superclass (also a base class or a parent class).

3. How is Inheritance implemented/achieved in Java?
 Ans : To inherit the parent class, a child class must include a keyword called "extends." The keyword "extends" enables the compiler to understand that the child class derives the functionalities and members of its parent class. To understand this in an easier way, let us verify the syntax for inheritance in Java.

4. What is polymorphism?
 Ans :  Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
 Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
 Polymorphism uses those methods to perform different tasks

5. Differentiate between method overloading and method overriding. ?
 Ans : Method overloading refers to defining multiple methods with the same name but different parameters within the same class,
 while method overriding involves creating a method in the child class that has the same name, parameters, and return type as a method in the parent class.

6. What is an abstraction explained with an Example?
 Ans : Your car is a great example of abstraction. You can start a car by turning the key or pressing the start button.
 You don't need to know how the engine is getting started, what all components your car has. The car internal implementation and complex logic is completely hidden from the user.

7. What is the difference between an abstract method and final method in Java?Explain with an example
 Ans : All the abstract methods should be overridden in the child class to provide the implementation.
However, from the definition, a final method can't be overridden. Therefore, an abstract final combination is illegal for the methods

8. What is the final class in Java?
 Ans : A class that cannot be further extended is called a final class in Java. A final class is declared using the final keyword.
 An abstract class cannot be a final class, hence, it can only be created when the class possesses a completion in nature.

9. Differentiate between abstraction and encapsulation.
   Ans : Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.
    Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield.
    Technically in encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of
    its class in which they are declared. As in encapsulation, the data in a class is hidden from other classes, so it is also known as data hiding.
    Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

    Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user.
    Ex: A car is viewed as a car rather than its individual components. Data Abstraction may also be defined as the process of identifying only the required characteristics of an
    object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the 
    objects.

 10. Difference between Runtime and compile time polymorphism explain with an example
 Ans : Compile Time Polymorphism: Whenever an object is bound with its functionality at the compile time, this is known as the compile-time polymorphism.
  At compile-time, java knows which method to call by checking the method signatures. So this is called compile-time polymorphism or static or early binding.
  Compile-time polymorphism is achieved through method overloading. Method Overloading says you can have more than one function with the same name in one class having a different 
 prototype. Function overloading is one of the ways to achieve polymorphism but it depends on technology and which type of polymorphism we adopt. In java, we achieve function overloading 
 at compile-Time. The following is an example where compile-time polymorphism can be observed.

  Run-Time Polymorphism: Whenever an object is bound with the functionality at run time, this is known as runtime polymorphism. The runtime polymorphism can be achieved by method overriding. Java virtual machine determines the proper method to call at the runtime, not at the compile time. It is also called dynamic or late binding. Method overriding says the child class has the same method as declared in the parent class. It means if the child class provides the specific implementation of the method that has been provided by one of its parent classes then it is known as method overriding. The following is an example where runtime polymorphism can be observed.



               
