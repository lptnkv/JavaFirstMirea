package ru.mirea.task8.part1.sample.models;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


import java.util.Random;

public class MyCircle extends Shape {
    int radius;

    public MyCircle(Group group) {
        Random random = new Random();
        this.x = random.nextInt(1200) + 200;
        this.y = random.nextInt(500) + 200;
        this.radius = random.nextInt(250) - 100;
        this.color = Color.color(Math.random(), Math.random(), Math.random());
        Circle c = new Circle();
        c.setCenterX(this.x);
        c.setCenterY(this.y);
        c.setRadius(this.radius);
        c.setFill(this.color);
        c.setStrokeWidth(1.0);
        c.setStroke(Color.BLACK);
        group.getChildren().add(c);
    }
}
