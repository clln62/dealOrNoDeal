package com.game.dealornodeal;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardTest
{
    Board board;

    @Before
    public void init()
    {

        Board.board.clear();
        board = new Board();
    }

    @Test
    public void removeOneFromBoard_shouldMakeBoardSize25()
    {
        assertEquals(26,Board.board.size());
        Board.board.remove(25);
        assertEquals(25,Board.board.size());
    }

    @Test
    public void giveCaseFromNum_shouldReturnAskedCase()
    {
        assertEquals(1,Board.giveCase(1).getCaseNumber());

    }

    @Test
    public void giveFinalCase_shouldReturnFinalCaseInBoard()
    {
        int boardSize = Board.board.size();
        // Starting at index 1 remove all remaining cases till one is left
        for (int i = 1; i < boardSize; i++) {
            // Once case is removed it shifts all indices to left so "1" needs to be removed all the time
            Board.board.remove(1);
        }
        assertFalse(Board.board.isEmpty());
        assertEquals(1,Board.board.size());
        assertEquals(1, Board.giveFinalCase().getCaseNumber());
    }

    @Test
    public void caseAvailableOnExistingCase_shouldReturnTrue()
    {
        assertFalse(Board.board.isEmpty());
        assertTrue(Board.caseAvailable(1));
    }

    @Test
    public void caseAvailableOnNonExistingCase_shouldReturnFalse()
    {
        assertFalse(Board.board.isEmpty());
        Board.board.remove(25);
        assertFalse(Board.caseAvailable(26));
    }

}