package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ReadFileTest {

    ReadFile readTheFile;

    @Before
    public void setup(){
        readTheFile=new ReadFile();
    }

    @After
    public void tearDown(){
        readTheFile=null;
    }

    //to read the content of a text file, convert the content in upper case and print
    //the same in console

    @Test
    public void givenFileShouldReturnContentInUpperCase() {
        String content = readTheFile.readAllBytes("file.txt");
        String expectedResult = "THIS IS TEST";
        //act
        String actualResult = readTheFile.getfileString(content);
        //assert
        assertEquals(expectedResult, actualResult);
    }

    //given file path is present or not

    @Test(expected = FileNotFoundException.class)
    public void givenInputShouldCheckWrongFileName(){
        readTheFile.readAllBytes("test.text");
    }

    //given input is incorrect file path

    @Test(expected = NullPointerException.class)
    public void givenInputShouldCheckWrongFileName(){
        readTheFile.readAllBytes(null);
    }

}