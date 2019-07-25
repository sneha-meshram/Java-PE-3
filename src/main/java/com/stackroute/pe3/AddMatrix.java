package com.stackroute.pe3;

public class AddMatrix {


    public int[][] matrixAddition(int rows, int col, int[][] a, int[][] b) {
        int[][] addMatrix = new int[rows][col];

        for (int i = 0; i < rows; i++)
        {
            for (int k = 0; k < col; k++)
            {
                addMatrix[i][k] = a[i][k] + b[i][k];
            }
        }
        return addMatrix;
    }
}