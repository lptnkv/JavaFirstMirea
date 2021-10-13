package ru.mirea.task8.part2.src.sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {
    static String path;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Image image = new Image(path);
        ImageView view = new ImageView(image);
        view.setPreserveRatio(true);
        view.setFitHeight(400);
        root.getChildren().add(view);

        primaryStage.setTitle("Image");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        path = args[0];
        path = path.substring(1);
        System.out.println(path);
        launch(args);
    }
}
