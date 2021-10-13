package ru.mirea.task5.part2;

public class Husky extends Dog{
    boolean hasDifferentEyeColor;

    public Husky(String name, int age, boolean hasDifferentEyeColor) {
        super(name, age);
        this.hasDifferentEyeColor = hasDifferentEyeColor;
    }

    @Override
    public void bark() {
        System.out.println("Awooo");
    }

    @Override
    public String toString() {
        if (hasDifferentEyeColor){
            return "Husky named " + this.name + " of age " + this.age + " with different eyes";
        } else {
            return "Husky named " + this.name + " of age " + this.age;
        }
    }
}
