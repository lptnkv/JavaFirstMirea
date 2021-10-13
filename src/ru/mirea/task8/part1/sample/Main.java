package ru.mirea.task8.part1.sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import ru.mirea.task8.part1.sample.models.MyCircle;
import ru.mirea.task8.part1.sample.models.MyRectangle;
import ru.mirea.task8.part1.sample.models.Shape;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            int fig = random.nextInt(2);
            Shape shape;
            if (fig == 0){
                shape = new MyCircle(root);
            }
            else {
                shape = new MyRectangle(root);
            }
            shape.printCoordinates();
        }
        Scene scene = new Scene(root, 1000, 500, Color.BEIGE);
        primaryStage.setTitle("Figures");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
