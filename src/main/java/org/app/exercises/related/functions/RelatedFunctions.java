package org.app.exercises.related.functions;

import org.app.exceptions.OddNumbersTriangleException;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class RelatedFunctions {

  public static int drinkFactoryFn(int content, int evapPerDay, int threshold) {

    double thresholdQuantity = (double) content * threshold / 100;
    double currentEvapQuantityTotal = 0.0;
    double currentQuantity = content;
    int numOfDays = 0;

    while (currentEvapQuantityTotal < thresholdQuantity) {

      currentEvapQuantityTotal += (currentQuantity * evapPerDay / 100);
      currentQuantity -= (currentQuantity * evapPerDay / 100);
      if(currentEvapQuantityTotal <= thresholdQuantity) numOfDays++;

   }

    return numOfDays;
  }

  public static Map<String, String> drinkFactoryFn(int content, int evapPerDay, int threshold, LocalDate startingDate) {
    Map<String, String> data = new HashMap<>();

    int numOfDays = RelatedFunctions.drinkFactoryFn(content, evapPerDay, threshold);

    data.put("numOfDays", String.valueOf(numOfDays));
    data.put("thresholdDate", startingDate.plusDays(numOfDays).toString());

    return data;
  }

  public static int oddNumbersTriangleFn(int rowToSum) {

    int[][] oddNumbersTriangle = {
            { 3, 5 },
            { 7, 9, 11 },
            { 13, 15, 17, 19 },
            { 21, 23, 25, 27, 29 }
    };

    if(rowToSum < 1 || rowToSum > oddNumbersTriangle.length) {
      throw new OddNumbersTriangleException(rowToSum, 1, oddNumbersTriangle.length);
    }

    int sum = 0;

    for(int number : oddNumbersTriangle[rowToSum - 1]) {
      sum += number;
    }

    return sum;
  }
}
