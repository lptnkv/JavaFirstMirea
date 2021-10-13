package ru.mirea.task5.part1;

public class TestDish {
    public static void main(String[] args) {
        Plate p1 = new Plate("Marble", 20);
        Fork f1 = new Fork();
        Fork f2 = new Fork("Silver", 5);
        Dish p2 = new Plate("Glass", 30);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(f1);
        System.out.println(f2);
        p2.smash();
        f1.smash();

    }
}
