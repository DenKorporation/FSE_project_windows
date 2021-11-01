package com.uni;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App  extends Application {

    private Database database;

    public static void launch(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        // установка надписи
        Text text = new Text("Hello JAVAFX!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(80);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("GISMETEOSTATS");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}