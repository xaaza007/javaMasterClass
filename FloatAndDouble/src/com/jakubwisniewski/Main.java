package com.jakubwisniewski;

public class Main {

  public static void main(String[] args) {
    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5d / 3d;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("myFloatValue = " + myFloatValue);
    System.out.println("myDoubleValue = " + myDoubleValue);

    double pounds = 400d;
    double convertToKillograms = pounds * 0.45359237;
    System.out.println("One pound is equals to " + convertToKillograms);
  }
}
