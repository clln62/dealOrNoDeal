package com.game.dealornodeal.view.client;

import com.game.dealornodeal.view.GameViewPlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameViewClient extends JFrame{
//    JFrame frame;
//    Container con;
//    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, casePanel;
//    JLabel titleNameLabel, caseLabel;
//    Font titleFont = new Font("Times New Roman", Font.PLAIN, 65);
//    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
//    JButton startButton, choice1, choice2;
//    JTextArea mainTextArea;
//    JTextField nameEntry;
//    ImageIcon briefcase = new ImageIcon("https://www.google.com/url?sa=i&url=https%3A%2F%2Ffreesvg.org%2Fmetal-briefcase&psig=AOvVaw2V64FBdZaXsaA3tkjvQVB5&ust=1605211282235000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCfo5Sk--wCFQAAAAAdAAAAABAG");
//
//    TitleScreenHandler tshandler = new TitleScreenHandler();
//
//    public static void main(String[] args) {
//        Game game = new Game();
//
//
//        new GameViewClient();
//        game.gameStart();
//
//    }
//
//    GameViewClient() {
//        super("Deal or No Deal");
//
//
//        frame = new JFrame("Deal or No Deal");
//        frame.setSize(800, 600);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLACK);
//        frame.setLayout(null);
//        con = frame.getContentPane();
//
//        titleNamePanel = new JPanel();
//        titleNamePanel.setBounds(100, 100, 600, 120);
//        titleNamePanel.setBackground(Color.BLACK);
//        titleNameLabel = new JLabel("DEAL OR NO DEAL");
//        titleNameLabel.setForeground(Color.YELLOW);
//        titleNameLabel.setFont(titleFont);
//
//        startButtonPanel = new JPanel();
//        startButtonPanel.setBounds(300, 400, 200, 100);
//        startButtonPanel.setBackground(Color.BLACK);
//
//        startButton = new JButton("Start Game");
//        startButton.setBackground(Color.WHITE);
//        startButton.setForeground(Color.BLACK);
//        startButton.setFont(normalFont);
//        startButton.addActionListener(tshandler);
//        startButton.setFocusPainted(false);
//
//        titleNamePanel.add(titleNameLabel);
//        startButtonPanel.add(startButton);
//        con.add(titleNamePanel);
//        con.add(startButtonPanel);
//    }
//
//    public void startGameScreen() {
//        titleNamePanel.setVisible(false);
//        startButtonPanel.setVisible(false);
//
//        mainTextPanel = new JPanel();
//        mainTextPanel.setBounds(100, 300, 600, 250);
//        mainTextPanel.setBackground(Color.BLACK);
//        con.add(mainTextPanel);
//
//        mainTextArea = new JTextArea();
//        mainTextArea.setBounds(100, 300, 600, 250);
//        mainTextArea.setBackground(Color.BLACK);
//        mainTextArea.setForeground(Color.WHITE);
//        mainTextArea.setFont(normalFont);
//        mainTextArea.setLineWrap(true);
//        mainTextPanel.add(mainTextArea);
//
//        enterPlayerName();
//
//    }
//
//    public void enterPlayerName() {
//        mainTextArea.setText("What is your name?");
//
//        nameEntry = new JTextField("Enter name here!", 10);
//        nameEntry.setBounds(100, 400, 600, 100);
//        nameEntry.setBackground(Color.WHITE);
//        nameEntry.setForeground(Color.BLACK);
//        con.add(nameEntry, BorderLayout.SOUTH);
//
//    }
//
//    public void createGamePlayScreen() {
//
//        mainTextPanel = new JPanel();
//        mainTextPanel.setBounds(100, 300, 600, 250);
//        mainTextPanel.setBackground(Color.BLACK);
//        con.add(mainTextPanel);
//
//        mainTextArea = new JTextArea();
//        mainTextArea.setBounds(100, 300, 600, 250);
//        mainTextArea.setBackground(Color.BLACK);
//        mainTextArea.setForeground(Color.WHITE);
//        mainTextArea.setFont(normalFont);
//        mainTextArea.setLineWrap(true);
//        mainTextPanel.add(mainTextArea);
//
//        choiceButtonPanel = new JPanel();
//        choiceButtonPanel.setBounds(250, 400, 300, 150);
//        choiceButtonPanel.setBackground(Color.BLACK);
//        choiceButtonPanel.setLayout(new GridLayout(2,1));
//        con.add(choiceButtonPanel);
//
//        choice1 = new JButton("DEAL");
//        choice1.setBackground(Color.WHITE);
//        choice1.setForeground(Color.BLACK);
//        choice1.setFont(normalFont);
//        choiceButtonPanel.add(choice1);
//        choice1.setFocusPainted(false);
//
//        choice2 = new JButton("NO DEAL");
//        choice2.setBackground(Color.WHITE);
//        choice2.setForeground(Color.BLACK);
//        choice2.setFont(normalFont);
//        choiceButtonPanel.add(choice2);
//        choice2.setFocusPainted(false);
//
//        casePanel = new JPanel();
//        casePanel.setBounds(100, 15, 600, 275);
//        casePanel.setBackground(Color.BLACK);
//        casePanel.setLayout(new GridLayout(3, 9));
//        con.add(casePanel);
//
//        for (int i = 0; i < 26; i++) {
////            caseLabel = new JLabel(briefcase);
//            caseLabel = new JLabel("case");
//            caseLabel.setFont(normalFont);
//            caseLabel.setForeground(Color.WHITE);
//            casePanel.add(caseLabel);
//        }
//
//
//    }
//
//
//    public class TitleScreenHandler implements ActionListener{
//
//        public void actionPerformed(ActionEvent event) {
//            startGameScreen();
//        }
//    }

    JFrame frame;
    Container con;
    JPanel titleNamePanel, startButtonPanel, submitNameButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 65);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
    JButton startButton, submitNameButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    JTextField nameEntry;
    int playerHP, monsterHP, silverRing;
    String weapon, position;

    PlayerNameHandler pnHandler = new PlayerNameHandler();
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    GameViewPlay playGame = new GameViewPlay();


    public static void main(String[] args) {

        new GameViewClient();
    }

    public GameViewClient(){

        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setVisible(true);
        con = frame.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("DEAL OR NO DEAL");
        titleNameLabel.setForeground(Color.YELLOW);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START GAME");
        startButton.setBackground(Color.WHITE);
        startButton.setForeground(Color.BLACK);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void enterPlayerName() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("What is your name?");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        nameEntry = new JTextField(1);
        nameEntry.setBounds(200, 275, 400, 100);
        nameEntry.setBackground(Color.WHITE);
        nameEntry.setForeground(Color.WHITE);
        nameEntry.getAccessibleContext();
        con.add(nameEntry);

        submitNameButtonPanel = new JPanel();
        submitNameButtonPanel.setBounds(300, 400, 200, 100);
        submitNameButtonPanel.setBackground(Color.black);

        submitNameButton = new JButton("SUBMIT NAME");
        submitNameButton.setBackground(Color.WHITE);
        submitNameButton.setForeground(Color.BLACK);
        submitNameButton.setFont(normalFont);
        submitNameButton.addActionListener(pnHandler);
        submitNameButton.setFocusPainted(false);

        submitNameButtonPanel.add(submitNameButton);
        con.add(submitNameButtonPanel);

    }

    public void createGameScreen(){
        mainTextArea.setText("Which case would you like to hold onto until our final round?");
        submitNameButtonPanel.setVisible(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.WHITE);
        choice1.setForeground(Color.BLACK);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.WHITE);
        choice2.setForeground(Color.BLACK);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.WHITE);
        choice3.setForeground(Color.BLACK);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.WHITE);
        choice4.setForeground(Color.BLACK);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetup();

    }
    public void playerSetup(){
        playerHP = 15;
        monsterHP = 20;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        townGate();
    }
    public void townGate(){
        position = "townGate";
        mainTextArea.setText("You are at the gate of the town. \nA guard is standing in front of you. \n\nWhat do you do?");
        choice1.setText("Talk to the guard");
        choice2.setText("Attack the guard");
        choice3.setText("Leave");
        choice4.setText("");
    }
    public void talkGuard(){
        position = "talkGuard";
        mainTextArea.setText("Guard: Hello stranger. I have never seen your face. \nI'm sorry but we cannot let a stranger enter our town.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void attackGuard(){
        position = "attackGuard";
        mainTextArea.setText("Guard: Hey don't be stupid!\n\nThe guard fought back and hit you hard.\n(You receive 3 damage)");
        playerHP = playerHP -3;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void crossRoad(){
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad.\nIf you go south, you will go back to the town.");
        choice1.setText("Go north");
        choice2.setText("Go east");
        choice3.setText("Go south");
        choice4.setText("Go west");
    }
    public void north(){
        position = "north";
        mainTextArea.setText("There is a river. \nYou drink the water and rest at the riverside. \n\n(Your HP is recovered by 2)");
        playerHP = playerHP + 2;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Go south");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void east(){
        position = "east";
        mainTextArea.setText("You walked into a forest and found a Long Sword!\n\n(You obtained a Long Sword)");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public void west(){
        position = "west";
        mainTextArea.setText("You encounter a goblin!");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }
    public void fight(){
        position = "fight";
        mainTextArea.setText("Monter HP: " + monsterHP + "\n\nWhat do you do?");
        choice1.setText("Attack");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
    }
    public void playerAttack(){
        position = "playerAttack";

        int playerDamage = 0;

        if(weapon.equals("Knife")){
            playerDamage = new java.util.Random().nextInt(3);
        }
        else if(weapon.equals("Long Sword")){
            playerDamage = new java.util.Random().nextInt(12);
        }

        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void monsterAttack(){
        position = "monsterAttack";

        int monsterDamage = 0;

        monsterDamage = new java.util.Random().nextInt(6);

        mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");

        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void win(){
        position = "win";

        mainTextArea.setText("You defeated the monster!\nThe monster dropped a ring!\n\n(You obtained a Silver Ring)");

        silverRing = 1;

        choice1.setText("Go east");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public void lose(){
        position = "lose";

        mainTextArea.setText("You are dead!\n\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }
    public void ending(){
        position = "ending";

        mainTextArea.setText("Guard: Oh you killed that goblin!?\nThank you so much. You are true hero!\nWelcome to our town!\n\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }










    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            enterPlayerName();
            nameEntry.setText(" ");
        }
    }

    public class PlayerNameHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            playGame.gameStart(nameEntry.getText());
            createGameScreen();
        }
    }


    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch(position){
                case "townGate":
                    switch(yourChoice){
                        case "c1":
                            if(silverRing==1){
                                ending();
                            }
                            else{
                                talkGuard();
                            }
                            break;
                        case "c2": attackGuard();break;
                        case "c3": crossRoad();break;
                    }
                    break;
                case "talkGuard":
                    switch(yourChoice){
                        case "c1": townGate(); break;
                    }
                    break;
                case "attackGuard":
                    switch(yourChoice){
                        case "c1": townGate(); break;
                    }
                    break;
                case "crossRoad":
                    switch(yourChoice){
                        case "c1": north(); break;
                        case "c2": east();break;
                        case "c3": townGate(); break;
                        case "c4": west();break;
                    }
                    break;
                case "north":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                    }
                    break;
                case "east":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                    }
                    break;
                case "west":
                    switch(yourChoice){
                        case "c1": fight(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                case "fight":
                    switch(yourChoice){
                        case "c1": playerAttack();break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                case "playerAttack":
                    switch(yourChoice){
                        case "c1":
                            if(monsterHP<1){
                                win();
                            }
                            else{
                                monsterAttack();
                            }
                            break;
                    }
                    break;
                case "monsterAttack":
                    switch(yourChoice){
                        case "c1":
                            if(playerHP<1){
                                lose();
                            }
                            else{
                                fight();
                            }
                            break;
                    }
                    break;
                case "win":
                    switch(yourChoice){
                        case "c1": crossRoad();
                    }
                    break;

            }


        }
    }
}
