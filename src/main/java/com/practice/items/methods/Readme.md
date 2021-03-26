### Each time you write a method or constructor, you should 
think about what restrictions exist on its parameters. You should document these restrictions 
and enforce them with explicit checks at the beginning of the method body.

### if a class has mutable components that it gets from or returns to its clients, 
the class must defensively copy these components. If the cost of the copy would be 
prohibitive and the class trusts its clients not to modify the compo- nents 
inappropriately, then the defensive copy may be replaced by documentation outlining 
the client’s responsibility not to modify the affected components.



## Methods
### Use enums
### should not be more than 4 parameters
### For parameter types, favor interfaces over classes 

use Map instead of HashMap. (This lets you pass in a HashMap, a TreeMap, a ConcurrentHashMap, 
a submap of a TreeMap, or any Map implementa- tion yet to be written.)


A second technique for shortening long parameter lists is to create helper classes to hold 
groups of parameters. Typically these helper classes are static member classes (Item 24)



### Return empty collections or arrays, not nulls