package com.example.javafxdemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxStage extends Stage {
    public void init() {

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        TextArea area = new TextArea();
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

        root.getChildren().addAll(area, button1, button2, button3, button4, button5,
                button6, button7, button8, button9, button10);

        Scene scene = new Scene(root, 600, 400);

        setTitle("VBox");
        setScene(scene);
        show();
    }
}
