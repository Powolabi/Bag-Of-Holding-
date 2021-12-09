package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class mainTest {
    @Test
    public void testStart(){
        main m = new main();
        int i = main.stringToNumb("28");
        Assertions.assertEquals(28, i);
    }
}
