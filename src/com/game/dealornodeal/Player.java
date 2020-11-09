package com.game.dealornodeal;

class Player {
    private String name;
    private boolean offerAcceptance;
    public Case chosenCase;



    public Player() {

    }

    public void acceptOrDeclineDeal(String Response) {
        // ask player for deal or no deal response
        // if deal call acceptDeal()
        // if no deal call declineDeal()
    }

    private void acceptDeal() {
        System.out.println(getName() + " has accepted the amount of: " + Banker.getOfferAmount());
        // end game
    }

    private void declineDeal() {
        System.out.println(getName() + " has declined the amount of: " + Banker.getOfferAmount());

    }

    // no longer needed - work is done in Game - Player doesn't have access to Board
//    public void chooseCase() {
//        // ask player what case they want
//        // find case in board that matches the case number submitted
//        // call setter for chosenCase with the case from Board
//    }

    public int eliminateCase() {
        // ask player what case they want

        return 0;
    }


    public Case getChosenCase() {
        return chosenCase;
    }

    public void setChosenCase(Case chosenCase) {
        Board.remove(chosenCase);
        this.chosenCase = chosenCase;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOfferAcceptance() {
        return offerAcceptance;
    }

    public void setOfferAcceptance(boolean offerAcceptance) {
        this.offerAcceptance = offerAcceptance;
    }
}
