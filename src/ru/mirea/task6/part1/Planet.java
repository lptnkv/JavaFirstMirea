package ru.mirea.task6.part1;

public class Planet implements Nameable{
    String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
