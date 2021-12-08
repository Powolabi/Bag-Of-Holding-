package edu.bsu.cs222;

public class characterDetails {
    public static String name;
    public static String race;
    public static String alignment;
    public static String characterClass;
    public static String  hitPoints;
    public static String armorClass;
    public static String speed;
    public static String level;
    public static int Strength;
    public static int Dexterity;
    public static int Constitution;
    public static int Intelligence;
    public static int Wisdom;
    public static int Charisma;

    public characterDetails(String text, String text1, String text2, String text3, String parseInt3) {
        characterDetails.name = text;
        characterDetails.race = text1;
        characterDetails.characterClass = text2;
        characterDetails.alignment = text3;
        characterDetails.level = parseInt3;
    }

    public String getName()
    {
        return name;
    }

    public String getRace()
    {
        return race;
    }

    public String getAlignment()
    {
        return alignment;
    }

    public String getCharacterClass()
    {
        return characterClass;
    }

    public String getLevel()
    {
        return level;
    }

    public static void setStrength(int strength) {
        Strength = strength;
    }

    public static void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public static void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public static void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public static void setWisdom(int wisdom) { Wisdom = wisdom; }

    public static void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public static int getStrength() {
        return Strength;
    }

    public static int getDexterity() {
        return Dexterity;
    }

    public static int getConstitution() {
        return Constitution;
    }

    public static int getIntelligence() {
        return Intelligence;
    }

    public static int getWisdom() {
        return Wisdom;
    }

    public static int getCharisma() {
        return Charisma;
    }
}
