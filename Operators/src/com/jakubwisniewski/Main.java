package com.jakubwisniewski;

public class Main {

  public static void main(String[] args) {
    int result = 1 + 2;
    System.out.println("1 + 2 = " + result);

    int previousResult = result;

    result = result - 1;
    System.out.println(previousResult + " - 1 result = " + result);

    previousResult = result;
    result = result * 10;
    System.out.println(previousResult + " * 10 = " + result);

    previousResult = result;
    result = result % 3;
    System.out.println(previousResult + " % 3 = " + result);

    previousResult = result;
    result = result + 1;
    System.out.println("Result is now " + result);
    result++;
    System.out.println("Result is now " + result);
    result--;
    System.out.println("Result is now " + result);

    result += 2;
    System.out.println("Result is now " + result);
    result *= 10;
    System.out.println("Result is now " + result);
    result -= 10;
    System.out.println("Result is now " + result);
    result /= 10;
    System.out.println("Result is now " + result);

    boolean isAlien = false;
    if (isAlien == false)
      System.out.println("It's not an Alien");

    int topScore = 80;
    if (topScore < 100)
      System.out.println("You got the high score!");

    int secondTopScore = 60;
    if ((topScore > secondTopScore) && (topScore < 100))
      System.out.println("Greater than top score and less than 100");

    if ((topScore > 90) || (secondTopScore <= 90))
      System.out.println("One of this tests is true");

    int newValue = 50;
    if (newValue == 50)
      System.out.println("This is true");

    boolean isCar = false;
    if (isCar = true)
      System.out.println("This is not supposed to happen");

    // Task
    double myFirstDouble = 20d;
    double mySecondDouble = 80d;
    double sumResult = (myFirstDouble + mySecondDouble) * 25;
    System.out.println("sumResult = " + sumResult);
    double reminder = sumResult % 40d;
    System.out.println("Reminder is " + reminder);
    if (reminder <= 20)
      System.out.println("Total was over limit");

  }
}
