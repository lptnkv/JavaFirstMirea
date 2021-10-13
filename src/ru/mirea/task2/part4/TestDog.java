package ru.mirea.task2.part4;

import java.util.ArrayList;

public class TestDog {
    static ArrayList<Dog> dogs = new ArrayList<>();
    public static void main(String[] args) {
        dogs.add(new Dog());
        dogs.add(new Dog("Jack"));
        dogs.add(new Dog("Ein", 5));
        for (Dog dog : dogs){
            System.out.println(dog);
        }
    }

}
