package com.game.dealornodeal;

import java.util.*;

class Banker {
    private static double offerAmount;

    // TODO
    public static double calculateDeal(Case playersCase) {
        List<Double> values = new ArrayList<>();
        Board.board.forEach(x -> values.add(x.getCaseValue()));
        if (playersCase != null)
            values.add(playersCase.getCaseValue());
        double max = values.stream().max(Double::compare).orElseThrow(NoSuchElementException::new);
        double x = values.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        offerAmount = Math.round(((max + x) / 2) * 0.75);
        return offerAmount;
    }

    public static double getOfferAmount(Case playerCase) {
        calculateDeal(playerCase);
        return offerAmount;
    }
}
