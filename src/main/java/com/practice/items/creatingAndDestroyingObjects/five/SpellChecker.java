package com.practice.items.creatingAndDestroyingObjects.five;

import java.util.List;
import java.util.Objects;

// Dependency injection provides flexibility and testability
public class SpellChecker {
  private final Lexicon dictionary;

  public SpellChecker(Lexicon dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary);
  }

  public boolean isValid(String word) {
    return false;
  }

  public List<String> suggestions(String typo) {
    return null;
  }
}
