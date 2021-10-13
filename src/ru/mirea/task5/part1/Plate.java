package ru.mirea.task5.part1;

public class Plate extends Dish{
    int radius;

    public Plate(String material, int radius) {
        super(material);
        this.radius = radius;
    }

    @Override
    void smash() {
        System.out.println("Plate is now broken");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return this.material + " plate of radius " + this.radius + " centimeters";
    }
}
