package Inheritance_polymorphism_abstraction;

// Java program to demonstrate runtime polymorphism

class Poly1 {
    // Implementing a method
    public void method() {
        System.out.println("Method 1");
    }
}

// Defining a child class that extends Poly1
public class Poly2 extends Poly1 {
    // Overriding the parent method
    @Override
    public void method() {
        System.out.println("Method 2");
    }

    // Driver code
    public static void main(String args[]) {
        Poly1 test = new Poly2(); // Upcasting
        test.method(); // Calls the overridden method in Poly2
    }
}
