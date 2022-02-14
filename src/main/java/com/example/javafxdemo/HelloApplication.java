package com.example.javafxdemo;

import javafx.application.Application;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Scene scene,
          scene2;


    @Override
    public void start(Stage primaryStage) throws IOException {

        // First scene
        // Scene change button
        Button btn = new Button();
        btn.setText("Change scene2");
        btn.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });
        FlowPane root = new FlowPane();
        // change orientation
        root.setOrientation(Orientation.VERTICAL);
        // change alignment
        root.setAlignment(Pos.CENTER);
        // change button interval
        root.setHgap(20);
        root.setVgap(20);
        root.getChildren().add(btn);
        scene = new Scene(root, 300, 500);

        // Opening a new window with the linker BorderPane
        Button borderButton = new Button("BorderPane");
        borderButton.setOnAction(e -> {
            BorderStage borderStage = new BorderStage();
            borderStage.init();
        });
        root.getChildren().add(borderButton);

        // Opening a new window with the linker FlowPane
        Button flowButton = new Button("FlowPane");
        flowButton.setOnAction(e -> {
            FlowStage flowStage = new FlowStage();
            flowStage.init();
        });
        root.getChildren().add(flowButton);

        // Opening a new window with the linker TilePane
        Button tileButton = new Button("TilePane");
        tileButton.setOnAction(e -> {
            TileStage tileStage = new TileStage();
            tileStage.init();
        });
        root.getChildren().add(tileButton);

        // Opening a new window with the linker StackPane
        Button stackButton = new Button("StackPane");
        stackButton.setOnAction(e -> {
            StackStage stackStage = new StackStage();
            stackStage.init();
        });
        root.getChildren().add(stackButton);

        // Opening a new window with the linker GridPane
        Button gridButton = new Button("GridPane");
        gridButton.setOnAction(e -> {
            GridStage gridStage = new GridStage();
            gridStage.init();
        });
        root.getChildren().add(gridButton);

        // Opening a new window with the linker VBox
        Button vboxButton = new Button("VBox");
        vboxButton.setOnAction(e -> {
            VBoxStage vboxStage = new VBoxStage();
            vboxStage.init();
        });
        root.getChildren().add(vboxButton);


        // Second scene
        FlowPane flowPane = new FlowPane();
        Button changeScene = new Button("Change scene1");
        changeScene.setOnAction(e -> {
            primaryStage.setScene(scene);
        });
        scene2 = new Scene(flowPane, 400, 300);
        flowPane.getChildren().add(changeScene);


        primaryStage.setTitle("Hello world!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}