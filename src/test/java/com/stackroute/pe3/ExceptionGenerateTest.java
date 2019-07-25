package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionGenerateTest {

    ExceptionGenerate Exception;
    @Before
    public void setUp(){
        Exception = new ExceptionGenerate();
    }

    @After
    public void tearDown(){
        Exception=null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenArrayExceptionShouldThrowNegativeArraySizeExcpetion() {
        Exception.givenException("value");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void givenArraySizeIsOutOfBound() {
        System.out.println("Inside testPrintMessage()");
        Exception.givenException(String[] array);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenArrayExceptionShouldThrowNullPointerExcpetion() {
        Exception.givenException(array);

    }
}