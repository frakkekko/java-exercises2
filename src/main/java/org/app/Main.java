package org.app;

import org.app.exercises.Exercises;

public class Main {
  public static void main(String[] args) {
    Exercises exercises = Exercises.getInstance();
    exercises.drinkFactory();
    exercises.oddNumbersTriangle();
    exercises.caffeine();
    exercises.greyNuances();
    exercises.parenthesisChecker();
  }
}
