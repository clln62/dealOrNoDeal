package com.game.dealornodeal;

import java.util.*;

// TODO: decide if we want to keep board list static or not

class Board {
    public static List<Case> board = new ArrayList<>();

    private List<Double> values = new ArrayList<>(Arrays.asList(.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0, 200.0, 300.0, 400.0,
            500.0, 750.0, 1000.0, 5000.0, 10000.0, 25000.0, 50000.0, 75000.0, 100000.0, 200000.0, 300000.0, 400000.0, 500000.0,
            750000.0, 1000000.0));

    public Board() {
        populateBoard();
    }

    private void populateBoard() {
        Collections.shuffle(values);
        for (int i = 0; i < values.size(); i++) {
            Case briefcase = new Case();
            briefcase.setCaseNumber(i + 1);
            briefcase.setCaseValue(values.get(i));
            board.add(briefcase);
        }
    }

    public static void remove(int index) {
        board.remove(index);
    }

    static Case giveCase(int caseNumber) {
        Case returnCase = null;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getCaseNumber() == caseNumber) {
                returnCase = board.get(i);
                remove(i);
                break;
            }
        }
        return returnCase;
    }

    public static Case giveFinalCase() {
        return board.get(0);
    }

    public static boolean caseAvailable(int chosenCase) {
        boolean caseIsAvailable = false;
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getCaseNumber() == chosenCase) {
                caseIsAvailable = true;
            }
        }
        return caseIsAvailable;
    }

    public List caseAvailableList() {
        List<Integer> available = new ArrayList<>();
        for(Case briefcase : getBoard()) {
            available.add(briefcase.getCaseNumber());
        }
        System.out.println("Available cases to choose from are: " + available);
        return available;
    }

    public static List<Case> getBoard() {
        return board;
    }
}
