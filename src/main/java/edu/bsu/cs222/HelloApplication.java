package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloApplication extends Application {
    public static final Queue<characterDetails> characterInfo = new LinkedList<>();
    //private static final Queue<abilityScores> abilityScores = new LinkedList<>();
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

        Button subm = new Button("Submit");
        Button done = new Button("Done");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, charName, race, characterClass, alignment, hitpoints, ac, speed, level, subm);
        Scene dmSetPC = new Scene(vbox);

        // Ability scores Scene

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll();
        Scene abilScore = new Scene(vBox);

        // if PC -> input character name
        Label inputLabel = new Label("Character Details");
        TextField input = new TextField();
        input.setPromptText("Character Name");

        // Character Race
        TextField inputRace = new TextField();
        inputRace.setPromptText("Race");

        // Character Class
        TextField inputClass = new TextField();
        inputClass.setPromptText("Class");

        // Alignment
        TextField inputAlignment = new TextField();
        inputAlignment.setPromptText("Alignment");

        // Generate or add Ability Scores

        // AC

        // Hitpoints

        // Set items for UserCharacterScene
        Button submitCharacterAlignment = new Button("Submit");
        VBox characterNameSet = new VBox();
        characterNameSet.getChildren().addAll(inputLabel, input, inputRace, inputClass, inputAlignment, submitCharacterAlignment);
        Scene userCharacterScene = new Scene(characterNameSet);

        //oldSession.setOnAction(e -> stage.setScene());
        subm.setOnAction( e -> { try{
            characterInfo.add( new characterDetails(charName.getText(), race.getText(), characterClass.getText(), alignment.getText(), hitpoints.getText(), ac.getText(), speed.getText(), level.getText()));
            writeNewPlayerCharacter(characterInfo);
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
        done.setOnAction(e -> stage.setScene(dmSetPC));
        newSession.setOnAction(e -> stage.setScene(PD));
        dMaster.setOnAction(e -> stage.setScene(playerCountScene));
        submitPlayerCount.setOnAction(e -> stage.setScene(dmSetPC));
        player.setOnAction(e -> stage.setScene(userCharacterScene));
        submitCharacterAlignment.setOnAction(e -> {
                //writeNewPlayerCharacter();
                stage.setScene(userCharacterScene);
        });

        // set stage
        stage.setTitle("New Session");
        stage.setScene(newSessionScene);
        stage.show();
    }

    public void writeNewPlayerCharacter(Queue<characterDetails> qCharDetails) {
        try {
            FileWriter myObj = new FileWriter( "C:\\Users\\brend\\IdeaProjects\\Final-Project-Brendan-Peter-Micah\\src\\main\\resources\\users.txt");

            for (characterDetails c : qCharDetails) {
                myObj.write(c.getName());
                myObj.write(c.getRace());
                myObj.write(c.getCharacterClass());
                myObj.write(c.getArmorClass());
                myObj.write(c.getAlignment());
                myObj.write(c.getHitPoints());
                myObj.write(c.getArmorClass());
                myObj.write(c.getLevel());
                myObj.write("\n");
                myObj.write("-");
                myObj.write("\n");
            }
            myObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}