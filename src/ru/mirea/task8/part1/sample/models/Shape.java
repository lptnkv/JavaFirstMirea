package ru.mirea.task8.part1.sample.models;

import javafx.scene.paint.Color;

public abstract class Shape {
    Color color;
    float x, y;

    public void printCoordinates(){
        System.out.println(this.x + ", " + this.y);
    }
}
