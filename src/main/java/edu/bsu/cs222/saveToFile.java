package edu.bsu.cs222;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

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
            FileWriter myObj = new FileWriter( "src\\main\\resources\\characterDetails.txt", true);
            myObj.write("name: " + details.getName() + ".");
            myObj.write("race: " + details.getRace() + ".");
            myObj.write("class: " + details.getCharacterClass() + ".");
                //myObj.write("armor: " + c.getArmorClass()+ ".");
            myObj.write("align: " + details.getAlignment() + ".");
                //myObj.write("hp: " + c.getHitPoints()+ ".");
            myObj.write("level: " + details.getLevel());
            myObj.write("\n");
            myObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeNewPlayerCount(String... count) {
        try {
            FileWriter myObj = new FileWriter( "src\\main\\resources\\users.txt", true);

            for (String c : count) {
                myObj.write(c);
            }
            myObj.write("\n");
            myObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
