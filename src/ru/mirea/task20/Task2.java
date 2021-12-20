package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String surname = "Lipatnikov";
        String dateOfTask = "Fri, December 3, 2021";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(dateOfTask);
            System.out.println("Фамилия разработчика: " + surname);
            System.out.println("Дата выдачи задания: " + date);
            System.out.println("Дата сдачи: " + new Date());
        }
        catch (ParseException e) {
            e.getMessage();
        }
    }
}
