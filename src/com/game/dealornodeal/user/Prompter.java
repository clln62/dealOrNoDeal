package com.game.dealornodeal.user;

//import com.game.dealornodeal.Board;
import com.game.dealornodeal.Case;

import java.util.*;

/**
 * This is a basic setup of how a scanner could work, this information will change as the application is built
 */
public class Prompter
{
    Scanner input = new Scanner(System.in);


    // HOST "METHODS"
    public String askPlayerName()
    {
        System.out.print("What is your name?");
        String name = input.nextLine();
        return name;
    }

    public int askCaseChoice(String playerName)
    {
        System.out.print(playerName + ": which case would you like to eliminate?");

        int caseNumber = input.nextInt();

//        if (caseNumber < 1 || caseNumber > 26) {
//            System.out.println("\n" + "Invalid input: " + caseNumber + ". Please enter number between 1-26.");
//            askCaseChoice(playerName, cases);
//        }
//        if (!availableCases(caseNumber)) {
//            askCaseChoice(playerName);
//        }

        return caseNumber;
    }

    public String dealOrNoDeal()
    {
        System.out.print("Deal or No Deal? - (Please respond with a Y for Deal and N for No Deal.)");
        String answer = input.next();
        // NOTE: This isn't a great fix, but it works for now. As long as it is working, we can use it
        // and come back later. Below, the coded out lines do not work together, but individually the
        // conditional will work. Doing || does not work either. This can be refactored to a better solution
        // later.
        if (answer.toUpperCase().equals("N") || answer.toUpperCase().equals("Y")) {
            return answer;
        } else {
            System.out.println("\n" + answer + " is not a valid input. Please respond with a Y for Deal and N for No Deal." + "\n");
            dealOrNoDeal();
        }
//        if (!answer.toUpperCase().equals("N")) {
//            System.out.println(answer + " is not a valid input. Please respond with a Y for Deal and N for No Deal");
//            dealOrNoDeal();
//        }
//        if (!answer.toUpperCase().equals("Y")) {
//            System.out.println(answer + " is not a valid input. Please respond with a Y for Deal and N for No Deal");
//            dealOrNoDeal();
//        }
        return null;
    }

    public void presentCases(Case finalCase, Case chosenCase)
    {
        System.out.println("Throughout this game you have held onto case number " + chosenCase.getCaseNumber() + ". There is one case left on the stage, case number " + finalCase.getCaseNumber());
    }

    public boolean askToSwap(Case finalCase, Case chosenCase)
    {
        presentCases(finalCase, chosenCase);
        System.out.print("Would you like to swap these two cases?" + "\n" + "If you do, case number " + finalCase.getCaseNumber() + " will become your new chosen case, the one holding your winning amount." + "\n" + "If you do not wish to swap, " + "case number " + chosenCase.getCaseNumber() + " will remain where it has been throughout the game." + "\n" + "Will you swap case? (Y for yes or N for no.)");
        String response = input.next();
        // NOTE: Like in dealOrNoDeal this logic can be fixed, but was written this way for now in order to accomplish
        // what is needed to function in MVP
        if (response.toUpperCase().equals("Y")) {
            return true;
        } else if (response.toUpperCase().equals("N")) {
            return false;
        } else {
            System.out.println("\n" + response + " is not a valid input. Please respond with a Y for Deal and N for No Deal.");
            dealOrNoDeal();
        }
        return false;
    }

    // PLAYER "METHODS"
    public int chooseCase()
    {
        System.out.print("Which case would you like to hold onto until our final round?");
        int chosenCase = input.nextInt();

//        if (!availableCases(chosenCase)) {
//            chooseCase();
//        }

        return chosenCase;
    }

    // GENERAL USE "METHODS"
//    private boolean availableCases(int caseNumber) {
//        boolean isAvailable = true;
//        if(!Board.caseAvailable(caseNumber)) {
//            isAvailable = false;
//            System.out.println("\n" + "Invalid input: " + caseNumber + ". Please enter a case number available.");
//
//            List<Integer> available = new ArrayList<>();
//            for(Case briefcase : Board.getBoard()) {
//                available.add(briefcase.getCaseNumber());
//            }
//            System.out.println("Available cases to choose from are: " + available);
//        }
//        return isAvailable;
//    }

    public void seeGameRules(String playerName) {
        System.out.print("\n" + "Welcome to Deal or No Deal, " + playerName + ". Would you like to know the game rules?" + "\n" +
                "Enter Y for yes - show me the rules or N for no - proceed without rules.");
        String response = input.next();

        if (response.toUpperCase().equals("Y")) {
            gameRules();
        }
    }

    private void gameRules() {
        System.out.println("\n" +
                "How to play Deal or now Deal:" + "\n" +
                "At the start of the game, 26 cases with dollar values ranging from $0.01-$1,000,000 are available for the player." + "\n" +
                "The player claims one case or a box at the start of the game," + "\n" +
                "without its contents being revealed. (Enter a case number between 1-26.)" + "\n" +
                "The contestant then chooses the other cases or boxes, one at a time, " + "\n" +
                "to be immediately opened and removed from play. (Answered with Y for yes and N for no.)" + "\n" +
                "Throughout the game, the player is offered an amount of money or prizes to quit,"  + "\n" +
                "being asked the titular question, \"Deal or no deal?\" (Answer with Y for deal or N for no deal.)" + "\n" +
                "If the contestant rejects every deal and eliminates all the other cases or boxes," + "\n" +
                "the player keeps the money that was in the original case or box.");
    }
}