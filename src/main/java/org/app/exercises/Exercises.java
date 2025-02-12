package org.app.exercises;

import org.app.exercises.related.functions.RelatedFunctions;

import java.time.LocalDate;
import java.util.Map;

public class Exercises implements ExercisesI {
  private static Exercises INSTANCE = new Exercises();

  private Exercises() {
  }

  public static Exercises getInstance() {
    return INSTANCE;
  }

  // ----------------------------------------------------
  private void printHeader(String title) {
    System.out.println("-------- " + title + " --------");
  }

  private void printSeparator() {
    System.out.println("-------------------------------------");
  }

  // ----------------------------------------------------

  @Override
  public void drinkFactory() {
    printHeader("drinkFactory");
    int content = 100;
    int evapPerDay = 10;
    int threshold = 20;

    Map<String, String> data = RelatedFunctions.drinkFactoryFn(content, evapPerDay, threshold, LocalDate.now());

    System.out.println("content = " + content + " -- evapPerDay = " + evapPerDay + " -- threshold = " + threshold);
    System.out.println("Number of days: " + data.get("numOfDays"));
    System.out.println("Threshold date: " + data.get("thresholdDate"));

    printSeparator();
  }

  @Override
  public void oddNumbersTriangle() {
    printHeader("oddNumbersTriangle");

    int rowToSum = 2;
    int sum = RelatedFunctions.oddNumbersTriangleFn(rowToSum);

    System.out.println("Sum for row " + rowToSum + " = " + sum);

    printSeparator();
  }

  @Override
  public void caffeine() {
    printHeader("caffeine");



    printSeparator();
  }

  @Override
  public void greyNuances() {
    printHeader("greyNuances");

    printSeparator();
  }

  @Override
  public void parenthesisChecker() {
    printHeader("parenthesisChecker");

    printSeparator();
  }

  @Override
  public void stringConverter() {
    printHeader("stringConverter");

    printSeparator();
  }

  @Override
  public void persistence() {
    printHeader("persistence");

    printSeparator();
  }

  @Override
  public void fraudolentBank() {
    printHeader("fraudolentBank");

    printSeparator();
  }
}
