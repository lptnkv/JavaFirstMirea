package ru.mirea.task8.part3.src.sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String path = "D:\\MIREA\\3 term\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task8\\part3\\src\\sample\\";
        String[] frames = {"frame1.gif", "frame2.gif", "frame3.gif",
                "frame4.gif", "frame5.gif", "frame6.gif", "frame7.gif"};

        Group root = new Group();
        Image image = new Image(path + frames[0]);
        ImageView view = new ImageView();
        view.setImage(image);
        root.getChildren().add(view);

        primaryStage.setTitle("Image");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();

        final IntegerProperty i = new SimpleIntegerProperty(0);
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(200),
                        event -> {
                            i.set(i.get() + 1);
                            int index = i.get();
                            view.setImage(new Image(path + frames[index % frames.length]));
                        }
                )
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
