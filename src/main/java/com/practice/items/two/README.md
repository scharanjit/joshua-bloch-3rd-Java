##Item 2 : Consider a builder when faced with many constructor parameters

Too many variables in a parameterised constructor

Static factories and constructors share a limitation: they do not scale well to large
numbers of optional parameters.


Consider the case of a class representing the
Nutrition Facts label that appears on packaged foods. These labels have a few
required fields—serving size, servings per container, and calories per serving—
and more than twenty optional fields—total fat, saturated fat, trans fat, cholesterol,
sodium, and so on. Most products have nonzero values for only a few of these
optional fields.


####Solution 1 Could be Telescopic Constructor Pattern

In which you provide a constructor with only the required parameters, another with a
single optional parameter, a third with two optional parameters, and so on, culmi-
nating in a constructor with all the optional parameters

In short, the telescoping constructor pattern works, but it is hard to write
client code when there are many parameters, and harder still to read it.


####Solution 2 Could be Java Beans pattern 

In order to use Java beans pattern, the class would be mutable. we cannot achieve immutabilty



####Solution 3: Use Builder pattern

The NutritionFacts class is immutable, 
and all parameter default values are in one place. 

The builder’s setter methods return the builder itself so that invoca- tions can be chained, resulting in a fluent API.

