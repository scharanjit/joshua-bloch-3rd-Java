### In public classes, use accessor methods,not public fields  (Time.java)
### Reduce Mutability 

An immutable class is simply a class whose instances cannot be modified. 
All of the information contained in each instance is fixed for the lifetime 
of the object, so no changes can ever be observed. The Java platform libraries
 contain many immutable classes, including String, the boxed primitive classes, 
 and BigInteger and BigDecimal. There are many good reasons for this: Immutable
  classes are easier to design, implement, and use than mutable classes. They are
   less prone to error and are more secure.
   
To make a class immutable, follow these five rules:

1. Don’t provide methods that modify the object’s state.

2. Ensure that the class can’t be extended.  (make the class final)

3.Make all fields final. 

4. Make all fields private.

5. Ensure exclusive access to any mutable components. 

Example :- Complex.java

Immutable objects are inherently thread-safe; they require no synchronization.  




==> Composition over Inheritance
 NO issue with inheritance of interfaces
 But there is issue in inheritance of classes
 
 Take example of HashSet and Class A extends Hashset
 ==> @Override cause problem
 
 
 In composition, use your method private and extend super class
 
 
==> Prefer interfaces to abstract class
   