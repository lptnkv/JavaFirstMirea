package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    String firstTeamName = "Милан";
    String secondTeamName = "Мадрид";
    int firstTeamScore = 0;
    int secondTeamScore = 0;

    JButton firstTeamButton = new JButton(firstTeamName);
    JButton secondTeamButton = new JButton(secondTeamName);
    JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public Main() {
        super("Футбол");
        this.setBounds(200, 200, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1));

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3, 1));
        resultLabel.setSize(200, 100);
        lastScorerLabel.setSize(200, 100);
        winnerLabel.setSize(200, 100);
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        firstTeamButton.setSize(200, 100);
        firstTeamButton.setMaximumSize(getSize());
        secondTeamButton.setSize(200, 100);
        secondTeamButton.setMaximumSize(getSize());

        this.firstTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstTeamScore++;
                updateScore();
                lastScorerLabel.setText("Last Scorer: " + firstTeamName);
            }
        });

        this.secondTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondTeamScore++;
                updateScore();
                lastScorerLabel.setText("Last Scorer: " + secondTeamName);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(firstTeamButton);
        buttonPanel.add(secondTeamButton);

        container.add(labelPanel);
        container.add(buttonPanel);
    }

    public void updateScore(){
        resultLabel.setText("Result: " + this.firstTeamScore + " X " + this.secondTeamScore);
        if (firstTeamScore > secondTeamScore){
            winnerLabel.setText("Winner: " + firstTeamName);
        } else if (secondTeamScore > firstTeamScore){
            winnerLabel.setText("Winner: " + secondTeamName);
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.setResizable(false);
    }
}
