package com.game.dealornodeal;

import com.game.dealornodeal.user.Prompter;
import org.junit.Test;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class GameTest
{

    @Test
    public void playRound_shouldWorkCorrectly() throws Exception
    {
        Game game = new Game(new Prompter(new Scanner(new File("responses/askcasechoice.txt"))));
        boolean result = game.playRound(1);
        assertTrue(result);
    }
    @Test
    public void playRound_shouldThrowException() throws Exception
    {
        Game game = new Game(new Prompter(new Scanner(new File("responses/askcasechoice.txt"))));
        boolean result = game.playRound(1);
        assertTrue(result);
    }
}