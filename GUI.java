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

public class GUI extends Application {

    Ball ball = new Ball();

    final int width =506;
    final int length = 823;

    Button  newgame = new Button(" New Game  ");
    Button  Load_Game = new Button(" Load Game ");
    Button  Options = new Button("   Options    ");
    Button  Exit = new Button("      Exit        ");

    Image image=new Image("file:resources/image/1.jpg");

    ImageView back=new ImageView(image);
    Group root = new Group(back);

     ImageView set_background(){
        ImageView back=new ImageView(image);
        return back;

    }
    TextField set_Playername(){
        TextField playername = new TextField();
        playername.setScaleX(2);
        playername.setScaleY(2);
        playername.setLayoutX(190);
        playername.setLayoutY(370);
        playername.setStyle("-fx-text-fill: #0000ff");
        return playername;
    }
    void set_GUI_frame(Stage primaryStage) throws Exception{
        Text text= new Text();
        Text text1 = new Text();

//        button3.setStyle("-fx-font-size: 2em; ");
//        newgame.setStyle("-fx-text-fill: #0000ff");
//        Load_Game.setStyle("-fx-text-fill: #0000ff");
//        Options.setStyle("-fx-text-fill: #0000ff");
//        Exit.setStyle("-fx-text-fill: #0000ff");
        newgame.setStyle("-fx-background-color:  slateblue ; -fx-text-fill: white;");
        Load_Game.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        Options.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        Exit.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        text.setFont(Font.loadFont("file:resources/fonts/space age.ttf", 60));
        text1.setFont(Font.loadFont("file:resources/fonts/space age.ttf", 60));
        text.setX(18);
        text.setY(200);
        text1.setX(40);
        text1.setY(230);
        text.setText("Colour");
        text1.setText("      switch");
        text.setFill(Color.WHITE);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLUE);
        text1.setFill(Color.WHITE);
        text1.setStrokeWidth(2);
        text1.setStroke(Color.BLUE);
//        Group root = new Group(set_background());
        root.getChildren().addAll(text,text1);
        root.getChildren().add(set_Playername());
        root.getChildren().add(newgame);
        root.getChildren().add(Load_Game);
        root.getChildren().add(Options);
        root.getChildren().add(Exit);
        primaryStage.setTitle("__________________________  Colour Switch  ________________________");
        Scene scene = new Scene(root, width, length);
        scene.setFill(Color.valueOf("A9A9A9"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    void set_video(){
    }
    public void clickonnewgame(Stage stage){
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                ball.start(stage);

            }
        };
        //Registering the event filter
        newgame.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

/////------------ADD into GUI -----------------------------



        Line line=new Line();
        line.setStartX(100);
        line.setStartY(400);
        line.setEndX(500.0);
        line.setEndY(200);


//        ImageView back=new ImageView(image);

        newgame.setScaleX(2);
        newgame.setScaleY(2);
        newgame.setLayoutX(210);
        newgame.setLayoutY(450);

        Load_Game.setScaleX(2);
        Load_Game.setScaleY(2);
        Load_Game.setLayoutX(210);
        Load_Game.setLayoutY(530);

        Options.setScaleX(2);
        Options.setScaleY(2);
        Options.setLayoutX(210);
        Options.setLayoutY(610);

        Exit.setScaleX(2);
        Exit.setScaleY(2);
        Exit.setLayoutX(210);
        Exit.setLayoutY(690);
        set_GUI_frame(primaryStage);
        clickonnewgame(primaryStage);


        //Scenene 2

//        Group root = new Group(set_background());
//        root.getChildren().add(text);
//        root.getChildren().add(set_Playername());
//        root.getChildren().add(newgame);
//        root.getChildren().add(Options);
//        root.getChildren().add(Exit);

//        primaryStage.setTitle("--------------------**********              Colour Switch           **********------------------");
//        Scene scene = new Scene(root, width, length);
//        scene.setFill(Color.valueOf("A9A9A9"));
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }



}
