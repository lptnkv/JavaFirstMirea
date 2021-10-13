package ru.mirea.task2.part4;

public class Dog {
    String name;
    int age;

    public Dog() {
        this.age = 0;
        this.name = "Pup";
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int humanAge(){
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog named: " + this.name + ", age: " + this.age + " in human age: " + this.humanAge();
    }
}
