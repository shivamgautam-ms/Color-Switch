package sample;


import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class GameOver extends Application {

    Image image=new Image("file:resources/image/1.jpg");
    ImageView back=new ImageView(image);
    Group root = new Group(back);
    @Override
    public void start(Stage primaryStage) {

        Text text= new Text();
        Text text1= new Text();
        text.setFont(Font.loadFont("file:resources/fonts/Sega.ttf", 70));
        text.setX(120);
        text.setY(350);
        text1.setFont(Font.loadFont("file:resources/fonts/Fino.ttf", 20));
        text1.setX(0);
        text1.setY(800);

        text.setText("Game\n       Over");
        text1.setText("Back To MainMenu");
        text.setFill(Color.WHITE);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLUE);
        text1.setFill(Color.WHITE);
        text1.setStrokeWidth(1);
        text1.setStroke(Color.DARKRED);
        //root.getChildren().add(backtomain);
        root.getChildren().addAll(text,text1);
        primaryStage.setTitle("__________________________  Colour Switch  ________________________");
        Scene scene = new Scene(root, 506, 823);
        scene.setFill(Color.valueOf("A9A9A9"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
