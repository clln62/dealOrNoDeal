package com.game.dealornodeal.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class GameViewBoard {
    public static List<GameViewCase> board = new ArrayList<>();

    List<Double> values = new ArrayList<>(Arrays.asList(.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0, 200.0, 300.0, 400.0,
            500.0, 750.0, 1000.0, 5000.0, 10000.0, 25000.0, 50000.0, 75000.0, 100000.0, 200000.0, 300000.0, 400000.0, 500000.0,
            750000.0, 1000000.0));

    public GameViewBoard() {
        populateBoard();
    }

    private void populateBoard() {
        Collections.shuffle(values);
        for (int i = 0; i < values.size(); i++) {
            GameViewCase briefcase = new GameViewCase();
            briefcase.setCaseNumber(i + 1);
            briefcase.setCaseValue(values.get(i));
            board.add(briefcase);
        }
    }

    public static void remove(int index) {
        board.remove(index);
    }

    public static GameViewCase giveCase(int caseNumber) {
        GameViewCase returnCase = null;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getCaseNumber() == caseNumber) {
                returnCase = board.get(i);
                remove(i);
                break;
            }
        }
        return returnCase;
    }

    public static GameViewCase giveFinalCase() {
        return board.get(0);
    }

    public boolean caseAvailable(int chosenCase) {
        boolean caseIsAvailable = false;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getCaseNumber() == chosenCase) {
                caseIsAvailable = true;
            }
        }
        return caseIsAvailable;
    }
}
