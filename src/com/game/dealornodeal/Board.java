package com.game.dealornodeal;

import java.util.*;

// TODO: decide if we want to keep board list static or not

class Board {
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
        Collections.shuffle(values);
        // NOTE: This can be simplified, but was created this way for time purposes and to simply to reach MVP
        for (int i = 0; i < values.size(); i++) {
            // create a new Case
            Case briefcase = new Case();
            // add case number and case value to new Case
            briefcase.setCaseNumber(i + 1);
            briefcase.setCaseValue(values.get(i));
            // add new case to board
            board.add(briefcase);
        }
    }
    public static void remove(int index) {
        // find the Case.caseNumber in board equal to caseNumber
        // remove chosen case from board
        board.remove(index);
    }
    // this method is currently not being utilized - giveCase already does work of finding Case and calling remove with caseNumber
//    public static void remove(Case input) {
//        // find the Case.caseNumber in board equal to caseNumber
//        // remove chosen case from board
//    }
    public static Case giveCase(int caseNumber) {
        Case returnCase = null;
        // DONE: Establish what happens if the case called does not exist - this goes all the way back to Game
        // find the Case.caseNumber equal to caseNumber if exists
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getCaseNumber() == caseNumber) {
                returnCase = board.get(i);
                // call removeFromBoard with caseNumber
                remove(i);
                break;
            }
        }
        // return case
        return returnCase;
    }
    public static Case giveFinalCase() {
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
