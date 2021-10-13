package ru.mirea.task6.part1;

public class TestNameable {
    public static void main(String[] args) {
        Planet p1 = new Planet("Earth");
        Dog d1 = new Dog("Sharik");
        System.out.println(p1.getName());
        System.out.println(d1.getName());
    }
}
