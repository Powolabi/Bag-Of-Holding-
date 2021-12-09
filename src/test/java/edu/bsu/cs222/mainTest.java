package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class mainTest {
    @Test
    public void testStart(){
        String route = "character";
        System.setIn(new ByteArrayInputStream(route.getBytes()));
        String name = "name";

    }
}
