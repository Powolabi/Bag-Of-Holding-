package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("New session?\n");
        RadioButton yes = new RadioButton();
        RadioButton no = new RadioButton();
        if(yes.isSelected()){

        } else if (no.isSelected()){

        }
    }
}