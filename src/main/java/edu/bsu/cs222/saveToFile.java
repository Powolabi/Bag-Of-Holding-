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

    public void writeNewPlayerCharacter(Queue<characterDetails> qCharDetails) {
        try {
            FileWriter myObj = new FileWriter( "src\\main\\resources\\characterDetails.txt", true);

            for (characterDetails c : qCharDetails) {
                myObj.write(c.getName() + ".");
                myObj.write(c.getRace()+ ".");
                myObj.write(c.getCharacterClass()+ ".");
                myObj.write(c.getArmorClass()+ ".");
                myObj.write(c.getAlignment()+ ".");
                myObj.write(c.getHitPoints()+ ".");
                myObj.write(c.getArmorClass()+ ".");
                myObj.write(c.getLevel());
                myObj.write("\n");
            }
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
