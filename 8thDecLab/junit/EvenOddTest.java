package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void ifFourEven() {
        // creating object of EvenOdd
        var obj = new EvenOdd();
        assertEquals(true, obj.findEvenOrOdd(4));
        // we all know 4 is an even number, and we are expecting our method will return true
    }
    // Passing odd number to check test case fails or not
    @Test
    void isSevenEven() {
        var obj = new EvenOdd();
        assertEquals(true, obj.findEvenOrOdd(7));
        // we all know 7 is an odd number, if this test not fails that means our code isn't working properly
    }
}
/*
After running this test,

    ✅ Case 1 Passed
    🛑 Case 2 Failed

    So that means out program working perfectly 🥳

 */
