package edu.bsu.cs222;

import java.io.FileWriter;
import java.io.IOException;

public class saveToFile {

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
            FileWriter writer = new FileWriter( "src\\main\\resources\\" + details.getName() + ".txt");

            writer.write(details.getName() + "," + details.getRace() + "," + details.getCharacterClass() + "," + details.getAlignment() + "," + details.getLevel() + "," + details.getHitPoints() + "," + characterDetails.getArmorClass() + ",");
            writer.write( characterDetails.getStrength() + "," + characterDetails.getDexterity() + "," + characterDetails.getConstitution() + "," + characterDetails.getIntelligence() + "," + characterDetails.getCharisma() + "," + details.getWisdom());
            //current set sort - NAME.RACE.CLASS.ALIGNMENT.LEVEL.HITPOINTS.ARMORCLASS.STR.DEX.CON.INT.CHAR.WIS
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
