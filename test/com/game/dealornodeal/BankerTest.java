//package com.game.dealornodeal;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.NoSuchElementException;
//
//import static org.junit.Assert.*;
//
//public class BankerTest
//{
//    Banker banker;
//    Board board;
//    Player player;
//
//    @Before
//    public void init()
//    {
//        player = new Player();
//        banker = new Banker();
//        board = new Board();
//    }
//    @Test
//    public void calculateDealWithFullBoard_shouldReturn75PercentOfMax()
//    {
//        assertNotNull(board);
//        //assertEquals(750000.0,Banker.calculateDeal(player.getChosenCase()), 0.01);
//    }
//    @Test(expected=NoSuchElementException.class)
//    public void calculateDealWithEmptyBoard_shouldReturnNoSuchElementException()
//    {
//        Board.board.removeAll(Board.board);
//        Board.board.forEach(x -> Board.remove(x.getCaseNumber()));
//        assertNotNull(board);
//        //Banker.calculateDeal(player.getChosenCase());
//    }
//
//    @Test
//    public void getOfferAmountWithFullBoard_shouldReturnOfferFromCalculateDeal()
//    {
//        //assertEquals(750000.0,Banker.getOfferAmount(player.getChosenCase()), 0.01);
//    }
//
//    @Test
//    public void getOfferAmountWithPartialBoard_shouldReturnOfferFromCalculateDeal()
//    {
//        //assertEquals(750000.0,Banker.getOfferAmount(player.getChosenCase()), 0.01);
//    }
//}