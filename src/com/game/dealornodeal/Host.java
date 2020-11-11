package com.game.dealornodeal;

// TODO: There may be some redundancies here from simplification in the addition of prompter ->
// simply followed old notes to finish the application, refactoring could be in order

class Host {

    private static String name = "Howie";

    public Host() {
    }

    public Host(String name) {
        this.name = name;
    }


    // DONE: finish this method to return final case to game
    public Case grabFinalCase () {
        return Board.giveFinalCase();
    }

    public void grabCase(int caseNumber) {
        // calls Board.giveCase(caseNumber)
            // gets case back from Board
        // call revealCase(Case)
        revealCase(Board.giveCase(caseNumber));
    }

    public void revealCase(Case input) {
        System.out.println("\n" + "You chose case number " + input.getCaseNumber() + " with a value of $" + input.getCaseValue());

    }

    // This isn't really needed now that the prompter is doing this work
//    public void askCaseChoice(int caseNumber) {
//        // prompter will ask player for case number and return it here
//        // call grabCase(caseNumber)
//        grabCase(caseNumber);
//    }

    public void callBanker(Case playerCase) {
        // call getOfferAmount() in Banker
        // call presentDeal(offer)
        presentDeal(Banker.getOfferAmount(playerCase));
    }

    public void presentDeal(double offerAmount) {
        System.out.println("The banker has come back with an offer of $" + offerAmount + ". Will you accept or decline?");
        // prompt is automatically presented from Game and Prompter
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
