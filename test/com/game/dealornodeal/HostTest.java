package com.game.dealornodeal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HostTest
{
    Player player;
    Host host;
    Banker banker;
    Board board;

    @Before
    public void setUp()
    {
        player = new Player();
        host = new Host();
        board = new Board();
    }

    @Test
    public void grabFinalCase()
    {
        int boardSize = Board.board.size();
        // Starting at index 1 remove all remaining cases till one is left
        for (int i = 1; i < boardSize; i++) {
            // Once case is removed it shifts all indices to left so "1" needs to be removed all the time
            Board.board.remove(1);
        }
        assertFalse(Board.board.isEmpty());
        assertEquals(1,Board.board.size());
        assertEquals(1, Board.board.get(0).getCaseNumber());
    }
}