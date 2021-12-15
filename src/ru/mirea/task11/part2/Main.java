package ru.mirea.task11.part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {


    public Main(){
        super("Области");
        this.setBounds(200, 200, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        JLabel centerLabel = new JLabel("Center", SwingConstants.CENTER);
        centerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(200, 200, 400, 250);
                JLabel textLabel = new JLabel("Welcome to the Center");
                dialog.add(textLabel);
                dialog.setVisible(true);
                dialog.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel eastLabel = new JLabel("East", SwingConstants.CENTER);
        eastLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(200, 200, 400, 250);
                JLabel textLabel = new JLabel("Welcome to the East");
                dialog.add(textLabel);
                dialog.setVisible(true);
                dialog.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel westLabel = new JLabel("West", SwingConstants.CENTER);
        westLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(200, 200, 400, 250);
                JLabel textLabel = new JLabel("Welcome to the West");
                dialog.add(textLabel);
                dialog.setVisible(true);
                dialog.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel northLabel = new JLabel("North", SwingConstants.CENTER);
        northLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(200, 200, 400, 250);
                JLabel textLabel = new JLabel("Welcome to the North");
                dialog.add(textLabel);
                dialog.setVisible(true);
                dialog.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel southLabel = new JLabel("South", SwingConstants.CENTER);
        southLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(200, 200, 400, 250);
                JLabel textLabel = new JLabel("Welcome to the South");
                dialog.add(textLabel);
                dialog.setVisible(true);
                dialog.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        container.add(centerLabel, BorderLayout.CENTER);
        container.add(eastLabel, BorderLayout.EAST);
        container.add(westLabel, BorderLayout.WEST);
        container.add(southLabel, BorderLayout.SOUTH);
        container.add(northLabel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.setResizable(false);
    }
}
