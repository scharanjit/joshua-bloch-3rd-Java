package com.practice.items.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Use of optional
 */
public class MaxValueInCollection {

  // Returns max val in collection as Optional<E> - uses stream
  public static <E extends Comparable<E>>
  Optional<E> max(Collection<E> c) {
    return c.stream().max(Comparator.naturalOrder());
  }


  // Returns maximum value in collection as an Optional<E>
  public static <E extends Comparable<E>> Optional<E> max1(Collection<E> c) {
    if (c.isEmpty())
      return Optional.empty();
    E result = null;
    for (E e : c)
      if (result == null || e.compareTo(result) > 0)
        result = Objects.requireNonNull(e);
    return Optional.of(result);
  }

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("a");
    words.add("b");
    words.add("c");
    words.add("d");

    System.out.println(max(words).orElse("No words..."));


  }
}
