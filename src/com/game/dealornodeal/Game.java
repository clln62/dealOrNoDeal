package com.game.dealornodeal;

class Game {
    Board board = new Board();
    int[] eliminationRounds = {10, 5, 5, 3, 1};
    int choiceCount = 0;
    int pointer = 0;
    Player player = new Player();
    Host host = new Host();

    public void askPlayerName() {
        System.out.println("What is your name?");
        // prompt player to enter name
        // call setName()
    }

    public void choosePlayerCase() {
        // call player.chooseCase()
        playRound();
    }

    public void playRound() {
        // TBD
        // player chooses a case
        // host grabs case with case number
        // Case is presented to player
        //
        // player chooses deal or no deal on offer

        // check choiceCount with eliminationRounds[pointer] for each round


    }

}
