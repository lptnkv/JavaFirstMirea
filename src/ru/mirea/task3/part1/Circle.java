package ru.mirea.task3.part1;

public class Circle {
    float radius;
    String color;

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.color = "transparent";
        this.radius = 1;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " circle of radius: " + this.radius;
    }
}
