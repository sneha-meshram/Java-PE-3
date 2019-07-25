package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateTest {

    CalculateDate calculateDate;

    @Before
    public  void setup(){
        calculateDate=new CalculateDate();
    }

    @After
    public void tearDown(){
        calculateDate=null;
    }

    //calculate first and last date of a week

    @Test
    public void shouldProvideDateOfCurrentWeek(){
    String[] result=calculateDate.checkFirstAndLastDateOfWeek();
    String[] expectedResult={"Mon 15/07/2017 Sun 21/07/2017"};
    //assert
    assertArrayEquals(expectedResult, result);

    }
}