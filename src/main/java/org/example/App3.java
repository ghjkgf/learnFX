package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author zsl
 * @date 2022/12/11
 * @apiNote
 */
public class App3 extends Application {

    public static void main(String[] args) {
        App3.launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 500, 800);

        final Label label = new Label("hello world");
        label.setLayoutX(200);
        label.setLayoutY(200);

        Button button = new Button("向上移动");
        button.setLayoutX(300);
        button.setLayoutY(200);

        // 如何按住一直触发
        button.setOnAction(event -> label.setLayoutY(label.getLayoutY()-5));
        // 无效的
        // button.setOnKeyPressed(event ->  label.setLayoutY(label.getLayoutY()-5));

        // 释放就触发
        // scene.setOnKeyReleased(event -> {
        //     KeyCode code = event.getCode();
        //     if (code.equals(KeyCode.DOWN))
        //         label.setLayoutY(label.getLayoutY() + 5);
        // });

        // 按住一直触发
        scene.setOnKeyPressed(event -> {
            KeyCode code = event.getCode();
            if (code.equals(KeyCode.DOWN))
                label.setLayoutY(label.getLayoutY() + 5);
        });

        TextField textField = new TextField("哪吒");
        textField.setLayoutX(50);
        textField.setLayoutY(300);
        // textField.setScaleX(100);// 啥意思
        // textField.setMaxWidth(400);
        textField.setPrefWidth(400);
        textField.setOnDragOver( event -> {
            Dragboard dragboard = event.getDragboard();
            if(dragboard.hasFiles()){
                String path = dragboard.getFiles().get(0).getAbsolutePath();
                textField.setText(path);
            }
        });

        root.getChildren().addAll(label,button,textField);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
