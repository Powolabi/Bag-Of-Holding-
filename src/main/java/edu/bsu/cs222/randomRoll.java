package edu.bsu.cs222;

import java.util.Random;

public class randomRoll {
    // random value between 1 and 4
    public static int rollOfFour(){
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }
    // random value between 1 and 6
    public static int rollOfSix(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    // random value between 1 and 8
    public static int rollOfEight(){
        Random rand = new Random();
        return rand.nextInt(8) + 1;
    }
    // random value between 1 and 10
    public static int rollOfTen(){
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
    // random value between 1 and 12
    public static int rollOfTwelve(){
        Random rand = new Random();
        return rand.nextInt(12) + 1;
    }
    // random value between 1 and 20
    public static int rollOfTwenty(){
        Random rand = new Random();
        return rand.nextInt(20) + 1;
    }
}
