package edu.bsu.cs222;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class errorResponse {
    static Stage stage = new Stage();
    protected static void NoValueFound(){
        Text text = new Text("Enter the Session type");
        VBox layout = new VBox(20);
        Scene scene = new Scene(layout);
        layout.getChildren().addAll(text);
        stage.setScene(scene);
        stage.show();
    }
}
