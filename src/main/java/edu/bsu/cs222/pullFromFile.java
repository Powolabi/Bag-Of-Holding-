package edu.bsu.cs222;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class pullFromFile {

    public static void readFile(String fileName){
        InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        Scanner sc = new Scanner(file);
        sc.useDelimiter(".");
        while (sc.hasNext()){
            System.out.print(sc.next());
        }
        sc.close();
    }

    public static characterDetails getFileData(String fileName){
        //current set sort - NAME.RACE.CLASS.ALIGNMENT.LEVEL.HITPOINTS.ARMORCLASS.STR.DEX.CON.INT.CHAR.WIS
        InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        Scanner sc = new Scanner(file);
        sc.useDelimiter(".");
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNext()){
            list.add(sc.next());
        }
            characterDetails details = new characterDetails(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10), list.get(11), list.get(12));
            return details;
            //NAME.RACE.CLASS.ALIGNMENT.LEVEL.HITPOINTS.ARMORCLASS.STR.DEX.CON.INT.CHAR.WIS
    }

}


