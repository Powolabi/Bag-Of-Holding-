package edu.bsu.cs222;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.Scanner;

public class saveToFile {

    public String parseFileFor(){

        return "";
    }

    public void writeSessionName(String name){
        try{
            FileWriter myObj = new FileWriter("src\\main\\resources\\SessionName.txt", true);

            myObj.write(name);
            myObj.write("\n");

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeNewPlayerCharacter(characterDetails details) {
        try {
            FileWriter myObj = new FileWriter( "src\\main\\resources\\characters\\" + details.getName() + ".txt", true);

            myObj.write(details.getName() + "." + details.getRace() + "." + details.getCharacterClass() + "." + details.getAlignment() + "." + details.getLevel() + "." + details.getHitPoints() + "." + details.getArmorClass() + ".");
            myObj.write( details.getStrength() + "." + details.getDexterity() + "." + details.getConstitution() + "." + details.getIntelligence() + "." + details.getCharisma() + "." + details.getWisdom());
            //current set sort - NAME.RACE.CLASS.ALIGNMENT.LEVEL.HITPOINTS.ARMORCLASS.STR.DEX.CON.INT.CHAR.WIS
            myObj.write("\n");
            myObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
