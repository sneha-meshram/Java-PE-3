package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    WordFrequency wordFrequency;

    @Before
    public void setup(){
        wordFrequency=new WordFrequency();
    }

    @After
    public void tearDown(){
        wordFrequency=null;
    }

    //Read the file content and return the frequency of a word given in a file.

    @Test
    public void givenStringCalculateFrequencyOfWords(){
   // String[] content=wordFrequency.readAllBytes("frequency.txt");
       // String[] content={"i am a man i like to sleep i have a home"};
    String[] expectedResult= new String[]
            {
            "i = 2","am - 1","a - 2","man - 1","have-1","home - 1"
            };
    //act
      String[] result=wordFrequency.calculateFrequency(String[] content);
      //assert
        assertArrayEquals(expectedResult, result);
    }

    //the given file path is not present

   // @Test(expected = FileNotFoundException.class)
    //public void givenInputShouldCheckWrongFileName()
    {
        wordFrequency.readAllBytes("test.text");
    }


}