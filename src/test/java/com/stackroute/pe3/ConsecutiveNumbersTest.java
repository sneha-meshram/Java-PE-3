package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers consecutiveNumbers;

    // Create object before running the test cases.
    @Before
    public void setUp() {
        this.consecutiveNumbers = new ConsecutiveNumbers();
    }

    //Destroy object after running the test cases.
    @After
    public void tearDown() {
        this.consecutiveNumbers = null;
    }

    @Test
    public void givenNonConsecutiveIntegersShouldReturnNonConsectiveNumbers() {
        int[] numbers = {10, 452, 73, 84, 25, 96, 17};
        String actualResult = consecutiveNumbers.checkConsectiveNumbers(numbers);
        assertEquals("The numbers are not Consecutive", actualResult);
    }

    @Test
    public void givenConsecutiveIntegersShouldReturnConsectiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        String actualResult = consecutiveNumbers.checkConsectiveNumbers(numbers);
        assertEquals("The numbers are Consecutive", actualResult);
    }

    @Test
    public void givenConsecutiveCharactersShouldReturnConsectiveNumbers() {
        int[] numbers = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String actualResult = consecutiveNumbers.checkConsectiveNumbers(numbers);
        assertEquals("The numbers are Consecutive", actualResult);
    }
}
