package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calcRollTest {
    @Test
    public void rollOfFourTest() throws Exception{
        int test = randomRoll.rollOfFour();
        Assertions.assertTrue(test >= 1 && test <= 4);
    }
    @Test
    public void rollOfSixTest() throws Exception{
        int test = randomRoll.rollOfSix();
        Assertions.assertTrue(test >= 1 && test <= 6);
    }
    @Test
    public void rollOfEightTest() throws Exception{
        int test = randomRoll.rollOfEight();
        Assertions.assertTrue(test >= 1 && test <= 8);
    }
    @Test
    public void rollOfTenTest() throws Exception{
        int test = randomRoll.rollOfTen();
        Assertions.assertTrue(test >= 1 && test <= 10);
    }
    @Test
    public void rollOfTwelveTest() throws Exception{
        int test = randomRoll.rollOfTwelve();
        Assertions.assertTrue(test >= 1 && test <= 12);
    }
    @Test
    public void rollOfTwentyTest() throws Exception{
        int test = randomRoll.rollOfTwenty();
        Assertions.assertTrue(test >= 1 && test <= 20);
    }
}
