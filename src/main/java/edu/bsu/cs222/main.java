package edu.bsu.cs222;

import java.util.Scanner;

import static edu.bsu.cs222.saveToFile.*;

public class main {

    String character = "character";
    String campaign = "campaign";

    public static void main(String[] args){
        createCharacter(1);
    }


    private void commmandline(){
        System.out.println("Bag of Holding\n");

        System.out.println(character + " or " + campaign + "\n");
        String input = System.console().readLine();
        int playerCount = numberOfPlayers(input);

        createCharacter(playerCount);

    }

    public static void createCharacter(int numPlayers){
        Scanner input = new Scanner(System.in);
        String name;
        String race;
        String align;
        String level;
        String charClass;
        for(int i = 0; i < numPlayers; i++){
            System.out.println("Character Creation\n");

            System.out.println("Enter your character's name:");
            name = input.nextLine();

            System.out.println("Enter your character's level:");
            level = input.nextLine();

            System.out.println("Enter your character's class:");
            charClass = input.nextLine();

            System.out.println("Enter your character's race:");
            race = input.nextLine();

            System.out.println("Enter your character's alignment:");
            align = input.nextLine();

            characterDetails details = new characterDetails(name, race, charClass, align, level);
            saveToFile.writeNewPlayerCharacter(details);

            /*System.out.println("Don't have dice? Want us to roll your stats for you? you just organize them");
            System.out.println("y/n");

            check = System.console().readLine();

            if(check == "y"){
                int[] score = new int[6];
                for(int j = 0; i < 6; i++){
                    score[j] = randomRoll.generateAbilityScore();
                }
                System.out.println(score);

                System.out.println("Input the stats in the order you'd like");

                System.out.println("input your Roll for Strength");
                characterDetails.setStrength(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Dexterity");
                characterDetails.setDexterity(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Constitution");
                characterDetails.setConstitution(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Intelligence");
                characterDetails.setIntelligence(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Charisma");
                characterDetails.setCharisma(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Wisdom");
                characterDetails.setWisdom(stringToNumb(System.console().readLine()));

            } else {
                System.out.println("input your Roll for Strength");
                characterDetails.setStrength(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Dexterity");
                characterDetails.setDexterity(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Constitution");
                characterDetails.setConstitution(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Intelligence");
                characterDetails.setIntelligence(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Charisma");
                characterDetails.setCharisma(stringToNumb(System.console().readLine()));

                System.out.println("input your Roll for Wisdom");
                characterDetails.setWisdom(stringToNumb(System.console().readLine()));
            }**/

        }
    }

    private int numberOfPlayers(String x){
        int numPlayer;
        if(x.equals(campaign)){
            System.out.println("Enter the number of players (1 - 10)");
            String numPlayerStr = System.console().readLine();
            return stringToNumb(numPlayerStr);
        } else {
            numPlayer = 1;
        }
        return numPlayer;
    }

    private int stringToNumb(String str){
        int x = switch (str) {
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "11" -> 11;
            case "12" -> 12;
            case "13" -> 13;
            case "14" -> 14;
            case "15" -> 15;
            case "16" -> 16;
            case "17" -> 17;
            case "18" -> 18;
            case "19" -> 19;
            case "20" -> 20;
            default -> 0;
        };

        return x;
    }


}
