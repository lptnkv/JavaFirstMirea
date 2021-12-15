package ru.mirea.task11.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    int num;
    int attempts;
    JTextField guessTextView = new JTextField();
    JButton makeGuessButton = new JButton("Угадать");
    JLabel resultLabel = new JLabel();

    public Main() {
        super("Угадайка");
        this.setBounds(200, 200, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        attempts = 3;

        Random random = new Random();
        num = random.nextInt(20) + 1;
        System.out.println(num);
        resultLabel.setText("Угадайте число от 1 до 20");

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(resultLabel);
        container.add(guessTextView);

        makeGuessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(guessTextView.getText());
                if (attempts != 0){
                    if (guess > num){
                        resultLabel.setText("Ваше число больше");
                        attempts--;
                        if (attempts == 0){
                            resultLabel.setText("Игра окончена. Попробуйте заново");
                            attempts = 3;
                            num = random.nextInt(20) + 1;
                            System.out.println(num);
                        }
                    } else if (guess < num){
                        resultLabel.setText("Ваше число меньше");
                        attempts--;
                        if (attempts == 0){
                            resultLabel.setText("Игра окончена. Попробуйте заново");
                            attempts = 3;
                            num = random.nextInt(20) + 1;
                            System.out.println(num);
                        }
                    } else {
                        resultLabel.setText("Вы угадали! " + num);
                        attempts = 3;
                        num = random.nextInt(20) + 1;
                        System.out.println(num);
                    }
                }

            }
        });

        container.add(makeGuessButton);


    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.setResizable(false);
    }
}
