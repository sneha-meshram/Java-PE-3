package com.stackroute.pe3;

public class ChessBoard {

    public String[][] chessBoardMaker(int row, int column) {
        int i;
        int j;
        String[][] result = new String[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if ((i + j) % 2 == 0) {
                    result[i][j] = "WW";
                } else {
                    result[i][j] = "BB";
                }
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
        return result;
    }

}
