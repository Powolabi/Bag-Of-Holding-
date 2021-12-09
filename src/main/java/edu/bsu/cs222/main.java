package edu.bsu.cs222;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class main {

    static String newCharacter = "new";
    static String savedCharacter = "saved";

    public static void start(){
        Scanner sc = new Scanner(System.in);
        int playerCount;
        System.out.println("Bag of Holding\n");

        System.out.println(newCharacter + " | " +  savedCharacter + "\n");
        String input = sc.nextLine();

        if (Objects.equals(input, newCharacter)){
            createCharacter();
        } else if (Objects.equals(input, savedCharacter)){
            savedFiles();
        } else {
            System.out.println("err: input incorrect");
            start();
        }
    }

    public static void createCharacter(){
        Scanner input = new Scanner(System.in);
        String name, race, align, level, charClass, armorClass, hitPoints, check;
        String str, dex, con, intel, charis, wis;

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

        System.out.println("Enter your character's armor:");
        armorClass = input.nextLine();

        System.out.println("Enter your character's hit points:");
        hitPoints = input.nextLine();

        System.out.println("Want us to roll your stats for you? you just organize them");
        System.out.println("y/n");
        check = input.nextLine();

        if(Objects.equals(check, "n")){
            int[] score = new int[6];
            for(int j = 0; j < 6; j++){
                score[j] = randomRoll.generateAbilityScore();
                System.out.println("" + score[j]);
            }

            System.out.println("Input the stats in the order you'd like");

            System.out.println("input your Roll for Strength");
            str = input.nextLine();

            System.out.println("input your Roll for Dexterity");
            dex = input.nextLine();

            System.out.println("input your Roll for Constitution");
            con = input.nextLine();

            System.out.println("input your Roll for Intelligence");
            intel = input.nextLine();

            System.out.println("input your Roll for Charisma");
            charis = input.nextLine();

            System.out.println("input your Roll for Wisdom");
            wis = input.nextLine();

        } else {
            System.out.println("input your Roll for Strength");
            str = input.nextLine();

            System.out.println("input your Roll for Dexterity");
            dex = input.nextLine();

            System.out.println("input your Roll for Constitution");
            con = input.nextLine();

            System.out.println("input your Roll for Intelligence");
            intel = input.nextLine();

            System.out.println("input your Roll for Charisma");
            charis = input.nextLine();

            System.out.println("input your Roll for Wisdom");
            wis = input.nextLine();
        }
        characterDetails details = new characterDetails(name, race, charClass, align, level, armorClass, hitPoints, str, dex, con, intel, charis, wis);
        saveToFile.writeNewPlayerCharacter(details);
    }

    public static void savedFiles(){
        System.out.println("Characters: ");

        File character = new File("src\\main\\resources\\characters\\");
        File[] listOfNames = character.listFiles();

        for(int i = 0; i < listOfNames.length; i++){
            System.out.println(listOfNames[i]);
        }
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
