package com.game.dealornodeal.user;

import com.game.dealornodeal.Game;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class PrompterTest
{
    Game game;
    Prompter prompter;

    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void askPlayerName() throws Exception
    {
        prompter = new Prompter(new Scanner(new File("responses/responses.txt")));
        String name = prompter.askPlayerName();
        assertEquals("Felix", name);
    }

    @Test
    public void askCaseChoice() throws Exception
    {
        prompter = new Prompter(new Scanner(new File("responses/askcasechoice.txt")));
        int choice = prompter.askCaseChoice("Chris");

    }

    @Test
    public void dealOrNoDeal()
    {

    }

    @Test
    public void presentCases()
    {

    }

    @Test
    public void askToSwap()
    {

    }

    @Test
    public void chooseCase()
    {

    }
}