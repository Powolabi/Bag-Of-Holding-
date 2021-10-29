package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readCSV {

    public static void scanFile(){
        Scanner sc;
        try {
            sc = new Scanner(new File("F:\\CSVDemo.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
