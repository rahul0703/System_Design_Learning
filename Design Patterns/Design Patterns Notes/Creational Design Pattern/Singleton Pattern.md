# Singleton Design Pattern  


![img.png](https://refactoring.guru/images/patterns/content/singleton/singleton-2x.png)

Singleton Pattern says that just "define a class that has only one instance and provides a global point of access to it".  

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.  

## Why we require singleton design pattern?
**The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:**

1. Ensure that a class has just a single instance:
- Why would anyone want to control how many instances a class has? The most common reason for this is to control access to some shared resource—for example, a database or a file.

- Here’s how it works: imagine that you created an object, but after a while decided to create a new one. Instead of receiving a fresh object, you’ll get the one you already created.

- Note that this behavior is impossible to implement with a regular constructor since a constructor call must always return a new object by design.  

![img.png](https://refactoring.guru/images/patterns/content/singleton/singleton-comic-1-en-2x.png)  

2. Provide a global access point to that instance:
- Remember those global variables that you (all right, me) used to store some essential objects? While they’re very handy, they’re also very unsafe since any code can potentially overwrite the contents of those variables and crash the app.  
- Just like a global variable, the Singleton pattern lets you access some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.  
- There’s another side to this problem: you don’t want the code that solves problem #1 to be scattered all over your program. It’s much better to have it within one class, especially if the rest of your code already depends on it.  
- Nowadays, the Singleton pattern has become so popular that people may call something a singleton even if it solves just one of the listed problems.

## Forms of Singleton Design Pattern
1. **Early Instantiation**: creation of instance at load time.
2. **Lazy Instantiation**: creation of instance when required.

## Advantages and Uses of Singleton Design Pattern
- Saves memory because object is not created at each request. Only single instance is reused again and again.
- Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.  

## Structure
![img.png](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en-2x.png)

- The Singleton class declares the static method getInstance that returns the same instance of its own class.  
- The Singleton’s constructor should be hidden from the client code. Calling the getInstance method should be the only way of getting the Singleton object.

## Creating a Singleton Design Pattern
- To create the singleton class, we need to have static member of class, private constructor and static factory method.
  1. **Static member**: It gets memory only once because of static, itcontains the instance of the Singleton class.
  2. **Private constructor**: It will prevent to instantiate the Singleton class from outside the class.
  3. **Static factory method**: This provides the global point of access to the Singleton object and returns the instance to the caller.  

### Early Initialization Method
```java
class A{  
    private static A obj = new A();//Early, instance will be created at load time  
    private A(){}  
    
    public static A getA(){  
        return obj;  
    }  
  
    public void doSomething(){  
        //write your code  
    }  
}  
```

### Lazy Initialization Method

```java
class SingletonClass{
    private static volatile SingletonClass myInstance;
    private SingletonClass(){}
    public static SingletonClass getInstance() {
        if( myInstance == null ) {
            synchronized( SingletonClass.class) {
                if ( myInstance == null ) {
                    myInstance = new SingletonClass();
                }
            }
        }
    
        return myInstance;
    }
}

```
    Double-checked locking tries to initialize a field on demand and in a thread-safe manner while avoiding the cost of synchronization. Unfortunately it is not thread-safe when used on a field that is not declared volatile. When using Java 1.4 or earlier, double-checked locking doesn't work even with volatile fields. 
    Read the article linked above for the detailed explanation of the problem.

## Relations with Other Patterns
- A **Facade** class can often be transformed into a Singleton since a single facade object is sufficient in most cases.

- **Flyweight** would resemble Singleton if you somehow managed to reduce all shared states of the objects to just one flyweight object. But there are two fundamental differences between these patterns:

  1. There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different intrinsic states.
  2. The Singleton object can be mutable. Flyweight objects are immutable.
    