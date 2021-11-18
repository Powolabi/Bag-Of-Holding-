package edu.bsu.cs222;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CampaignGUI {
    static Stage stage = new Stage();

    protected static void numPlayers(String numberOfPlayers){
        stage.initModality(Modality.APPLICATION_MODAL);
        final int[] num = new int[1];
        TextField number_of_players = new TextField();

        Button submit = new Button("->");

        VBox layout = new VBox(10);
        Scene scene = new Scene(layout);
        layout.getChildren().addAll(number_of_players, submit);
        stage.setScene(scene);
        stage.show();
        submit.setOnAction(e -> num[0] = Integer.parseInt(number_of_players.getText()));

        stage.close();
    }
}
