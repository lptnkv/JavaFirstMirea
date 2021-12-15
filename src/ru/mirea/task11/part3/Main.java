package ru.mirea.task11.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public JTextArea textView = new JTextArea();

    public Main(){
        super("Текст");
        this.setBounds(200, 200, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        this.add(textView);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        app.setResizable(false);
    }

    private JMenu createColorMenu() {
        JMenu color = new JMenu("Цвет");

        JMenuItem green = new JMenuItem("Зеленый");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem blue = new JMenuItem("Синий");
        color.add(green);
        color.add(red);
        color.add(blue);
        color.addSeparator();

        green.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setForeground(Color.GREEN);
            }
        });

        red.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setForeground(Color.RED);
            }
        });

        blue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setForeground(Color.BLUE);
            }
        });
        return color;
    }

    private JMenu createFontMenu() {
        JMenu font = new JMenu("Шрифт");

        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem times = new JMenuItem("Times New Roman");
        JMenuItem arial = new JMenuItem("Arial");

        font.add(courier);
        font.add(times);
        font.add(arial);
        font.addSeparator();


        courier.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setFont(new Font("Courier", Font.BOLD, 12));
            }
        });

        times.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setFont(new Font("TimesRoman", Font.ITALIC, 22));
            }
        });

        arial.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textView.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 16));
            }
        });

        return font;
    }
}
