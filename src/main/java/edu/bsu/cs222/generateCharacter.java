package edu.bsu.cs222;

public class generateCharacter {
    public static int generateAbilityScore(){
        int[] score = new int[0];
        int num = 6;
        int value = 0;

        for(int i = 0; i < 4; i++){
            score[i] = randomRoll.rollOfSix();
            if (i < num){
                num = i;
            }
        }
        for(int i = 0; i < score.length; i++){
            value += score[i];
        }
        return value-num;
    }

    public static void chooseRandomLevel(){

    }
}
