package com.game.dealornodeal.user;
import com.game.dealornodeal.Case;

import java.sql.SQLOutput;
import java.util.*;
/**
 * This is a basic setup of how a scanner could work, this information will change as the application is built
 */
public class Prompter {
    Scanner input = new Scanner(System.in);


    // HOST "METHODS"
    public String askPlayerName() {
            System.out.print("What is your name?");
            String name = input.nextLine();
        return name;
    }

    public int askCaseChoice(String playerName) {
        System.out.print(playerName + ": what case would you like to eliminate?");

        System.out.println("*******************" + input.hasNext());
            System.out.println("Invalid input. Please select a case number between 1-26.");

        int caseNumber = input.nextInt();

        if (caseNumber < 1 || caseNumber > 26) {
            System.out.println("Invalid input: " + caseNumber + ". Please enter number between 1-26.");
            askCaseChoice(playerName);
        }
        return caseNumber;
    }

    public String dealOrNoDeal() {
        System.out.print("Deal or No Deal? - (Please respond with a Y for Deal and N for No Deal.)");
        String answer = input.next();
        // NOTE: This isn't a great fix, but it works for now. As long as it is working, we can use it
        // and come back later. Below, the coded out lines do not work together, but individually the
        // conditional will work. Doing || does not work either. This can be refactored to a better solution
        // later.
        if (answer.toUpperCase().equals("N") || answer.toUpperCase().equals("Y")) {
            return answer;
        }
        else {
            System.out.println(answer + " is not a valid input. Please respond with a Y for Deal and N for No Deal");
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

    public void presentCases(Case finalCase, Case chosenCase) {
        System.out.println("Throughout this game you have held onto case number " + chosenCase.getCaseNumber() +
                ". There is one case left on the stage, case number " + finalCase.getCaseNumber());
    }

    public boolean askToSwap(Case finalCase, Case chosenCase) {
        presentCases(finalCase, chosenCase);
        System.out.print("Would you like to swap these two cases?" + "\n" + "If you do, case number " + finalCase.getCaseNumber() +
                " will become your new chosen case, the one holding your winning amount." + "\n" + "If you do not wish to swap, " +
                "case number " + chosenCase.getCaseNumber() + " will remain where it has been throughout the game." + "\n" +
                "Will you swap case? (Y for yes or N for no.)");
        String response = input.next();
        // NOTE: Like in dealOrNoDeal this logic can be fixed, but was written this way for now in order to accomplish
        // what is needed to function in MVP
        if (response.toUpperCase().equals("Y")) {
            return true;
        }
        else if (response.toUpperCase().equals("N")) {
            return false;
        }
        else {
            System.out.println(response + " is not a valid input. Please respond with a Y for Deal and N for No Deal");
            dealOrNoDeal();
        }
        return false;
    }

    // PLAYER "METHODS"
    public int chooseCase() {
        System.out.print("Which case would you like to hold onto until our final round?");
        int chosenCase = input.nextInt();
        return chosenCase;
    }
}