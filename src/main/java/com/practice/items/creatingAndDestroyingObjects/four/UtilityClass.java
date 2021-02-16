package com.practice.items.creatingAndDestroyingObjects.four;

// Noninstantiable utility class
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();

//        The AssertionError isn’t strictly required,
//                but it provides insurance in case the constructor
//        is accidentally invoked from within the class.
    }
      // Remainder omitted
}

