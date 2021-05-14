package com.practice.items.concurrency;

import sun.jvm.hotspot.oops.FieldType;

public class LazyInitializationExample {

  // Double-check idiom for lazy initialization of instance fields

  private volatile FieldType field;
  private FieldType getField() {
    FieldType result = field;
    if (result == null) {  // First check (no locking)
      synchronized(this) {
        if (field == null)  // Second check (with locking)
          field = result = computeFieldValue();
      } }
    return result;
  }

  private FieldType computeFieldValue() {
    return null;
  }



}
