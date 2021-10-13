package ru.mirea.task5.part2;

public class TestDog {
    public static void main(String[] args) {
        Dog h1 = new Husky("Jack", 3, true);
        Dog lab1 = new Labrador("Tony", 1);
        System.out.println(h1);
        System.out.println(lab1);
        h1.bark();
        lab1.bark();
    }
}
