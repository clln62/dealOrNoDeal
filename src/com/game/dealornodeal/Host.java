package com.game.dealornodeal;

class Host {

    private static String name = "Howie";

    public Host() {
    }

    public Host(String name) {
        this.name = name;
    }

    public void grabCase(int caseNumber) {
        // calls Board.giveCase(caseNumber)
            // gets case back from Board

        // call revealCase(Case)
    }

    private void revealCase(Case input) {
        System.out.println("You chose case number " + input.getCaseNumber() + " with a value of " + input.getCaseValue());

    }

    public void askCaseChoice() {
        System.out.println(name + ": What case do you want to eliminate?");
        // call eliminateCase() in Player
        // check if case exists on board
        // if exists grabCase(int number)
    }

    public void callBanker() {
        // call getOfferAmount() in Banker
        // call presentDeal(offer)
    }

    public void presentDeal(double offerAmount) {
        System.out.println(name + ": Will you accept or decline " + offerAmount + "?");
    }

    public static String getName() {
        return name;
    }

}
