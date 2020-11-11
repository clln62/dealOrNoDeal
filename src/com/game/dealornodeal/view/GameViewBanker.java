package com.game.dealornodeal.view;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class GameViewBanker {
    private static double offerAmount;


    public static double calculateDeal(GameViewCase playersCase) {
        List<Double> values = new ArrayList<>();
        GameViewBoard.board.forEach(x -> values.add(x.getCaseValue()));
        if (playersCase != null)
            values.add(playersCase.getCaseValue());
        double max = values.stream().max(Double::compare).orElseThrow(NoSuchElementException::new);
        double x = values.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        offerAmount = Math.round(((max + x) / 2) * 0.75);
        return offerAmount;
    }

    public static double getOfferAmount(GameViewCase playerCase) {
        calculateDeal(playerCase);
        return offerAmount;
    }
}
