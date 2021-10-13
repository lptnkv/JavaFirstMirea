package ru.mirea.task2.part2;

public class Ball {
    String color;
    String type;

    public Ball() {
        this.color = "red";
        this.type = "";
    }

    public Ball(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.color + " " + this.type + " ball";
    }
}
