package edu.bsu.cs222;

import java.io.InputStream;
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

    public static void getFileData(String fileName){
        //current set sort - NAME.RACE.CLASS.ALIGNMENT.LEVEL.HITPOINTS.ARMORCLASS.STR.DEX.CON.INT.CHAR.WIS
        InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] list = line.split(".");
            characterDetails details = new characterDetails(list[0], list[1], list[2], list[3], list[4], list[5], list[6], list[7], list[8], list[9], list[10], list[11], list[12]);
            System.out.println("");
            System.out.println("" + list[0]);
            System.out.println("" + list[1]);
            System.out.println("" + list[2]);
            System.out.println("" + list[3]);
            System.out.println("" + list[4]);
            System.out.println("" + list[5]);
            System.out.println("" + list[6]);
            System.out.println("" + list[7]);
            System.out.println("" + list[8]);
            System.out.println("" + list[9]);
            System.out.println("" + list[10]);
            System.out.println("" + list[11]);
            System.out.println("" + list[12]);
        }
    }

}
