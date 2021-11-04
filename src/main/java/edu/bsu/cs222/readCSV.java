package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;

public class readCSV {

    public static void scanFile(){
        Scanner sc = null;
        InputStream csv = Thread.currentThread().getContextClassLoader().getResourceAsStream("equipment.csv");
        sc = new Scanner(csv);
        sc.useDelimiter(",");
        while (sc.hasNext()){
            System.out.print(sc.next());
        }
        sc.close();

    }


}
