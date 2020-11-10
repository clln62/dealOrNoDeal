package com.game.dealornodeal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

class Banker extends Board{

    private static double offerAmount;

    public static double calculateDeal(List<Case> board) {

        List<Double> values = new ArrayList<>();
        board.forEach(x -> values.add(x.getCaseValue()));
        double max = values.stream().max(Double::compare).orElseThrow(NoSuchElementException::new);
        return offerAmount = max * 0.75;

    }


    public static double getOfferAmount(Case playerCase) {
        calculateDeal(Board.board);
        return offerAmount;
    }
}
