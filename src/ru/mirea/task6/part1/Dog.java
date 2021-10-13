package ru.mirea.task6.part1;

public class Dog implements Nameable {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
