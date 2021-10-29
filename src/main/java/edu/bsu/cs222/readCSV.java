package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readCSV {

    public static void scanFile(){
        Scanner sc;
        try {
            sc = new Scanner(new File("C:equipment.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
