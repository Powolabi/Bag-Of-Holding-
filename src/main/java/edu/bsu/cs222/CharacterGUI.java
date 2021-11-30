package edu.bsu.cs222;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterGUI {
    static Stage stage = new Stage();
    protected static void mainUI() throws IOException {
        stage.initModality(Modality.APPLICATION_MODAL);

        FXMLLoader loader = new FXMLLoader(CharacterGUI.class.getResource("character-view.fxml"));
        Parent root = loader.load();
        HelloApplication helloApplication = loader.getController();
        TextField text = new TextField("Character Session");
        //send data to application
        //define rootPane
        //rootPane.getChildren().addAll(root);

    }
}
