package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMatrixTest {

    AddMatrix addMatrix;

    @Before
    public void setup(){
     addMatrix=new AddMatrix();
    }

    @After
    public void tearDown(){
        addMatrix=null;
    }

    //to compute the addition of two matrix, Read the number of rows and
    //columns as input, also the values of each matrix

    @Test
    public void givenMatrixShouldReturnTheSumOfTwoMatrix() {
        int rows = 3;
        int col = 2;
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int[][] b = {{9, 8}, {7, 6}, {5, 4}};
        int[][] c = {{10, 10}, {10, 10}, {10, 10}};
        //act
        int[][] result = addMatrix.matrixAddition(rows, col, a, b);
        //assert
        assertArrayEquals(c, result);
    }

    //to check the incorrect addition of two matrix

    @Test
    public void givenMatrixShouldReturnIncorrectAdditon(){
        int rows = 3;
        int col = 2;
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int[][] b = {{9, 8}, {7, 6}, {5, 4}};
        int[][] c = {{12, 13}, {51, 8}, {9, 14}};
        //act
        int[][] result = addMatrix.matrixAddition(rows, col, a, b);
        //assert
        assertArrayEquals(c, result);
    }


}