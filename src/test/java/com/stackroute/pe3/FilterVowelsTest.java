package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilterVowelsTest {

    FilterVowels filterVowels;

    @Before
    public void setup(){
        filterVowels=new FilterVowels();
    }

    @After
    public void tearDown(){
        filterVowels=null;
    }

    //an array of places, Loop round and remove the vowels. Display the
    //new words in console

    @Test
    public void givenArrayFilterOutVowels() {
        String[] placesArray = {"India", "United States", "Germany"};
        String[] expectedArray = {"Ind", "untd", "Germny"};
        //act
        String[] resultArray = filterVowels.removeWovels(placesArray);
        //assert
        assertArrayEquals(expectedArray, resultArray);
    }

    //whether the given input array is null

    @Test
     public void givenNullArray(){
        String[] placesArray= null;
        assertNull(filterVowels.removeWovels(placesArray);
        }
}