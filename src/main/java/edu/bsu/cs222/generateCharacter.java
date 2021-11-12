package edu.bsu.cs222;

public class generateCharacter {
    // generate ability score, score being >= 3, or score <= 18
    public static int generateAbilityScore(){
        int[] score = new int[4];
        int num = 6;
        int value = 0;

        for(int i = 0; i < 4; i++){
            score[i] = randomRoll.rollOfSix();
            if (i < num){
                num = i;
            }
        }
        for (int j : score) {
            value += j;
        }
        return value-num;
    }
    // generate random level, calculate associated changed to stats.
    public static void chooseRandomLevel(){

    }
}
