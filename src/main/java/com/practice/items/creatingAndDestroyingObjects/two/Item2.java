package com.practice.items.creatingAndDestroyingObjects.two;

import com.practice.items.creatingAndDestroyingObjects.two.helper.NutritionFacts;

public class Item2 {

  public static void main(String[] args) {
    NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(1).carbohydrate(32)
        .fat(432).build();
    System.out.println(nutritionFacts);
  }

}
