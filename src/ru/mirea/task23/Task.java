package ru.mirea.task23;

import ru.mirea.task22.Client;

public class Task {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "String";
        String s3 = "Another string";
        String s4 = "Stringg";
        String s5 = "Test";

        System.out.println("Сравнение " + s1 + " и " + s3);
        System.out.println(s1.hashCode() + " " + s3.hashCode());
        System.out.println(s1.equals(s3));

        System.out.println("Сравнение " + s1 + " и " + s5);
        System.out.println(s1.hashCode() + " " + s5.hashCode());
        System.out.println(s1.equals(s5));

        System.out.println("Сравнение " + s2 + " и " + s4);
        System.out.println(s2.hashCode() + " " + s4.hashCode());
        System.out.println(s2.equals(s4));
    }
}
