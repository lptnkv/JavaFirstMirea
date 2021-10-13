package ru.mirea.task3.part2;

public class TestHuman {
    public static void main(String[] args) {
        Human h1 = new Human("Kirill");
        System.out.println(h1);
        Human h2 = new Human("Ivan", 180);
        h2.setEyeColor("green");
        System.out.println(h2);
    }
}
