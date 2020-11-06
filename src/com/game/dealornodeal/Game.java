package com.game.dealornodeal;

// TODO: create a game constructor that takes a prompter and initilizes fields
// TODO: put all prompts/dialog in the prompter class
// TODO: create a prompter and main class
class Game {
    Board board = new Board();
    int[] eliminationRounds = {10, 5, 5, 3, 1};
    int pointer = 0;
    Player player = new Player();
    Host host = new Host();


    public void playGame() {
//        while(board.size > 1){
//            For ( i = 0, i < eliminationRounds.length, i++){
//                playRound(eliminationRounds[i])
//            }
//        }
        // call finalRound()
    }

    public void choosePlayerCase() {
        // call player.chooseCase()
        playGame();
    }


    public void playRound(int numberOfEliminations) {
            // create loop for the round with numberOfEliminations
                // TBD
                // player chooses a case
                // host grabs case with case number
                // Case is presented to player


            // call host.callBanker()
            // call player.dealOrNoDeal()

    }

    public void finalRound(){
//        Getfinal case
//                Present final case number
//        Get playercase
//        Present playerCaseNumber
//        getFinalOffer
//                PresentFinalOffer
//        Ask Player what they want to do
//            If accepts offer
//        Call player.acceptOffer
//        If swap
//		“You swapped!”
//        host.revealCase(finalCase)
//        If declines offer
//        host.revealCaes(playerCase)
    }


}
