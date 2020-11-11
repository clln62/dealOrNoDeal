package com.game.dealornodeal;

class Player {
    private String name;
    private Case chosenCase;

    private boolean wantsToContinue = true;

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
        System.out.println(getName() + " has accepted the deal and will be going home with: $" + Banker.getOfferAmount(getChosenCase()) + "\n");
        wantsToContinue = false;
    }

    private void declineDeal() {
        System.out.println(getName() + " has declined the amount of: $" + Banker.getOfferAmount(getChosenCase()) + "\n");
    }

    public void chooseCase(int chosenCase) {
        // find case in board that matches the case number submitted
        // call setter for chosenCase with the case from Board
        setChosenCase(Board.giveCase(chosenCase));
    }

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

    public boolean isWantsToContinue() {
        return wantsToContinue;
    }

    //    public boolean isOfferAcceptance() {
//        return offerAcceptance;
//    }
//
//    public void setOfferAcceptance(boolean offerAcceptance) {
//        this.offerAcceptance = offerAcceptance;
//    }
}
