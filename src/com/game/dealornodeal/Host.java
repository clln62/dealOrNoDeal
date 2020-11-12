package com.game.dealornodeal;



class Host {

    private static String name = "Howie";

    public Host() {
    }

    public Host(String name)
    {
        this.name = name;
    }


    public Case grabFinalCase()
    {
        return Board.giveFinalCase();
    }

    public void grabCase(int caseNumber) {
        revealCase(Board.giveCase(caseNumber));
    }

    public void revealCase(Case input) {
        System.out.println("\n" + "You chose case number "
                + input.getCaseNumber() + " with a value of $"
                + input.getCaseValue());
    }


    public void callBanker(Case playerCase) {
        presentDeal(Banker.getOfferAmount(playerCase));
    }

    public void presentDeal(double offerAmount) {
        System.out.println("The banker has come back with an offer of $" + offerAmount + ". Will you accept or decline?");
    }


    public static String getName() {
        return name;
    }

}
