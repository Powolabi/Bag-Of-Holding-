package edu.bsu.cs222;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
/*
public class HelloApplication extends Application {
    //private static final Queue<abilityScores> abilityScores = new LinkedList<>();
    Stage window;
    static String holdInt;
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
        ObservableList<String> fileNames = FXCollections.observableArrayList();

        list.setItems(fileNames);

        newSesh.setOnAction(e -> {
            Object character = "Character";
            Object campaign = "Campaign";
            if(comboBox.getValue() == null){
                errorResponse.NoValueFound();
            }else if (comboBox.getValue().equals(character)){
                try {
                    CharacterGUI.mainUI();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else if (comboBox.getValue().equals(campaign)) {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(window);

                TextField number_of_players = new TextField();
                number_of_players.setPromptText("Number Of Players");
                Button submit = new Button("Enter");
                submit.setOnAction(e1 -> {
                    holdInt = number_of_players.getText();
                    CampaignGUI.numPlayers(holdInt);
                    dialog.close();
                });
                ToolBar tools = new ToolBar(number_of_players, submit);

                VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(tools);
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
            }
        });
        select.setOnAction(e -> {
            list.getSelectionModel().getSelectedItem();
        });

        VBox layout = new VBox(10);
        layout.setLayoutY(list.getLayoutY());
        Scene scene = new Scene(layout);
        layout.getChildren().addAll(list, toolBar);
        stage.setHeight(250);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> stage.close());
    }

    public static void main(String[] args) {
        launch();
    }
}
*/
