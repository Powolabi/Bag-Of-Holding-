package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// store contents of character, create database file
public class createFiles {
    public static boolean itemFile, spellFile, attackFile, characterFile;

    private static void characterDetails(){
        try {
            File myObj = new File("C:\\character_details.txt");
            if (myObj.createNewFile()) {
                characterFile = true;
            } else {
                characterFile = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void items() {
        try {
            File myObj = new File("C:\\items.txt");
            if (myObj.createNewFile()) {
                itemFile = true;
            } else {
                itemFile = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void spells(){
        try {
            File myObj = new File("C:\\spells.txt");
            if (myObj.createNewFile()) {
                spellFile = true;
            } else {
                spellFile = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void attacks(){
        try {
            File myObj = new File("C:\\attacks.txt");
            if (myObj.createNewFile()) {
                attackFile = true;
            } else {
                attackFile = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
