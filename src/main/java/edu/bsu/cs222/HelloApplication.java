package edu.bsu.cs222;

import javafx.application.Application;
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
    private static int hold;
    @Override
    public void start(Stage stage) throws IOException {
        AtomicInteger count = new AtomicInteger();

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

        HBox playerOrDm = new HBox(10);
        playerOrDm.getChildren().addAll(name, player, dMaster);
        Scene PD = new Scene(playerOrDm);

        // if DM -> Input # of Player Characters

        Label pcCount = new Label("How many Players are at the table?\n(DM not included)");
        TextField inputPCCount = new TextField();
        Button submitPlayerCount = new Button("submit");
        String playerCount = inputPCCount.getText();

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

        Label numTimes = new Label("" + count + "/" + hold + " Player Characters");
        Button subm = new Button("Submit");
        Button done = new Button("Done");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, charName, race, characterClass, alignment, hitpoints, ac, speed, level, subm, numTimes);
        Scene dmSetPC = new Scene(vbox);

        // Ability score Scene

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll();
        Scene abilScore = new Scene(vBox);

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
                count.addAndGet(1);

                stage.setScene(abilScore);
        }
        });

        done.setOnAction(e -> {
            stage.setScene(dmSetPC);
        });

        // if PC -> input character name
        Label inputLabel = new Label("What is your characters name?");
        TextField input = new TextField();
        input.setPromptText("Enter Character Name");
        String characterName = input.getText();
        Button submitCharacterName = new Button("submit");

        HBox characterNameSet = new HBox();
        characterNameSet.getChildren().addAll(inputLabel, input, submitCharacterName);
        Scene characterNameScene = new Scene(characterNameSet);

        // Character Race
        Label inputLabelRace = new Label("What is your characters Race?");
        TextField inputRace = new TextField();
        input.setPromptText("Enter Character Name");
        String characterRace = input.getText();
        Button submitCharacterRace = new Button("submit");

        HBox characterRaceSet = new HBox();
        characterRaceSet.getChildren().addAll(inputLabelRace, inputRace, submitCharacterRace);
        Scene characterRaceScene = new Scene(characterRaceSet);

        // Character Class
        Label inputLabelClass = new Label("What is your characters Class?");
        TextField inputClass = new TextField();
        input.setPromptText("Enter Character Name");
        String charClass = input.getText();
        Button submitCharacterClass = new Button("submit");

        HBox characterClassSet = new HBox();
        characterClassSet.getChildren().addAll(inputLabelClass, inputClass, submitCharacterClass);
        Scene characterClassScene = new Scene(characterClassSet);

        // Alignment
        Label inputLabelAlignment = new Label("What is your characters Class?");
        TextField inputAlignment = new TextField();
        input.setPromptText("Enter Character Name");
        String characterAlignment = input.getText();
        Button submitCharacterAlignment = new Button("submit");

        HBox characterAlignmentSet = new HBox();
        characterAlignmentSet.getChildren().addAll(inputLabelClass, inputClass, submitCharacterClass);
        Scene characterAlignmentScene = new Scene(characterAlignmentSet);

        // Generate or add Ability Scores

        // AC

        // Hitpoints



        //oldSession.setOnAction(e -> stage.setScene());
        newSession.setOnAction(e -> stage.setScene(PD));
        dMaster.setOnAction(e -> stage.setScene(playerCountScene));
        submitPlayerCount.setOnAction(e -> {
            hold = getInt(inputPCCount.getText().trim());
            System.out.println(hold);
            stage.setScene(dmSetPC);
        });
        player.setOnAction(e -> stage.setScene(characterNameScene));
        submitCharacterName.setOnAction(e -> stage.setScene(characterRaceScene));
        submitCharacterRace.setOnAction(e -> stage.setScene(characterClassScene));
        submitCharacterClass.setOnAction(e -> stage.setScene(characterAlignmentScene));

        // set stage
        stage.setTitle("New Session");
        stage.setScene(newSessionScene);
        stage.show();
    }

    public int getInt(String test){
        try{
            return Integer.parseInt(test.trim());
        }catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}