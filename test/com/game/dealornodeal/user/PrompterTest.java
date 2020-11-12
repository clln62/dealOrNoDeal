package com.game.dealornodeal.user;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class PrompterTest
{
    Scanner input;

    @Before
    public void setUp() throws Exception
    {
        input = new Scanner(new File("responses/responses.txt"));
        Prompter prompter = new Prompter();
    }

    @Test
    public void askPlayerName() throws Exception
    {

    }

    @Test
    public void askCaseChoice()
    {

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