package com.game.dealornodeal;

class Player
{
    private String name;
    private Case chosenCase;

    private boolean wantsToContinue = true;

    public Player() {
    }

    public void acceptOrDeclineDeal(String response) {
        if (response.toUpperCase().equals("Y")) acceptDeal();
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
}
