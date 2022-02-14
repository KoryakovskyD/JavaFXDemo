package com.example.javafxdemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TileStage extends Stage {
    public void init() {

        TilePane root = new TilePane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6Button 6Button 6");
        Button button7 = new Button("Button 7");
        Button button8 = new Button("Button 8");
        Button button9 = new Button("Button 9");
        Button button10 = new Button("Button 10");

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);
        root.getChildren().add(button6);
        root.getChildren().add(button7);
        root.getChildren().add(button8);
        root.getChildren().add(button9);
        root.getChildren().add(button10);

        Scene scene = new Scene(root, 600, 400);

        setTitle("TilePane");
        setScene(scene);
        show();

    }
}
