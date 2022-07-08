package sample;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Pos;

import java.awt.*;

public class Ball extends Application {

    Obstacle newobs=new Obstacle();
//    LineTo line1 = new LineTo(250, 300);
    Button jump = new Button("  JUMP   ");
    Circle circle = new Circle();
    double temp =500;
    double temp2 = 700;
    double dy=  circle.getCenterY();
    Image image=new Image("file:resources/image/1.jpg");
    Path path = new Path();

//    MoveTo moveTo = new MoveTo(250, temp2);
    LineTo line1 = new LineTo(250, temp);

    PathTransition pathTransition = new PathTransition();
    ImageView back=new ImageView(image);
    Group root = new Group(back,newobs.rec());
//    public void actiononnewgame(Group root){
//        Pane newRoot=new Pane(root);
//
//    }
    //        path.getElements().add(new MoveTo(250,700));
//        path.getElements().add(line1);


    public void bounce_on_click(Stage stage) {
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.out.println("circle");
                temp = temp -50;
                temp2 = temp;
                line1.setY(temp);
//                MoveTo moveTo = new MoveTo(250, 700);

                path.getElements().add(line1);
                path.getElements().add(new MoveTo(250,temp2));
//                Path path = new Path();
//

                pathTransition.setNode(circle);
                pathTransition.setPath(path);
                pathTransition.setDuration(Duration.seconds(2));
                pathTransition.setNode(circle);
                pathTransition.setPath(path);
                pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
                pathTransition.setAutoReverse(false);

                pathTransition.play();
//                circle.setCenterX(circle.getCenterX());
//                circle.setCenterY(circle.getCenterY() - 5);dy = dy - 10;line1.setY(dy);
            }


        };
        stage.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        //Registering the event filter

    }


    @Override
        public void start(Stage stage) {
            //Drawing a Circle



            circle.setCenterX(250);
            circle.setCenterY(700);

            circle.setRadius(14);


            circle.setFill(Color.WHITE);

            circle.setStrokeWidth(20);

            jump.setScaleX(1);
            jump.setScaleY(1);
            jump.setLayoutX(400);
            jump.setLayoutY(750);
             jump.setStyle("-fx-background-color:  slateblue ; -fx-text-fill: white;");
//


//        path.getElements().add(new MoveTo(250,700));
//        path.getElements().add(line1);

//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setDuration(Duration.seconds(2));
//        pathTransition.setNode(circle);
//        pathTransition.setPath(path);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//        pathTransition.setCycleCount(javafx.animation.Animation.INDEFINITE);
//        pathTransition.setAutoReverse(true);
//        pathTransition.play();



            root.getChildren().add(circle);
            root.getChildren().add(jump);

            stage.setTitle("__________________________  Colour Switch  ________________________");
            Scene scene = new Scene(root, 506, 823);
             stage.setTitle("__________________________  Colour Switch  ________________________");
            stage.setScene(scene);
           stage.show();
              bounce_on_click(stage);

        }

    }



