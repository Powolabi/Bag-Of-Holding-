package edu.bsu.cs222;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class main {

    static String newCharacter = "new";
    static String savedCharacter = "saved";
    private static File characterFolder = new File("src\\main\\resources\\characters\\");
    private static File[] listOfNames = characterFolder.listFiles();
    private static Scanner sc = new Scanner(System.in);
    private static String fileName;


    private static void start(){

        System.out.println("Bag of Holding\n");

        System.out.println(newCharacter + " | " +  savedCharacter +  " | " + "quit\n");
        String input = sc.nextLine();

        if (Objects.equals(input, newCharacter)){
            createCharacter();
        } else if (Objects.equals(input, savedCharacter)){
            int choice = chooseCharacter();
            fileName = getSavedCharacterName(choice);
            if(fileName != null){
                pullFromFile.getFileData(fileName);
            }else {
                System.out.println("err: input incorrect");
                start();
            }
            commands();
        } else if (Objects.equals(input, "quit")) {
            System.exit(0);
        } else {
            System.out.println("err: input incorrect");
            start();
        }
    }
    // after character created
    private static void commands(){
        boolean kill = false;
        String input;
        while(kill){
            input = sc.nextLine();
            switch(input){
                case "menu":{
                    start();
                }
                case "stats":{
                    pullFromFile.getFileData(fileName);
                    System.out.println(characterDetails.getStrength());
                    System.out.println(characterDetails.getDexterity());
                    System.out.println(characterDetails.getConstitution());
                    System.out.println(characterDetails.getIntelligence());
                    System.out.println(characterDetails.getCharisma());
                    System.out.println(characterDetails.getWisdom());
                    System.out.println(characterDetails.getArmorClass());
                    System.out.println();
                }
                break;
                case "roll":{
                    System.out.println("Roll Options:\nd4\nd6\nd8\nd10\nd12\nd20\n");
                    System.out.println("Choose Your Die:");
                    switch (input) {
                        case "d4" -> randomRoll.rollOfFour();
                        case "d6" -> randomRoll.rollOfSix();
                        case "d8" -> randomRoll.rollOfEight();
                        case "d10" -> randomRoll.rollOfTen();
                        case "d12" -> randomRoll.rollOfTwelve();
                        case "d20" -> randomRoll.rollOfTwenty();
                    }
                    break;
                }
                case "modifiers":{
                    abilityScoreModifier.setCharMod();
                    abilityScoreModifier.setConMod();
                    abilityScoreModifier.setDexMod();
                    abilityScoreModifier.setIntMod();
                    abilityScoreModifier.setWisMod();
                    abilityScoreModifier.setStrMod();

                    System.out.println("STR MOD: " + abilityScoreModifier.getStrMod());
                    System.out.println("DEX MOD: " + abilityScoreModifier.getDexMod());
                    System.out.println("CON MOD: " + abilityScoreModifier.getConMod());
                    System.out.println("INT MOD: " + abilityScoreModifier.getIntMod());
                    System.out.println("CHAR MOD: " + abilityScoreModifier.getCharMod());
                    System.out.println("WIS MOD: " + abilityScoreModifier.getWisMod());
                }
                break;
                case "quit":
                    kill = true;
                    System.out.println("...Have a nice Adventure!");
                default:
                    break;
            }
        }
    }

    private void displayRollOptions(){}

    private static void createCharacter(){
        String name, race, align, level, charClass, armorClass, hitPoints, check;
        String str, dex, con, intel, charis, wis;

        System.out.println("Character Creation\n");

        System.out.println("Enter your character's name:");
        name = sc.nextLine();

        System.out.println("Enter your character's class:");
        charClass = sc.nextLine();

        System.out.println("Enter your character's race:");
        race = sc.nextLine();

        System.out.println("Enter your character's alignment:");
        align = sc.nextLine();

        System.out.println("Enter your character's level:");
        level = sc.nextLine();

        System.out.println("Enter your character's armor:");
        armorClass = sc.nextLine();

        System.out.println("Enter your character's hit points:");
        hitPoints = sc.nextLine();

        System.out.println("Want us to roll your stats for you? you just organize them");
        System.out.println("y/n");
        check = sc.nextLine();

        if(Objects.equals(check, "y")){
            int[] score = new int[6];
            for(int j = 0; j < 6; j++){
                score[j] = randomRoll.generateAbilityScore();
                System.out.println("" + score[j]);
            }

            System.out.println("Input the stats in the order you'd like");

            System.out.println("input your Roll for Strength");
            str = sc.nextLine();

            System.out.println("input your Roll for Dexterity");
            dex = sc.nextLine();

            System.out.println("input your Roll for Constitution");
            con = sc.nextLine();

            System.out.println("input your Roll for Intelligence");
            intel = sc.nextLine();

            System.out.println("input your Roll for Charisma");
            charis = sc.nextLine();

            System.out.println("input your Roll for Wisdom");
            wis = sc.nextLine();

        } else {
            System.out.println("input your Roll for Strength");
            str = sc.nextLine();

            System.out.println("input your Roll for Dexterity");
            dex = sc.nextLine();

            System.out.println("input your Roll for Constitution");
            con = sc.nextLine();

            System.out.println("input your Roll for Intelligence");
            intel = sc.nextLine();

            System.out.println("input your Roll for Charisma");
            charis = sc.nextLine();

            System.out.println("input your Roll for Wisdom");
            wis = sc.nextLine();
        }
        characterDetails details = new characterDetails(name, race, charClass, align, level, armorClass, hitPoints, str, dex, con, intel, charis, wis);
        saveToFile.writeNewPlayerCharacter(details);
        start();
    }

    private static void displayCharacters(){
        System.out.println("Characters: ");
        for(int i = 0; i < listOfNames.length; i++){
            System.out.println((i+1) + ". " + listOfNames[i].getName());
        }
    }

    private static String getSavedCharacterName(int choice){
        if(choice < 1 || choice > listOfNames.length + 1) {
            return null;
        } else {
            return listOfNames[choice - 1].toString();
        }
    }

    private static int chooseCharacter(){
        displayCharacters();
        System.out.println("Enter the number of the character you would like to access:");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
        }

    public static int stringToNumb(String str){

        return switch (str) {
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
            case "21" -> 21;
            case "22" -> 22;
            case "23" -> 23;
            case "24" -> 24;
            case "25" -> 25;
            case "26" -> 26;
            case "27" -> 27;
            case "28" -> 28;
            case "29" -> 29;
            case "30" -> 30;
            default -> 0;
        };
    }
    public static void main(String[] args) {
        start();
    }
}
