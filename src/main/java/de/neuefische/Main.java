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
}