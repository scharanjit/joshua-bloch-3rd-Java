Prefer dependency injection to hardwiring resources


In summary, do not use a singleton or static utility class to implement a class that depends on one o
r more underlying resources whose behavior affects that of the class, and do 
not have the class create these resources directly. Instead, pass the resources, or factories 
to create them, into the constructor (or static factory or builder). 

This practice, known as dependency injection, will greatly enhance the flexibility, reusability, and testability of a class.