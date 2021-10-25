package bsu.cs222.edu;

public class calcRollTest {
    public static int rollOfFourTest() throws Exception{
        int test = randomRoll.rollOfFour();
        if (test >= 1 || test <= 4){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int rollOfSixTest() throws Exception{
        int test = randomRoll.rollOfSix();
        if (test >= 1 || test <= 6){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int rollOfEightTest() throws Exception{
        int test = randomRoll.rollOfEight();
        if (test >= 1 || test <= 8){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int rollOfTenTest() throws Exception{
        int test = randomRoll.rollOfTen();
        if (test >= 1 || test <= 10){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int rollOfTwelveTest() throws Exception{
        int test = randomRoll.rollOfTwelve();
        if (test >= 1 || test <= 12){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int rollOfTwentyTest() throws Exception{
        int test = randomRoll.rollOfTwenty();
        if (test >= 1 || test <= 20){
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
