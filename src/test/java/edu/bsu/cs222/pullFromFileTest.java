package edu.bsu.cs222;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;


public class pullFromFileTest {
    @Test
    public void readFileTest() throws FileNotFoundException {

        pullFromFile.readFile("morpheus.txt");
    }
}
