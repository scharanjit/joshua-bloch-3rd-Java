package com.practice.items.generalProgramming;

public class Four {


    static Integer i;
    public static void main(String[] args) {
      if (i == 42)
        System.out.println("Unbelievable");
    }

  /**
   * NullPointerException is thrown because i is an Integer not an int
   * ike all non-constant object reference fields, its initial value is null.
   *  when you mix primitives and boxed primitives in an operation,
   *  the boxed primitive is auto-unboxed
   */
}
