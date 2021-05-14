1.) Minimize the scope of local variables.

2.) Prefer for ach loops over to traditional for loops.

3.) Use BigDecimal over float and double.

4.) Prefer primitives types over boxed primitive.

5.) Avoid Strings where other types are more appropriate.

#### String are poor substitutes for enum types and aggregate types.
#### String has performance issues with concatenation.. using string builder

6.) Refer to object by their interfaces.

// Good - uses interface as type 

Set<Son> sonSet = new LinkedHashSet<>();

not this:

// Bad - uses class as type!
LinkedHashSet<Son> sonSet = new LinkedHashSet<>();


7.) Prefer interfaces over reflections.

