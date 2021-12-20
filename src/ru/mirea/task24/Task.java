package ru.mirea.task24;

import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        String numberPattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern = numberPattern + "\\." +
                numberPattern + "\\." + numberPattern + "\\." + numberPattern;
        Pattern ipPattern = Pattern.compile(numberPattern + "\\." +
                numberPattern + "\\." + numberPattern + "\\." + numberPattern);
        String test1 = "127.0.0.1";
        String test2 = "1300.6.7.8";
        String test3 = "255.255.255.0";
        String test4 = "abc.def.gha.bcd";

        System.out.println(test1.matches(pattern));
        System.out.println(test2.matches(pattern));
        System.out.println(test3.matches(pattern));
        System.out.println(test4.matches(pattern));
    }

}
