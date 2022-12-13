package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * @author zsl
 * @date 2022/12/11
 * @apiNote
 */
public class App4 extends Application {
    public static void main(String[] args) {
        App4.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(250, 250, 100);
        circle.setFill(Color.rgb(255,0,0));
        Circle circle2 = new Circle(50, 50, 50);
        circle2.setFill(Color.web("#f66a08"));
        Circle circle3 = new Circle(350, 350, 10);
        circle3.setFill(Color.BLUE);

        Label label = new Label("得意的笑");
        label.setLayoutX(400);
        label.setLayoutY(400);
        label.setFont(Font.font("得意黑", FontWeight.BOLD,30));

        ImageView imageView = new ImageView(new Image("egg.png"));
        imageView.setLayoutX(600);
        imageView.setLayoutY(100);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(circle,circle2,circle3,label,imageView);
        Scene scene = new Scene(root, 500, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
