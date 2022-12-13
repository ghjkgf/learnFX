package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello World");
        Button button = new Button("蔡广小站");
        BorderPane pane = new BorderPane(button);
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                getHostServices().showDocument("www.caiguang.cc");
            }
        });
        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("瓦大喜");
        primaryStage.getIcons().add(new Image("egg.png") );
        primaryStage.setResizable(false);

        // primaryStage.initStyle(StageStyle.TRANSPARENT);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
