package edu.bsu.cs222;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Session {
    static String listItem;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("New session?\n");

    }

    static Stage stage = new Stage();

    public static String display(String sesh){
        stage.setTitle("Bag of Holding");

        TextField characterName;



        VBox layout = new VBox(10);
        Scene scene = new Scene(layout);
        layout.getChildren().addAll();
        stage.setScene(scene);
        stage.show();
        return "";
    }
}