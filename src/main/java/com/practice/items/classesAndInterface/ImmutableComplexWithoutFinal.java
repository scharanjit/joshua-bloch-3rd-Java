package com.practice.items.classesAndInterface;

// Immutable class with static factories instead of constructors
public class ImmutableComplexWithoutFinal {

  private final double re;
  private final double im;

  // make constructor private
  private ImmutableComplexWithoutFinal(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public static ImmutableComplexWithoutFinal valueOf(double re, double im) {
    return new ImmutableComplexWithoutFinal(re, im);
  }
}
