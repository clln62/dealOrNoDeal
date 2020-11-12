package com.game.dealornodeal.view;

import com.game.dealornodeal.user.Prompter;

public class GameViewPlay {
    GameViewBoard board = new GameViewBoard();
    int[] eliminationRounds = {10, 5, 5, 3, 1};

    GameViewPlayer player = new GameViewPlayer();
    GameViewHost host = new GameViewHost();
    Prompter prompter = new Prompter();

    public void gameStart(String playerName) {
        player.setName(playerName);
        choosePlayerCase();
    }

    public void choosePlayerCase() {
        int chosenCase = prompter.chooseCase();
        if (chosenCase >= 1 && chosenCase <= 26) {
            System.out.println("\n" + player.getName() + " has chosen " + chosenCase + " to hold onto through each round.");
            player.chooseCase(chosenCase);
            playGame();
        }
        else {
            System.out.println("\n" + chosenCase + " is an invalid entry. Choice must be between 1-26.");
            choosePlayerCase();
        }
    }

    public void playGame() {
        while (GameViewBoard.board.size() > 1) {
            for (int i = 0; i < eliminationRounds.length; i++) {
                if (player.isWantsToContinue()) playRound(eliminationRounds[i]);
                else return;
            }
        }
    }

    public void playRound(int numberOfEliminations) {
        for (int i = 0; i < numberOfEliminations; i++) {
            int chosenCase = prompter.askCaseChoice(player.getName());
            while (!board.caseAvailable(chosenCase)) {
                System.out.println("\n" + "Case number " + chosenCase + " has already been eliminated. Please enter valid number.");
                chosenCase = prompter.askCaseChoice(player.getName());
            }
            host.grabCase(chosenCase);
        }

        if (board.board.size() > 1) {
            host.callBanker(player.getChosenCase());
            String dealOrNoDealResponse = prompter.dealOrNoDeal();
            player.acceptOrDeclineDeal(dealOrNoDealResponse);
        }
    }

//    public void finalRound() {
////        DONE: Call method in Host to get final case
//        GameViewCase finalCase = host.grabFinalCase();
////        DONE: Get playercase
//        GameViewCase chosenCase = player.getChosenCase();
////        DONE: Show player their case and the games case
//        prompter.presentCases(finalCase, chosenCase);
////        DONE: getFinalOffer
////                DONE: PresentFinalOffer
//        host.callBanker(player.getChosenCase());
////        DONE: Ask Player what they want to do
////            DONE: If accepts offer
////        DONE: Call player.acceptOffer
//        player.acceptOrDeclineDeal(prompter.dealOrNoDeal());
////        If swap
//        if (prompter.askToSwap(finalCase, chosenCase) && player.isWantsToContinue()) {
//            //        host.revealCase(finalCase)
//            host.revealCase(finalCase);
//        }
////        If declines offer
//        else if (player.isWantsToContinue()) {
////        host.revealCaes(playerCase)
//            host.revealCase(chosenCase);
//        }
//    }
}
