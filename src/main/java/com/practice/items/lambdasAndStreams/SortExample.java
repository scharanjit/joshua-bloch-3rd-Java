package com.practice.items.lambdasAndStreams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Using lambda
 */
public class SortExample {

  public static void main(String[] args) {

    List<String> words = new ArrayList<>();

    words.add("Dsds");
    words.add("FDSD");
    words.add("Abc");

    // Java 8
    Collections.sort(words, Comparator.comparingInt(String :: length));

    //More consize using Java
    words.sort(Comparator.comparingInt(String::length));
    System.out.println(words);
  }
}
