package ru.mirea.task2.part1;

public class Shape {
    String name;
    int x, y;

    public Shape(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getCoords() {
        return new int[]{x, y};
    }

    public void setCoords(int[] coords) {
        this.x = coords[0];
        this.y = coords[1];
    }

    @Override
    public String toString() {
        return this.name + " with coordinates: (" + this.x + ", " + this.y + ")";
    }
}
