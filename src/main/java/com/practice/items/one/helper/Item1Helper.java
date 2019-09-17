package com.practice.items.one.helper;

public class Item1Helper {

  private static Item1Helper singleInstance = null;

  public static Item1Helper getInstance(){
    if(singleInstance == null) {
      singleInstance = new Item1Helper();
    }
    return singleInstance;
  }

  public void method1() {

    System.out.println("Method 1");

  }

  public void method2() {
    System.out.println("Method 2");

  }

  public static int count =0;

  public Item1Helper() {
    count ++;
    System.out.println("Object count : "+count);
  }
}
