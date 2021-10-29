package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calcRollTest {
    @Test
    public void rollOfFourTest(){
        int test = randomRoll.rollOfFour();
        Assertions.assertTrue(test >= 1 && test <= 4);
    }
    @Test
    public void rollOfSixTest(){
        int test = randomRoll.rollOfSix();
        Assertions.assertTrue(test < 1 || test <= 6);
    }
    @Test
    public void rollOfEightTest(){
        int test = randomRoll.rollOfEight();
        Assertions.assertTrue(test >= 1 && test <= 8);
    }
    @Test
    public void rollOfTenTest(){
        int test = randomRoll.rollOfTen();
        Assertions.assertTrue(test >= 1 && test <= 10);
    }
    @Test
    public void rollOfTwelveTest(){
        int test = randomRoll.rollOfTwelve();
        Assertions.assertTrue(test >= 1 && test <= 12);
    }
    @Test
    public void rollOfTwentyTest(){
        int test = randomRoll.rollOfTwenty();
        Assertions.assertTrue(test >= 1 && test <= 20);
    }
}
