package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studentMarks;

    @After
    public void setup() {
        studentMarks = new StudentMarks();
    }

    @Before
    public void tearDown() {
        studentMarks = null;
    }

    //the grade is between 0 and 100

    @Test
    public void givenInputShouldReturnGradeOfStudent() {
        //act
        int numberOfStudents = 3;
        int[] gradesOfStudents = {33, 44, 55};

        String Result = studentMarks.gradeDetails(numberOfStudents, gradesOfStudents);

        //assert
        assertEquals("inputs are in range", Result);

    }

    //the grade is out of the range

    @Test
    public void givenInputShouldReturnGradesAreNotInRange() {
        //act
        int numberOfStudents = 0;
        int[] gradesOfStudents = {-33, -44, 105};

        String Result = studentMarks.gradeDetails(numberOfStudents, gradesOfStudents);

        //assert
        assertEquals("error,inputs are not in ranger", Result);
    }

//    @Test(expected = NullPointerException.class)
//    public void givenNullInputThrowException(){
//        studentMarks.gradeDetails(null,null);
//    }
}