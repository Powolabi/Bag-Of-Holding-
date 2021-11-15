package edu.bsu.cs222;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Main scene, describes the start menu
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 320, 240);

        // New session scene
            // Set text field
        //Button oldSession = new Button("old");
        Button newSession = new Button("new");
        //oldSession.setOnAction(); // if session already exists
        newSession.setOnAction(newTextInput("Session Name"));
        HBox layoutNewSession = new HBox(10);
        layoutNewSession.getChildren().addAll(newSession);
        Scene newSessionScene = new Scene(layoutNewSession, 200, 300);

        // Player or dm?
        Label name = new Label("Are you a Player (PC) or Dungeon Master");
        RadioButton player = new RadioButton();
        RadioButton dMaster = new RadioButton();

        HBox playerOrDm = new HBox(10);
        playerOrDm.getChildren().addAll(name, player, dMaster);
        Scene PD = new Scene(playerOrDm);

        // if PC -> input character name

        stage.setTitle("New Session");
        stage.setScene(mainScene);
        stage.show();
    }

    public static EventHandler<ActionEvent> newTextInput(String request){

        Label name = new Label(request);
        TextField input = new TextField();
        input.setPromptText("Enter " + request);
        HBox hb = new HBox();
        hb.getChildren().addAll(name, input);
        hb.setSpacing(10);

        return null;
    }

    public static void main(String[] args) {
        launch();
    }
}