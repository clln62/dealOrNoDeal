package com.game.dealornodeal.view;

import com.game.dealornodeal.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

public class GameView extends JFrame{
    JFrame frame;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, casePanel;
    JLabel titleNameLabel, caseLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 65);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, choice1, choice2;
    public static JTextArea mainTextArea;
    ImageIcon briefcase = new ImageIcon("https://www.google.com/url?sa=i&url=https%3A%2F%2Ffreesvg.org%2Fmetal-briefcase&psig=AOvVaw2V64FBdZaXsaA3tkjvQVB5&ust=1605211282235000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCfo5Sk--wCFQAAAAAdAAAAABAG");

    TitleScreenHandler tshandler = new TitleScreenHandler();

    public static void main(String[] args) {
        Game game = new Game();


        new GameView();
        game.gameStart();

    }

    GameView() {
        super("Deal or No Deal");


        frame = new JFrame("Deal or No Deal");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        con = frame.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 120);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("DEAL OR NO DEAL");
        titleNameLabel.setForeground(Color.YELLOW);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("Start Game");
        startButton.setBackground(Color.WHITE);
        startButton.setForeground(Color.BLACK);
        startButton.setFont(normalFont);
        startButton.addActionListener(tshandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGamePlayScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 300, 600, 250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 300, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 400, 300, 150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(2,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("DEAL");
        choice1.setBackground(Color.WHITE);
        choice1.setForeground(Color.BLACK);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        choice1.setFocusPainted(false);

        choice2 = new JButton("NO DEAL");
        choice2.setBackground(Color.WHITE);
        choice2.setForeground(Color.BLACK);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice2.setFocusPainted(false);

        casePanel = new JPanel();
        casePanel.setBounds(100, 15, 600, 275);
        casePanel.setBackground(Color.BLACK);
        casePanel.setLayout(new GridLayout(3, 9));
        con.add(casePanel);

        for (int i = 0; i < 26; i++) {
//            caseLabel = new JLabel(briefcase);
            caseLabel = new JLabel("case");
            caseLabel.setFont(normalFont);
            caseLabel.setForeground(Color.WHITE);
            casePanel.add(caseLabel);
        }

        playerTextView("This is a string");

    }

    public static void playerTextView(String message) {
        mainTextArea.setText(message);
        townGate();
    }

    public static void townGate() {
        mainTextArea.setText("You are at the gate of the town");
    }

    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            createGamePlayScreen();
        }
    }
}
