package edu.bsu.cs222;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class readFileTest {

    @Test

    void printFileTest() throws FileNotFoundException {
        pullFromFile pull = new pullFromFile();
        pull.readFile("testFile.txt");
    }
}
