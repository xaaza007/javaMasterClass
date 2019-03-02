package com.jakubwisniewski;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is my String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more ";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        // Not treated as a numbers - no calculation
        String numberString = "250.55";
        numberString = numberString + "40.95";
        System.out.println("Result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);

    }
}
