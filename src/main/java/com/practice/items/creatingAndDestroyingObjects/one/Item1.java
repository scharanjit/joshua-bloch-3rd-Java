package com.practice.items.creatingAndDestroyingObjects.one;

import com.practice.items.creatingAndDestroyingObjects.one.helper.Item1Helper;

public class Item1 {

  public static void main(String[] args) {

    //called in class 1
    Item1Helper item1Helper = Item1Helper.getInstance();
    item1Helper.method1();
    item1Helper.method1();
    item1Helper.method1();

    //called in class 2
    Item1Helper item1Helper1 = Item1Helper.getInstance();
    item1Helper1.method2();
    item1Helper1.method2();
    item1Helper1.method2();

    System.out.println("--------------------------------------------");

    //2nd Approach

    Item1Helper item1Helper2 = new Item1Helper();
    item1Helper2.method1();

    Item1Helper item1Helper3 = new Item1Helper();
    item1Helper3.method2();
  }

}
