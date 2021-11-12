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
}
