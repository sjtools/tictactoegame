package com.sjtools.tictactoe.board.decors;

import com.sjtools.tictactoe.board.ifc.TicTacToeBoardIfc;

import java.io.PrintStream;

/**
 * Created by sjtools on 16.02.2017.
 */
public interface TicTacToeBoardGridDecorIfc
{
    /**
     * Draws board grid
     * @param stream PrintStream to write to
     * @param board board to display
     */
    void displayGrid(PrintStream stream, TicTacToeBoardIfc board);
}
