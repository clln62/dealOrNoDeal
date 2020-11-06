package com.game.dealornodeal;

class Player {
    private String name;
    public Case chosenCase;


    public Player() {

    }

    private void acceptDeal() {
        // grab
        System.out.println("The player has accepted the amount of: " );
    }

    private void declineDeal() {

    }

    public void chooseCase() {
        // ask player what case they want
        // find case in board that matches the case number submitted
        // call setter for chosenCase with the case from Board
    }

    public int eliminateCase() {
        // ask player what case they want

        return 0;
    }


    public Case getChosenCase() {
        return chosenCase;
    }

    public void setChosenCase(Case chosenCase) {
        Board.removeFromBoard(chosenCase);
        this.chosenCase = chosenCase;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
