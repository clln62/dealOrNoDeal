package com.game.dealornodeal.user;

import java.util.Scanner;

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
        System.out.print("Deal or No Deal?");
        String answer = input.next();
        return answer;
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
