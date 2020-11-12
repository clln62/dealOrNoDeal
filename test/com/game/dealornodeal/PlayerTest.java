package com.game.dealornodeal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest
{
    Player player;
    Board board;

    @Before
    public void setUp()
    {
        player = new Player();
        board = new Board();
    }

    @Test
    public void chooseCase()
    {
        player.chooseCase(1);
        assertNotNull(player.getChosenCase());
        assertEquals(1, player.getChosenCase().getCaseNumber());
    }

    @Test
    public void acceptOrDeclineDeal_declineDealShouldKeepWantToContinueTrue()
    {
        player.acceptOrDeclineDeal("N");
        assertTrue(player.isWantsToContinue());
    }

    @Test
    public void acceptOrDeclineDeal_acceptDealShouldSetWantToContinueFalse()
    {
        player.acceptOrDeclineDeal("Y");
        assertFalse(player.isWantsToContinue());
    }
}