package com.game.dealornodeal;

import com.game.dealornodeal.user.Prompter;

// TODO: create a game constructor that takes a prompter and initilizes fields
// DONE: put all prompts/dialog in the prompter class
// DONE: create a prompter and main class
// TODO: Revise all class methods that were once prompts and now rely on the Prompter class, look for notes throughout
// TODO: refactor where needed here in Game if methods need it - building more methods to cover duplicates if needed

public class Game {
    Board board = new Board();
    int[] eliminationRounds = {10, 5, 5, 3, 1};

    Player player = new Player();
    Host host = new Host();
    Prompter prompter = new Prompter();
    public void gameStart() {
        // ask players name and save the value
        player.setName(prompter.askPlayerName());
        // TODO: Down the road, create options for giving rules if player wants them
        // After rules option, kick off the game with the first case choice
        choosePlayerCase();
    }
    public void choosePlayerCase() {
        // chosenCase will call the prompter to get the case number and save it
        int chosenCase = prompter.chooseCase();
        // check if chosenCase is in the 1-26 range
        if (chosenCase >= 1 && chosenCase <= 26) {
            System.out.println(player.getName() + " has chosen " + chosenCase + " to hold onto through each round.");
            // DONE: revise player.chooseCase() to take in int chosenCase and find the case needed to save to player
            player.chooseCase(chosenCase);
            playGame();
        }
        // give invalid message and continue to call method until valid entry has been met
        else {
            System.out.println(chosenCase + " is an invalid entry. Choice must be between 1-26.");
            choosePlayerCase();
        }
    }
    public void playGame() {
        // may need to create a way to break out out of certain loops if player chooses to
        // accept bankOffer at any given point - maybe not. Tests will reveal this.
        while (board.board.size() > 1) {
            for (int i = 0; i < eliminationRounds.length; i++) {
                if (player.isWantsToContinue()) playRound(eliminationRounds[i]);
                else return;
            }
        }
        // call finalRound()
        finalRound();
    }
    public void playRound(int numberOfEliminations) {
        // create loop for the round with numberOfEliminations
        for (int i = 0; i < numberOfEliminations; i++) {
            // call prompter.askCaseChoice(player.getName()) to prompt player to choose case between 1-26
            int chosenCase = prompter.askCaseChoice(player.getName());
            // DONE: revise host.grabCase() to take in chosenCase from prompter
            // call host.grabCase(chosenCase)
            while (!board.caseAvailable(chosenCase)) {
                // NOTE: This can be revised later to show the available cases, but will just prevent player from
                // continuing until a valid available case is entered
                System.out.println("Case number " + chosenCase + " has already been eliminated. Please enter valid number.");
                chosenCase = prompter.askCaseChoice(player.getName());
            }
            host.grabCase(chosenCase);
            // all checks for valid number and search for case is done in other classes - Host and Board
            // DONE: ensure that user returns to playRound at same i "count" if entry is invalid and they need to call another number
            // Case is presented to player in Host
        }

        if (board.board.size() > 1) {
            // call host.callBanker()
            host.callBanker(player.getChosenCase());
            String dealOrNoDealResponse = prompter.dealOrNoDeal();
            // DONE: revise player.acceptOrDeclineDeal to take in dealOrNoDealResponse and proceed accordingly
            player.acceptOrDeclineDeal(dealOrNoDealResponse);
        }
    }
    public void finalRound(){
//        DONE: Call method in Host to get final case
        Case finalCase = host.grabFinalCase();
//        DONE: Get playercase
        Case chosenCase = player.getChosenCase();
//        DONE: Show player their case and the games case
        prompter.presentCases(finalCase, chosenCase);
//        DONE: getFinalOffer
//                DONE: PresentFinalOffer
        host.callBanker(player.getChosenCase());
//        DONE: Ask Player what they want to do
//            DONE: If accepts offer
//        DONE: Call player.acceptOffer
        player.acceptOrDeclineDeal(prompter.dealOrNoDeal());
//        If swap
        if (prompter.askToSwap(finalCase, chosenCase) && player.isWantsToContinue()) {
            //        host.revealCase(finalCase)
            host.revealCase(finalCase);
        }
//        If declines offer
        else if (player.isWantsToContinue()){
//        host.revealCaes(playerCase)
            host.revealCase(chosenCase);
        }
    }
}