package com.game.dealornodeal.client;

import com.game.dealornodeal.Game;
import com.game.dealornodeal.user.Prompter;

import java.util.Scanner;

public class GameClient {

    public static void main(String[] args) {
        Game game = new Game(new Prompter(new Scanner(System.in)));
        game.gameStart();
    }
}