package com.game.dealornodeal;

class Player {
    private String name;
    // right now offerAcceptance isn't being used. If not being used when complete - remove
//    private boolean offerAcceptance;
    public Case chosenCase;



    public Player() {

    }

    public void acceptOrDeclineDeal(String response) {
        // set response to capital in case user enters lower case character
        // if deal call acceptDeal()
        if (response.toUpperCase().equals("Y")) acceptDeal();
        // if no deal call declineDeal()
        else if (response.toUpperCase().equals("N")) declineDeal();
    }

    private void acceptDeal() {
        System.out.println(getName() + " has accepted the amount of: " + Banker.getOfferAmount());
        // TODO: end game
    }

    private void declineDeal() {
        System.out.println(getName() + " has declined the amount of: " + Banker.getOfferAmount());

    }


    public void chooseCase(int chosenCase) {
        // find case in board that matches the case number submitted
        // call setter for chosenCase with the case from Board
        setChosenCase(Board.giveCase(chosenCase));
    }

    // No longer needed - this is all done within the prompter and Game
//    public int eliminateCase() {
//        // ask player what case they want
//
//        return 0;
//    }


    public Case getChosenCase() {
        return chosenCase;
    }

    public void setChosenCase(Case chosenCase) {
        this.chosenCase = chosenCase;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean isOfferAcceptance() {
//        return offerAcceptance;
//    }
//
//    public void setOfferAcceptance(boolean offerAcceptance) {
//        this.offerAcceptance = offerAcceptance;
//    }
}
