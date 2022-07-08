package sample;


import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
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

public class Obstacle extends Application {
    Image image=new Image("file:resources/image/1.jpg");

    ImageView back=new ImageView(image);
    Group root = new Group(back);



    @Override
    public void start(Stage primaryStage) {

        Rectangle rectangle = new Rectangle();
        RotateTransition rotateTransition = new RotateTransition();
        rectangle.setX(220);
        rectangle.setY(320);
        rectangle.setWidth(80);
        rectangle.setHeight(200);
        rectangle.setFill(Color.INDIANRED);

        rotateTransition.setDuration(Duration.seconds(3));
        rotateTransition.setNode(rectangle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        root.getChildren().add(rectangle);
        Scene scene = new Scene(root, 506, 823);
        primaryStage.setTitle("__________________________  Colour Switch  ________________________");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Rectangle rec(){
        Rectangle rectangle = new Rectangle();
        RotateTransition rotateTransition = new RotateTransition();
        rectangle.setX(220);
        rectangle.setY(320);
        rectangle.setWidth(80);
        rectangle.setHeight(200);
        rectangle.setFill(Color.INDIANRED);
        rotateTransition.setDuration(Duration.seconds(3));
        rotateTransition.setNode(rectangle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();

        return rectangle;
    }
    public static void main(String args[]){
        launch(args);
    }
}

