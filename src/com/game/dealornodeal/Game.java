package com.game.dealornodeal;

import com.game.dealornodeal.user.Prompter;

import java.util.List;


public class Game {
    int[] eliminationRounds = {10, 5, 5, 3, 1};

    Board board = new Board();
    Player player = new Player();
    Host host = new Host();
    Prompter prompter;

    public Game(Prompter prompter)
    {
        this.prompter = prompter;
    }

    public void gameStart() {
        player.setName(prompter.askPlayerName());
        prompter.seeGameRules(player.getName());
        System.out.println("\n" + "We'll start by letting you claim your first case before we start the elimination round.");
        choosePlayerCase();
    }

    void choosePlayerCase() {
        int chosenCase = prompter.chooseCase();
        if (chosenCase >= 1 && chosenCase <= 26) {
            System.out.println("\n" + player.getName() + " has chosen " + chosenCase + " to hold onto through each round.");
            player.chooseCase(chosenCase);
            playGame();
        }
        else {
            System.out.println("\n" + chosenCase + " is an invalid entry.");
            board.caseAvailableList();
            choosePlayerCase();
        }
    }

    void playGame() {
        while (Board.board.size() > 1) {
            for (int i = 0; i < eliminationRounds.length; i++) {
                if (player.isWantsToContinue()) playRound(eliminationRounds[i]);
                else return;
            }
        }
        finalRound();
    }

    boolean playRound(int numberOfEliminations)
    {
        boolean result = false;
        for (int i = 0; i < numberOfEliminations; i++) {
            List<Integer> available = board.caseAvailableList();
            int chosenCase = prompter.askCaseChoice(player.getName());

            while (!board.caseAvailable(chosenCase)) {
                if (chosenCase < 1 || chosenCase > 26) {
                    System.out.println("\n" + chosenCase + " is not a valid case number.");
                }
                else {
                    System.out.println("\n" + "Case number " + chosenCase + " has already been eliminated. Please enter valid number.");
                }
                System.out.println("Available cases to eliminate are: " + available);
                chosenCase = prompter.askCaseChoice(player.getName());
                result = true;
            }
            host.grabCase(chosenCase);
        }

        if (board.board.size() > 1) {
            host.callBanker(player.getChosenCase());
            String dealOrNoDealResponse = prompter.dealOrNoDeal();
            player.acceptOrDeclineDeal(dealOrNoDealResponse);
        }
        return result;
    }

    void finalRound() {
        Case finalCase = host.grabFinalCase();
        Case chosenCase = player.getChosenCase();
        prompter.presentCases(finalCase, chosenCase);

        host.callBanker(player.getChosenCase());
        player.acceptOrDeclineDeal(prompter.dealOrNoDeal());

        if (prompter.askToSwap(finalCase, chosenCase) && player.isWantsToContinue()) {
            host.revealCase(finalCase);
        }
        else if (player.isWantsToContinue()) {
            host.revealCase(chosenCase);
        }
    }
}