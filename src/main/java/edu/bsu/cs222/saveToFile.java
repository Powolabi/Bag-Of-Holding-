package edu.bsu.cs222;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveToFile {

    public static void saveXtoY(String x, String y){

        try{
            FileWriter myObj = new FileWriter( "C:\\Users\\brend\\IdeaProjects\\Final-Project-Brendan-Peter-Micah\\src\\main\\resources\\" + y + ".txt");
            myObj.write(x);
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    // break data, aka items, spells, and character information in to its individual parts,
    // Convert them to string type, tie all like information.
    // if its a new item or larger piece of data, create a new line.
    public static void parseData(String toStore){
        switch (toStore) {
            case "Item" -> saveTypeItem();
            case "Class" -> saveTypeClass();
            case "Spell" -> saveTypeSpell();
            case "Race" -> saveTypeRace();
            case "Character" -> saveTypeCharacter();
            default -> saveTypeNotes();
        }

    }

    private static void saveTypeNotes() {
    }

    private static void saveTypeCharacter() {
    }

    private static void saveTypeRace() {
    }

    private static void saveTypeSpell() {
    }

    private static void saveTypeClass() {
    }

    private static void saveTypeItem() {
    }
}
