package com.game.dealornodeal;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class Banker{

    private static double offerAmount;

    public Banker()
    {

    }

    public static double calculateDeal() {

        List<Double> values = new ArrayList<>();
        Board.board.forEach(x -> values.add(x.getCaseValue()));
        //if (playersCase.getCaseValue() != 0.0)
        //    values.add(playersCase.getCaseValue());
        double max = values.stream().max(Double::compare).orElseThrow(NoSuchElementException::new);
        return offerAmount = max * 0.75;

    }


    public static double getOfferAmount() {
        calculateDeal();
        return offerAmount;
    }
}
