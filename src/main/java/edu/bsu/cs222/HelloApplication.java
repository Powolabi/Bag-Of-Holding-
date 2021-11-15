package edu.bsu.cs222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloApplication extends Application {
    private static final Queue<characterDetails> characterInfo = new LinkedList<>();
    //private static final Queue<abilityScores> abilityScores = new LinkedList<>();
    @Override
    public void start(Stage stage) throws IOException {
        AtomicInteger count = new AtomicInteger();
        String characterName, playerCount;


        //Main scene, describes the start menu
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());

        // New session scene
            // Set text field
        Button oldSession = new Button("Old Session");
        Button newSession = new Button("New Session");

        HBox layoutNewSession = new HBox(10);
        layoutNewSession.getChildren().addAll(oldSession, newSession);
        Scene newSessionScene = new Scene(layoutNewSession);


        // Player or dm?
        Label name = new Label("Are you a Player (PC) or Dungeon Master");
        Button player = new Button("Player Character");
        Button dMaster = new Button("Dungeon Master");

        Button submitPOrD = new Button("submit");

        HBox playerOrDm = new HBox(10);
        playerOrDm.getChildren().addAll(name, player, dMaster);
        Scene PD = new Scene(playerOrDm);

        // if DM -> Input # of Player Characters

        Label pcCount = new Label("How many Players are at the table?\n(DM not included)");
        TextField inputPCCount = new TextField();
        playerCount = inputPCCount.getText();
        Button submitPlayerCount = new Button("submit");

        HBox playerCnt = new HBox();
        playerCnt.getChildren().addAll(pcCount, inputPCCount, submitPlayerCount);
        Scene playerCountScene = new Scene(playerCnt);

        // Dungeon master -> Player characters set up //
        Label label = new Label("Enter the Character details");
        TextField charName = new TextField();
        charName.setPromptText("Character Name");

        TextField race = new TextField();
        race.setPromptText("Character Race");

        TextField characterClass = new TextField();
        characterClass.setPromptText("Character Class");

        TextField alignment = new TextField();
        alignment.setPromptText("Character Alignment");

        TextField hitpoints = new TextField();
        hitpoints.setPromptText("Character Hitpoints");

        TextField ac = new TextField();
        ac.setPromptText("Character Armor Class (AC)");

        TextField speed = new TextField();
        speed.setPromptText("Character Speed");

        TextField level = new TextField();
        level.setPromptText("Character Level");

        Label numTimes = new Label("" + count + "/4 Player Characters");
        Button subm = new Button("Submit");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, charName, race, characterClass, alignment, hitpoints, ac, speed, level, subm, numTimes);
        Scene dmSetPC = new Scene(vbox);

        subm.setOnAction( e -> { try{
                characterInfo.add(new characterDetails(name.getText(), race.getText(), characterClass.getText(), alignment.getText(), Integer.parseInt(hitpoints.getText()), Integer.parseInt(ac.getText()), Integer.parseInt(speed.getText()), Integer.parseInt(level.getText())));
            }finally {
                charName.clear();
                race.clear();
                characterClass.clear();
                alignment.clear();
                hitpoints.clear();
                ac.clear();
                speed.clear();
                level.clear();
                if(count.get() <= 4){
                    count.addAndGet(1);
                } else {
                    count.set(0);
                }
            }
        });

        // if PC -> input character name
        Label inputLabel = new Label("What is your characters name?");
        TextField input = new TextField();
        input.setPromptText("Enter Character Name");
        characterName = input.getText();
        Button submitCharacterName = new Button("submit");

        HBox characterNameSet = new HBox();
        characterNameSet.getChildren().addAll(inputLabel, input, submitCharacterName);
        Scene characterNameScene = new Scene(characterNameSet);

        // Character Race

        // Character Class

        oldSession.setOnAction(e -> stage.setScene(PD));
        newSession.setOnAction(e -> stage.setScene(PD));

        // button-on-click scene switch tree for New Campaign
        dMaster.setOnAction(e -> stage.setScene(playerCountScene));
        submitPlayerCount.setOnAction(e -> stage.setScene(dmSetPC));

        // button-on-click scene switch tree for New Player Character
        submitPOrD.setOnAction(e -> stage.setScene(characterNameScene));
        //submitCharacterName.setOnAction(e -> stage.setScene());

        // set stage
        stage.setTitle("New Session");
        stage.setScene(newSessionScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}