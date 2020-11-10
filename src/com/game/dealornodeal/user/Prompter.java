package com.game.dealornodeal.user;

import com.game.dealornodeal.Case;

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
        int caseNumber = input.nextInt();
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
        System.out.print("Would you like to swap these two cases? If you do, case number " + finalCase.getCaseNumber() +
                " will become your new chosen case, the one holding your winning amount. If you do not wish to swap, " +
                "case number " + chosenCase.getCaseNumber() + " will remain where it has been throughout the game." +
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




    // commented code below is to show an example of how the Scanner class can work alone inside of prompter,
    // but does not coincide directly to Deal or No Deal.
    // This code can be removed once things inside of Prompter and understanding of Scanner are solid.
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your name ");
//        // with strings, next() is good for single word entries and nextLine() is good for spaced words
//        String name = input.nextLine();
//
//        // Get the users daily sales
//        System.out.print("Please enter your days sales total ");
//        int sales = input.nextInt();
//
//        // print out information
//        System.out.println("Hello " + name + ", your sales total today was $" + sales);
//
//        System.out.print("Will you accept this offer? Deal or No Deal?");
//        String response = input.next();
//
//        System.out.println("You have selected " + response);
//
//    }


}
