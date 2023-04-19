package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
   void returnFizz_IfNumberIs3() {
       assertEquals("Fizz", Main.modulus(3));
   }

    @Test
    void returnBuzz_IfNumberIs5() {
        assertEquals("Buzz", Main.modulus(5));
    }

    @Test
    void returnFizzBuzz_IfNumberIs15() {
        assertEquals("Fizz Buzz", Main.modulus(15));
    }

    @Test
    void returnTheNumber_anyDefaultNumber() {
        assertEquals("4", Main.modulus(4));
    }

    @Test
    void testBiggerThenZero() {
       assertTrue(Main.smallerThenZero(99));
    }

    @Test
    void testSmallerThenZero() {
        assertFalse(Main.smallerThenZero(-99));
    }

    @Test
    void testFirstNumberBiggerThenAddition() {
       assertEquals(11, Main.sumSquareOrSubstract(6, 5));
    }

    @Test
    void testFirstNumberSmallerThenMultiplication() {
        assertEquals(30, Main.sumSquareOrSubstract(5, 6));
    }

}