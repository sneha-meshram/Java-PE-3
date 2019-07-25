package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard chessBoard;

    @Before
    public void setup() {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
    }

    //ChessBoard pattern with the help of multidimensional array,
    //where WWrepresents white color and BB represents Black color.

    @Test
    public void givenInputShouldReturnAChessBoradAsAArray() {
        int rows = 8;
        int col = 8;
        //act
        String[][] actualBoard = chessBoard.chessBoardMaker(rows, col);
        String[][] expectedBoard = {
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}
        };
        //assert
        assertEquals(expectedBoard, actualBoard);

    }

}