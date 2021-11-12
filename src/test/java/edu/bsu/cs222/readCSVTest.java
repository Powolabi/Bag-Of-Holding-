package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class readCSVTest {
    @Test
    public void scanFileTest(){
        readCSV.scanFile("equipment.csv");
    }
}
