package com.game.dealornodeal.view;

class GameViewPlayer {
    private String name;
    private GameViewCase chosenCase;

    private boolean wantsToContinue = true;

    public GameViewPlayer() {

    }

    public void acceptOrDeclineDeal(String response) {
        if (response.toUpperCase().equals("Y")) acceptDeal();
        else if (response.toUpperCase().equals("N")) declineDeal();
    }

    private void acceptDeal() {
        System.out.println(getName() + " has accepted the deal and will be going home with: $" + GameViewBanker.getOfferAmount(getChosenCase()) + "\n");
        wantsToContinue = false;
    }

    private void declineDeal() {
        System.out.println(getName() + " has declined the amount of: $" + GameViewBanker.getOfferAmount(getChosenCase()) + "\n");
    }

    public void chooseCase(int chosenCase) {
        setChosenCase(GameViewBoard.giveCase(chosenCase));
    }

    public GameViewCase getChosenCase() {
        return chosenCase;
    }

    public void setChosenCase(GameViewCase chosenCase) {
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
