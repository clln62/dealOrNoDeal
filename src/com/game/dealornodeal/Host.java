package com.game.dealornodeal;

class Host {

    private static String name = "Howie";

    public Host() {
    }

    public Host(String name) {
        this.name = name;
    }

    public void askPlayerName() {
        System.out.println("What is your name?");
        // prompt player to enter name
        // call setName()
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
        System.out.println("The banker has come back wih an offer of " + offerAmount + ". Will you accept or decline?");
    }

    // no longer needed - this is handled in the Prompter class
//    public void dealOrNoDeal() {
//        // yes or no console read line from user
//        System.out.println("Deal or no deal?");
//    }

    public static String getName() {
        return name;
    }

}
