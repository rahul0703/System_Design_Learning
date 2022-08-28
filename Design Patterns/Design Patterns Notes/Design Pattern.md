# Design Pattern
## Introduction
![img.png](../Assets/design_pattern_1.png)

### What is Gang of Four (GOF)?
In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.

These authors are collectively known as **Gang of Four (GOF)**. According to these authors design patterns are primarily based on the following principles of object orientated design.

* **Program to an interface not an implementation**

* **Favor object composition over inheritance**

## Types of Design Patterns
As per the design pattern reference book Design Patterns - Elements of Reusable Object-Oriented Software , there are 23 design patterns which can be classified in three categories: Creational, Structural and Behavioral patterns. We'll also discuss another category of design pattern: J2EE design patterns.

1. **Creational Design Pattern**  
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.  

    
    In simpler way, if our primary objective is to create object, we should use creational design pattern.  


2. **Structural Design Patterns**  
   These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.  


    In simpler way, if our primary objective is to combine/composite object to obtain new or combined functionalities, we should use structural design patterns.

3. **Behavioral Patterns**  
   These design patterns are specifically concerned with communication between objects.  

   
    In simpler way, if ourprimary objective is to build communication between 2 more objects, we should use behavioural design pattern.

4. **J2EE patterns**  
   These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center.

## Creational Design Patterns
1. **Singleton Design Pattern**:  
   Lets you ensure that a class has only one instance, while providing a global access point to this instance.  


2. **Factory Design Pattern**:  
   Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.  


3. **Abstract Factory Pattern**:  
   Lets you produce families of related objects without specifying their concrete classes.

   

