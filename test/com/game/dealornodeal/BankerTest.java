package com.game.dealornodeal;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankerTest {
    Banker banker;
    Board board;
    Player player;

    @Before
    public void init() {
        player = new Player();
        banker = new Banker();
        board = new Board();
    }

    @Test
    public void calculateDealWithFullBoard_shouldReturnOfferAmount() {
        assertNotNull(board);
        assertEquals(424304.0, Banker.calculateDeal(player.getChosenCase()), 0.01);
    }

    @Test(expected = NoSuchElementException.class)
    public void calculateDealWithEmptyBoard_shouldReturnNoSuchElementException() {
        Board.board.clear();
        assertNotNull(board);
        Banker.calculateDeal(player.getChosenCase());
    }

    @Test
    public void getOfferAmountWithFullBoard_shouldReturnOfferFromCalculateDeal() {
        assertEquals(424304.0, Banker.getOfferAmount(player.getChosenCase()), 0.01);
    }

    @Test
    public void getOfferAmountWithPartialBoard_shouldReturnOfferFromCalculateDeal() {
        Board.board.clear();
        Case case1 = new Case();
        case1.setCaseNumber(1);
        case1.setCaseValue(500000.0);
        Case case2 = new Case();
        case2.setCaseNumber(2);
        case2.setCaseValue(750000.0);
        Case case3 = new Case();
        case3.setCaseNumber(3);
        case3.setCaseValue(1000000.0);
        Board.board.add(case1);
        Board.board.add(case2);
        Board.board.add(case3);
        assertEquals(656250.0, Banker.getOfferAmount(player.getChosenCase()), 0.01);
    }
}