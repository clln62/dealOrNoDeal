package com.game.dealornodeal.user;

import com.game.dealornodeal.Case;
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
    public void askCaseChoice_shouldReturnCaseChoice() throws Exception
    {
        prompter = new Prompter(new Scanner(new File("responses/casechoice.txt")));
        int choice = prompter.askCaseChoice("Chris");
        assertEquals(3,choice);
    }

    @Test
    public void dealOrNoDeal_shouldReturnUserInput() throws FileNotFoundException
    {
        prompter = new Prompter(new Scanner(new File("responses/dealornodealanswers.txt")));
        assertEquals("Y",prompter.dealOrNoDeal());
        assertEquals("N",prompter.dealOrNoDeal());
    }

    @Test
    public void askToSwap_yesShouldReturnTrue() throws FileNotFoundException
    {
        prompter = new Prompter(new Scanner(new File("responses/dealornodealanswers.txt")));
        Case x = new Case();
        Case y = new Case();
        assertTrue(prompter.askToSwap(x,y));
    }
    @Test
    public void askToSwap_noShouldReturnFalse() throws FileNotFoundException
    {
        prompter = new Prompter(new Scanner(new File("responses/dealornodealanswers.txt")));
        Case x = new Case();
        Case y = new Case();
        assertTrue(prompter.askToSwap(x,y));
        assertFalse(prompter.askToSwap(x,y));
    }

    @Test
    public void chooseCase() throws Exception
    {
        prompter = new Prompter(new Scanner(new File("responses/casechoice.txt")));
        assertEquals(3,prompter.chooseCase());
    }
}