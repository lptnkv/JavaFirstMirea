package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Task {
    private static final File file = new File("test.txt");

    private static void writeToFile() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);

        System.out.println("Введите текст:");
        pw.println((new Scanner(System.in)).nextLine());

        pw.close();
    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("Содержимое файла:");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }

    private static void changeInfo() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        System.out.println("Введите новый текст:");
        pw.println((new Scanner(System.in)).nextLine());
        pw.close();
    }

    private static void writeApp() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        System.out.println("Введите текст для добавления в конец файла:");
        bufferedWriter.write((new Scanner(System.in)).nextLine());
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
       writeToFile();
       readFile();

       changeInfo();
       readFile();

       writeApp();
       readFile();
    }
}