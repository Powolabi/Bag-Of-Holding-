package edu.bsu.cs222;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class menu {

    static String newCharacter = "new";
    static String savedCharacter = "saved";
    private static final File characterFolder = new File("src\\main\\resources\\");
    private static final File[] listOfNames = characterFolder.listFiles();
    private static final Scanner sc = new Scanner(System.in);
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
                String fileName = getSavedCharacterName(choice);
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
        String input;
        while(true){
            System.out.println("\nWhat would you like to do next?");
            input = sc.nextLine();
            switch(input){
                case "menu":{
                    start();
                }
                case "stats":{
                    System.out.println("Strength: " + characterDetails.getStrength());
                    System.out.println("Dexterity: " + characterDetails.getDexterity());
                    System.out.println("Constitution: " + characterDetails.getConstitution());
                    System.out.println("Intelligence: " + characterDetails.getIntelligence());
                    System.out.println("Charisma: " + characterDetails.getCharisma());
                    System.out.println("Wisdom: " + characterDetails.getWisdom());
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

    private static void createCharacter() {
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

        }
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
        characterDetails details = new characterDetails(name, race, charClass, align, level, armorClass, hitPoints, str, dex, con, intel, charis, wis);
        saveToFile.writeNewPlayerCharacter(details);
    }

    private static void displayCharacters(){
        System.out.println("Characters: ");
        for(int i = 0; i < Objects.requireNonNull(listOfNames).length; i++){
            if (!listOfNames[i].getName().equals("testFile.txt")) {
                System.out.println((i + 1) + ". " + listOfNames[i].getName());
            }
        }
    }

    private static String getSavedCharacterName(int choice){
        if(choice < 1 || choice > Objects.requireNonNull(listOfNames).length + 1) {
            return null;
        } else {
            return listOfNames[choice - 1].getName();
        }
    }

    private static int chooseCharacter(){
        displayCharacters();
        System.out.println("Enter the number of the character you would like to access:");
        return Integer.parseInt(sc.nextLine());
        }


    public static void main(String[] args) throws FileNotFoundException {
        start();
    }
}
