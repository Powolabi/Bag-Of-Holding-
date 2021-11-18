package edu.bsu.cs222;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CharacterGUI {
    static Stage stage = new Stage();
    protected static void gui(){
        stage.initModality(Modality.APPLICATION_MODAL);



        VBox layout = new VBox(10);
        Scene scene = new Scene(layout);
        layout.getChildren().addAll();
        stage.setScene(scene);
        stage.show();
    }
}
