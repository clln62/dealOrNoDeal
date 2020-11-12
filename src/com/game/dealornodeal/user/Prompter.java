package com.game.dealornodeal.user;

import com.game.dealornodeal.Case;

import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

public class Prompter {
    private Scanner input;

    public Prompter(Scanner input)
    {
        this.input = input;
    }

    // HOST "METHODS"
    public String askPlayerName() {
        System.out.print("Welcome to Deal or No Deal" + "\n" + "What is your name?");
        String name = input.nextLine();
        return name;
    }

    public int askCaseChoice(String playerName) {
        int caseNumber = 0;
        do {
            System.out.print(playerName + ": which case would you like to eliminate?");
            while (!input.hasNextInt()) {
                String invalidInput = input.nextLine();
                System.out.println("Invalid input. Please enter a valid case number.");
            }
            caseNumber = input.nextInt();
        } while (caseNumber == 0);

        return caseNumber;
    }

    public String dealOrNoDeal() {
//        String answer = "";
//        do {
//            System.out.print("Deal or No Deal? - (Please respond with a Y for Deal and N for No Deal.)");
//            while (!input.hasNext()) {
//
//            }
//
//        } while (!answer.equals("Y") || !answer.equals("N"));

        System.out.print("Deal or No Deal? - (Please respond with a Y for Deal and N for No Deal.)");

        String answer = input.next();
        if (answer.toUpperCase().equals("N") || answer.toUpperCase().equals("Y")) {
            return answer;
        } else {
            System.out.println("\n" + answer + " is not a valid input. Please respond with a Y for Deal and N for No Deal." + "\n");
            dealOrNoDeal();
        }
        return answer;
    }

    public void presentCases(Case finalCase, Case chosenCase) {
        System.out.println("Throughout this game you have held onto case number " + chosenCase.getCaseNumber() + ". There is one case left on the stage, case number " + finalCase.getCaseNumber());
    }

    public boolean askToSwap(Case finalCase, Case chosenCase) {
        presentCases(finalCase, chosenCase);
        System.out.print("Would you like to swap these two cases?" + "\n" + "If you do, case number " + finalCase.getCaseNumber() + " will become your new chosen case, the one holding your winning amount." + "\n" + "If you do not wish to swap, " + "case number " + chosenCase.getCaseNumber() + " will remain where it has been throughout the game." + "\n" + "Will you swap case? (Y for yes or N for no.)");
        String response = input.next();
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
    public int chooseCase() {
        int chosenCase = 0;

        do {
            System.out.print("Which case would you like to hold onto until our final round?");
            while (!input.hasNextInt()) {
                String invalidInput = input.nextLine();
                System.out.println("Invalid input. Please enter number between 1-26.");
            }
            chosenCase = input.nextInt();
        } while (chosenCase == 0);

        return chosenCase;
    }

    // GENERAL USE "METHODS"

    public void seeGameRules(String playerName) {
        System.out.print("\n" + playerName + ", would you like to know the game rules?" + "\n" +
                "Enter Y for yes - show me the rules or any other character for no - proceed without rules.");
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