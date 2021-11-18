package edu.bsu.cs222;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class HelloApplication extends Application {
    public static final Queue<characterDetails> characterInfo = new LinkedList<>();
    //private static final Queue<abilityScores> abilityScores = new LinkedList<>();
    Stage window;
    static String listItem;
    static String fileName;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Bag of Holding");
        // button to create session
        Button newSesh = new Button("+");
        Button select = new Button("Select");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Character");
        comboBox.getItems().add("Campaign");

        ToolBar toolBar = new ToolBar();

        toolBar.getItems().addAll(comboBox, newSesh, select);
        // list of sessions
        ListView<String> list = new ListView<>();
        ObservableList<String> fileNames = FXCollections.observableArrayList(
                "a","b","c","d","e","f"
        );

        list.setItems(fileNames);

        newSesh.setOnAction(e -> {
            Object character = "Character";
            Object campaign = "Campaign";
            if(comboBox.getValue() == null){

            }else if (comboBox.getValue().equals(character)){
                //stage.setScene();
            } else if (comboBox.getValue().equals(campaign)) {
                //stage.setScene();
            }

            Session.display((String) comboBox.getValue());
        });
        select.setOnAction(e -> {
                listItem = list.getSelectionModel().getSelectedItem();
                fileName = Session.display(listItem);
                //System.out.println(fileName);
                fileNames.add(fileName);
        });

        VBox layout = new VBox(10);
        layout.setLayoutY(list.getLayoutY());
        Scene scene = new Scene(layout);
        layout.getChildren().addAll(list, toolBar);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}