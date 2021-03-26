package com.practice.items.methods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * the classify method is overloaded,
 * and the choice of which overloading to invoke is made at compile time
 */

public class CollectionClassifier {
  public static String classify(Set<?> s) {
    return "Set";
  }

  public static String classify(List<?> lst) {
    return "List";
  }

  public static String classify(Collection<?> c) {
    return "Unknown Collection";
  }

  /**
   * How to fix this ?
   *
   * public static String classify(Collection<?> c) {
   *     return c instanceof Set ? "Set" : c
   *     instanceof List ? "List" : "Unknown Collection";
   * }
   *
   * @param args
   */
  public static void main(String[] args) {
    Collection<?>[] collections = {
      new HashSet<String>(), new ArrayList<BigInteger>(), new HashMap<String, String>().values()
    };
    for (Collection<?> c : collections) System.out.println(classify(c));
  }
}
