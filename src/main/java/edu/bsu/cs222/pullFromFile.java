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

}
