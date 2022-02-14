package com.example.javafxdemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridStage extends Stage {
    public void init() {

        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

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

        root.add(button1, 0,0);
        root.add(button2, 0,1);
        root.add(button3, 0,2);
        root.add(button4, 0,3);
        root.add(button5, 1,0);
        root.add(button6, 1,1);
        root.add(button7, 1,2);
        root.add(button8, 1,3);
        root.add(button9, 2,0);
        root.add(button10, 3,1);


        Scene scene = new Scene(root, 600, 400);

        setTitle("GridPane");
        setScene(scene);
        show();
    }
}
