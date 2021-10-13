package ru.mirea.task5.part2;

public class Labrador extends Dog{

    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Labrador named " + this.name + " of age " + this.age;
    }
}
