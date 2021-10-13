package ru.mirea.task8.part1.sample.models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;

import java.util.Random;

public class MyRectangle extends Shape {
    int width;
    int height;
    public MyRectangle(Group group) {
        Random random = new Random();
        this.x = random.nextInt(1200) + 200;
        this.y = random.nextInt(500) + 200;
        this.height = random.nextInt(100) + 10;
        this.width = random.nextInt(100) + 10;
        this.color = Color.color(Math.random(), Math.random(), Math.random());
        Rectangle r = new Rectangle();
        r.setY(this.y);
        r.setX(this.x);
        r.setHeight(this.height);
        r.setWidth(this.width);
        r.setFill(this.color);
        r.setStrokeWidth(1.0);
        r.setStroke(Color.DARKSLATEGREY);
        group.getChildren().add(r);
    }


}
