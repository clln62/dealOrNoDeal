package com.game.dealornodeal;

import java.util.*;

class Board {
    //    public static Map<Integer, Double> board = new HashMap<>();
    public static List<Case> board = new ArrayList<>();

    List<Double> values = new ArrayList<>(Arrays.asList(.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0, 200.0, 300.0, 400.0,
            500.0, 750.0, 1000.0, 5000.0, 10000.0, 25000.0, 50000.0, 75000.0, 100000.0, 200000.0, 300000.0, 400000.0, 500000.0,
            750000.0, 1000000.0));

    public Board() {
        populateBoard();
    }

    private void populateBoard() {
        // set all to Field board
        // shuffle values with Collections.shuffle()
        // assign value to each caseNumber 1-26

    }

    public static void removeFromBoard(int caseNumber) {
        // find the Case.caseNumber in board equal to caseNumber
        // remove chosen case from board
    }

    public static void removeFromBoard(Case input) {
        // find the Case.caseNumber in board equal to caseNumber
        // remove chosen case from board
    }

    public Case giveCase(int caseNumber) {
        // find the Case.caseNumber equal to caseNumber if exists
        // call removeFromBoard with caseNumber

        // return case
        return null;
    }
}
