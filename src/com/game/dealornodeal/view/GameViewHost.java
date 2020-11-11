package com.game.dealornodeal.view;

// TODO: There may be some redundancies here from simplification in the addition of prompter ->
// simply followed old notes to finish the application, refactoring could be in order

class GameViewHost {

    private static String name = "Howie";

    public GameViewHost() {
    }

    public GameViewHost(String name) {
        this.name = name;
    }


    public GameViewCase grabFinalCase() {
        return GameViewBoard.giveFinalCase();
    }

    public void grabCase(int caseNumber) {
        revealCase(GameViewBoard.giveCase(caseNumber));
    }

    public void revealCase(GameViewCase input) {
        System.out.println("\n" + "You chose case number " + input.getCaseNumber() + " with a value of $" + input.getCaseValue());

    }

    public void callBanker(GameViewCase playerCase) {
        presentDeal(GameViewBanker.getOfferAmount(playerCase));
    }

    public void presentDeal(double offerAmount) {
        System.out.println("The banker has come back with an offer of $" + offerAmount + ". Will you accept or decline?");
    }

    public static String getName() {
        return name;
    }

}
