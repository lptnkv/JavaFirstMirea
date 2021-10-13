package ru.mirea.task5.part2;

public abstract class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog() {
        this.name = "Bobik";
        this.age = 0;
    }

    public abstract void bark();
}
