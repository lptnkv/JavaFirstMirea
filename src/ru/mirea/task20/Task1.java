package ru.mirea.task20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате: '<Год> <Месяц> <Число> <Часы> <Минуты>'");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minutes = in.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minutes);
        System.out.println("Calendar object:");
        System.out.println(calendar.getTime());

        Date date = new Date(calendar.getTimeInMillis());
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date object:");
        System.out.println(format1.format(date));
    }
}
