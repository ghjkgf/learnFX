package org.example;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author zsl
 * @date 2022/12/11
 * @apiNote node坐标随窗口变化
 */
public class App2 extends Application {
    public static void main(String[] args) {
        App2.launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 500, 800);
        Circle circle = new Circle(250, 250, 100);

        circle.setStroke(Color.PINK);
        circle.setFill(Color.GREEN);
        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));

        // 设置监听器
        // 如何设置为鼠标停止拖动才触发
        circle.centerXProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("x 轴中心点改变了,从"+oldValue+"变到了"+newValue);
            }
        });

        root.getChildren().add(circle);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
