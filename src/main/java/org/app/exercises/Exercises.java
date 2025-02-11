package org.app.exercises;

public class Exercises implements ExercisesI {
    private static Exercises INSTANCE = new Exercises();

    private Exercises(){}

    public static Exercises getInstance() {
        return INSTANCE;
    }

    // ----------------------------------------------------

    @Override
    public void drinkFactory() {

    }

    @Override
    public void oddNumbersTriangle() {

    }

    @Override
    public void caffeine() {

    }

    @Override
    public void greyNuances() {

    }

    @Override
    public void parenthesisChecker() {

    }

    @Override
    public void stringConverter() {

    }

    @Override
    public void persistence() {

    }
}
