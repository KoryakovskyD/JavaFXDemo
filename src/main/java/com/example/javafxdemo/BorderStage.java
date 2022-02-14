package com.example.javafxdemo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderStage extends Stage {

    public void init() {
        BorderPane borderPane = new BorderPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        borderPane.setTop(button1);
        borderPane.setCenter(button2);
        borderPane.setBottom(button3);
        borderPane.setLeft(button4);
        borderPane.setRight(button5);

        Scene scene = new Scene(borderPane, 600, 400);

        setTitle("BorderPane");
        setScene(scene);
        show();
    }
}
