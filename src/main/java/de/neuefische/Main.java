package de.neuefische;

public class Main {
    public static String modulus(int number) {

        if (number < 1)
            throw new IllegalArgumentException();
        else if(number % 15 == 0)
            return "Fizz Buzz";
        else if(number % 3 == 0)
            return "Fizz";
        else if(number % 5 == 0)
            return "Buzz";

        return String.valueOf(number);
    }

    public static boolean smallerThenZero(int input) {
        if (input > 0) {
            return true;
        }
        return false;
    }

    public static int sumSquareOrSubstract(int num1, int num2) {
        if (num1 > num2) {
            return num1 + num2;
        }
        return num1 * num2;
    }
}