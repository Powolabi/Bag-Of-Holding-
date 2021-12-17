package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class main {

    static String newCharacter = "new";
    static String savedCharacter = "saved";
    private static File characterFolder = new File("src\\main\\resources\\");
    private static File[] listOfNames = characterFolder.listFiles();
    private static Scanner sc = new Scanner(System.in);
    private static String fileName;
    private static characterDetails details;


    private static void start() throws FileNotFoundException {
        boolean start = true;

        while(start){
            System.out.println("Bag of Holding\n");
            System.out.println(newCharacter + " | " +  savedCharacter +  " | " + "quit\n");
            String input = sc.nextLine();

            if (Objects.equals(input, newCharacter)){
                createCharacter();
                start = false;
            } else if (Objects.equals(input, savedCharacter)){
                int choice = chooseCharacter();
                fileName = getSavedCharacterName(choice);
                if(fileName != null){
                    details = pullFromFile.getFileData(fileName);
                    displayCharacterDetails();
                    start = false;
                }else {
                    System.out.println("err: input incorrect");
                }
            } else if (Objects.equals(input, "quit")) {
                System.out.println("...Have a nice adventure!");
                System.exit(0);
            } else {
                System.out.println("err: input incorrect");
            }
        }
        commands();
    }
    // after character created
    private static void commands() throws FileNotFoundException {
        boolean kill = false;
        String input;
        while(kill == false){
            System.out.println("\nWhat would you like to do next?");
            input = sc.nextLine();
            switch(input){
                case "menu":{
                    start();
                }
                case "stats":{
                    System.out.println("Strength: " + details.getStrength());
                    System.out.println("Dexterity: " + details.getDexterity());
                    System.out.println("Constitution: " + details.getConstitution());
                    System.out.println("Intelligence: " + details.getIntelligence());
                    System.out.println("Charisma: " + details.getCharisma());
                    System.out.println("Wisdom: " + details.getWisdom());
                }
                break;
                case "roll":{
                    System.out.println("Roll Options:\nd4\nd6\nd8\nd10\nd12\nd20\n");
                    System.out.println("Choose Your Die:");
                    input = sc.nextLine();
                    switch (input) {
                        case "d4" -> System.out.println(randomRoll.rollOfFour());
                        case "d6" -> System.out.println(randomRoll.rollOfSix());
                        case "d8" -> System.out.println(randomRoll.rollOfEight());
                        case "d10" -> System.out.println(randomRoll.rollOfTen());
                        case "d12" -> System.out.println(randomRoll.rollOfTwelve());
                        case "d20" -> System.out.println(randomRoll.rollOfTwenty());
                        default -> System.out.println("err: Invalid Input");
                    }
                    break;
                }
                case "quit":
                    kill = true;
                    System.out.println("...Have a nice Adventure!");
                    System.exit(0);
                default:
                    System.out.println("err: Invalid Input");
                    break;
            }
        }
    }

    private static void displayCharacterDetails(){
        System.out.println("Name: " + details.getName());
        System.out.println("Race: " + details.getRace());
        System.out.println("Class: " + details.getCharacterClass());
        System.out.println("Level: " + details.getLevel());
        System.out.println("Alignment: " + details.getAlignment());
        System.out.println("Hit Points: " + details.getHitPoints());
        System.out.println("Armor Class: " + details.getArmor());
    }

    private static void createCharacter() throws FileNotFoundException {
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
            return listOfNames[choice - 1].getName().toString();
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
    public static void main(String[] args) throws FileNotFoundException {
        start();
    }
}
